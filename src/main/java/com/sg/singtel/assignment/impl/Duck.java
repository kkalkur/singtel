package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.Quack;
import com.sg.singtel.assignment.behaviour.SwimmingDuck;
import com.sg.singtel.assignment.interfaces.SingingBehavior;
import com.sg.singtel.assignment.interfaces.SwimBehaviour;

public class Duck  extends Bird {

	private SwimBehaviour swimBehaviour;
	private SingingBehavior singBehaviour;
	
	
	
	public Duck() {
		swimBehaviour = new SwimmingDuck();
		singBehaviour = new Quack();
	}

	public String sing(){
		return singBehaviour.sing();
	}
	
	public String swim(){
		return swimBehaviour.swim();
	}
}
