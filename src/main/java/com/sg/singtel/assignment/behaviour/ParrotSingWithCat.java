package com.sg.singtel.assignment.behaviour;

import com.sg.singtel.assignment.interfaces.SingingBehavior;

public class ParrotSingWithCat  implements SingingBehavior{

	 public static final String SING_RESULT = "Meow";
	
	@Override
	public String sing() {
		System.out.println(SING_RESULT);
		return SING_RESULT;
		
	}

	@Override
	public boolean canSing() {
		return true;
	}


}
