package com.sg.singtel.assignment.behaviour;

import com.sg.singtel.assignment.interfaces.SingingBehavior;

public class SingingBird implements SingingBehavior{

	 public static final String SING_RESULT = "I am singing";
	
	@Override
	public String sing() {
		System.out.println("I am Singing");
		return SING_RESULT;
		
	}

	@Override
	public boolean canSing() {
	
		return true;
	}

}
