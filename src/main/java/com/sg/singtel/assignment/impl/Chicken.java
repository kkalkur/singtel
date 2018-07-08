package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.Cluck;
import com.sg.singtel.assignment.behaviour.FlyNoWay;
import com.sg.singtel.assignment.interfaces.Animalbehaviour;
import com.sg.singtel.assignment.interfaces.FlyBehaviour;
import com.sg.singtel.assignment.interfaces.SingingBehavior;

public class Chicken  extends Bird {

	private FlyBehaviour flyBehaviour;
	private SingingBehavior singBehaviour;
	
	public Chicken() {
		flyBehaviour = new FlyNoWay();
		singBehaviour = new Cluck();
	}
	
	public String fly(){
		return flyBehaviour.fly();
	}
	
	public String sing(){
		return singBehaviour.sing();
	}
}
