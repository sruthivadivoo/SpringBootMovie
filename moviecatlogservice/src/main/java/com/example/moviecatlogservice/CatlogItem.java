package com.example.moviecatlogservice;

public class CatlogItem {
String name;
String desc;
int rating;

public CatlogItem(String name, String desc, int rating) {
	super();
	this.name = name;
	this.desc = desc;
	this.rating = rating;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}

}
