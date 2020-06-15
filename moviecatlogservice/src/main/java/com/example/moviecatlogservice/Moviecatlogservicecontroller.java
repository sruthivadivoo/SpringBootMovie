package com.example.moviecatlogservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.discovery.DiscoveryClient;


@RestController
@RequestMapping("catlog")
public class Moviecatlogservicecontroller {
	@Autowired
	private RestTemplate resttemplate;


	@Autowired
	private WebClient.Builder webClientBuilder;
	@RequestMapping("{userId}")
	
public List<CatlogItem> getCatlog(@PathVariable("userId")String userId){
	
		UserRating ratings=resttemplate.getForObject("http://ratingdataservice/rating/users/"+userId,UserRating.class);
		
		return ratings.getUserRating().stream().map(rating ->{
		Movie movie=resttemplate.getForObject("http://movieinfoservice/movie/" +rating.getMovieId(), Movie.class);
			return new CatlogItem(movie.getName(),"good",rating.getRating());
		})
				.collect(Collectors.toList());
				
		
	
}
}
