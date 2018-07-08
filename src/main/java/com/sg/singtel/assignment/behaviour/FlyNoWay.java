package com.sg.singtel.assignment.behaviour;

import com.sg.singtel.assignment.interfaces.FlyBehaviour;

public class FlyNoWay  implements FlyBehaviour {

	 public static final String FLYING_RESULT = "Can not Fly";
	@Override
	public String fly() {
		System.out.println(FLYING_RESULT);
		return FLYING_RESULT;
		
	}
	@Override
	public boolean canFly() {
		return true;
	}

}
