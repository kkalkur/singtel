package com.sg.singtel.assignment.behaviour;

import com.sg.singtel.assignment.interfaces.WalkBehaviour;

public class WalkingAnimal  implements WalkBehaviour {

	 public static final String WALKING_RESULT = "I can Walk";
	@Override
	public String walk() {
		System.out.println(WALKING_RESULT);
		return WALKING_RESULT;
		
	}
	@Override
	public boolean canWalk() {
	
		return true;
	}

}
