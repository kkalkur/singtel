package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.FlyingBird;
import com.sg.singtel.assignment.interfaces.Animalbehaviour;
import com.sg.singtel.assignment.interfaces.FlyBehaviour;

public class ButterFly extends Animal {
	
	private FlyBehaviour flyBehaviour;

	public ButterFly() {
		
		this.flyBehaviour = new FlyingBird();
	}
	
	
	public String fly() {
		return flyBehaviour.fly();
	}


	

}
