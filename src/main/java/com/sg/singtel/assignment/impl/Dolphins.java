package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.SwimmingFish;
import com.sg.singtel.assignment.interfaces.SwimBehaviour;

public class Dolphins extends Animal {
	
	private SwimBehaviour swimingBehaviour;

	public Dolphins() {
		swimingBehaviour = new SwimmingFish();
	}
	
	public String swim() {	
		return swimingBehaviour.swim();
	}

}
