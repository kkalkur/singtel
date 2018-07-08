package com.sg.singtel.assignment.behaviour;

import com.sg.singtel.assignment.interfaces.SwimBehaviour;

public class SwimmingDuck implements SwimBehaviour {
	
	 public static final String SWIMMING_RESULT = "Swimming Duck";
	@Override
	public String swim() {
		System.out.println(SWIMMING_RESULT);
		return SWIMMING_RESULT;
	}
	@Override
	public boolean canSwim() {
		
		return true;
	}

}
