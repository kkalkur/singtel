package com.sg.singtel.assignment.behaviour;

import com.sg.singtel.assignment.interfaces.SingingBehavior;

public class RoosterQuack implements SingingBehavior{

	 public static final String SING_RESULT = "Cock-a-doodle-doo";
	@Override
	public String sing() {
		System.out.println(SING_RESULT);
		return SING_RESULT;
	}
	@Override
	public boolean canSing() {
		// TODO Auto-generated method stub
		return true;
	}


}
