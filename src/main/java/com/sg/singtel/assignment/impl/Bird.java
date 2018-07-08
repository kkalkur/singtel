package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.FlyingBird;
import com.sg.singtel.assignment.behaviour.SingingBird;
import com.sg.singtel.assignment.behaviour.WalkingAnimal;
import com.sg.singtel.assignment.interfaces.Animalbehaviour;
import com.sg.singtel.assignment.interfaces.FlyBehaviour;
import com.sg.singtel.assignment.interfaces.SingingBehavior;
import com.sg.singtel.assignment.interfaces.WalkBehaviour;

public class Bird extends Animal implements Animalbehaviour  {
	// Injecting different behavior during the Object creation 
	// Program for Interface
	// Favor composition over inheritance
	
	protected SingingBehavior singBehaviour;
	private WalkBehaviour walkBehaviour;
	private FlyBehaviour flybehaviour;

	

	public Bird() {
		singBehaviour =new SingingBird();
		walkBehaviour =   new WalkingAnimal();
		flybehaviour = new FlyingBird();
	}
	
	public void walk(){
		walkBehaviour.walk();
	}
	public String fly() {
		return flybehaviour.fly();
	}
	
	public String sing(){
		return singBehaviour.sing();
	}

	
	
	// Only Singing behavior can be changed for Parrots 
	public SingingBehavior getSingBehaviour() {
		return singBehaviour;
	}
	
	public void setSingBehaviour(SingingBehavior singBehaviour) {
		this.singBehaviour = singBehaviour;
	}

	@Override
	public boolean canFly() {
		return flybehaviour.canFly();
	}

	@Override
	public boolean canwalk() {
		return this.walkBehaviour.canWalk();
	}

	@Override
	public boolean canSing() {
		return this.singBehaviour.canSing();
		}

	
	

}
