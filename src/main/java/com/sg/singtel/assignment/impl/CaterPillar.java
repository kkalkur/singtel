package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.WalkingAnimal;
import com.sg.singtel.assignment.interfaces.Animalbehaviour;
import com.sg.singtel.assignment.interfaces.WalkBehaviour;

public class CaterPillar extends Animal  {
	
	private WalkBehaviour walkBehaviour;

	public CaterPillar() {
		this.walkBehaviour = new WalkingAnimal();
	}
	
	public String performWalk(){
		return walkBehaviour.walk();
		
	}

	

}
