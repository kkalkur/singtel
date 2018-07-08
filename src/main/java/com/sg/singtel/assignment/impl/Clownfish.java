package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.interfaces.Animalbehaviour;

public class Clownfish extends Fish  {
	
	public static final String JOKES_RESULT="My job is making people laugh";
	
	public Clownfish() {
		this.Color = Color.ORANGE;
		this.Size= Size.SMALL;
	}
	
	public void makeJokes(){
		System.out.println(JOKES_RESULT);
		
	}

	

}
