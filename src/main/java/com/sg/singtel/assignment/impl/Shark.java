package com.sg.singtel.assignment.impl;

public class Shark extends Fish {

	public static final String EAT_RESULT="Can eat other Fish";
	public Shark() {
		this.Color = Color.GREY;
		this.Size= Size.LARGE;
	}
	
	public void eat(Fish fish){
		System.out.println(EAT_RESULT);
	}
	
	

}
