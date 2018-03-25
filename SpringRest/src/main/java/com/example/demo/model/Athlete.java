package com.example.demo.model;

public class Athlete {
	String name;
	String sport;
	double height;
	double weight;
		
	public Athlete() {
		super();
	}
	public Athlete(String name, String sport, double height, double weight) {
		super();
		this.name = name;
		this.sport = sport;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}	
}
