package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.RoosterQuack;
import com.sg.singtel.assignment.interfaces.SingingBehavior;

public class Rooster extends Animal {

	private SingingBehavior singBehaviour;
	private Chicken chicken;
	
	public Rooster() {
		singBehaviour = new RoosterQuack();
		chicken = new Chicken();
	}
	
	public String fly(){
		return chicken.fly();
	}
	
	public String sing(){
		return singBehaviour.sing();
	}
	
	@Override
	public boolean canwalk() {
		
		return chicken.canwalk();
	}
	@Override
	public boolean canSing() {
		
		return chicken.canSing();
	}
	
	@Override
	public boolean canFly() {
		return chicken.canFly();
		
	}
	

	
}
