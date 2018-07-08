package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.SwimmingFish;
import com.sg.singtel.assignment.interfaces.Animalbehaviour;
import com.sg.singtel.assignment.interfaces.SwimBehaviour;

public class Fish extends Animal {
	
	private SwimBehaviour swimBehaviour;

	public Fish() {
		swimBehaviour = new SwimmingFish();
	}
	
	public String swim(){
		return swimBehaviour.swim();
	}

	

	@Override
	public boolean canSwim() {
		return this.swimBehaviour.canSwim();
	}
	
	

}
