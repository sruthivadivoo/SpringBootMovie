package com.example.ratingdataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rating")
public class Ratingdataservicecontroller {

@RequestMapping("users/{userId}")
public UserRating getUserRating(@PathVariable("userId")String userId) {
	List<Rating> ratings=Arrays.asList(
			new Rating("23",4)
			);
	UserRating userRating=new UserRating();
	userRating.setUserRating(ratings);
	return userRating;
}
}
