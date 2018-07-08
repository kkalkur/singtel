package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.behaviour.SingingParrot;
import com.sg.singtel.assignment.enums.Colors;
import com.sg.singtel.assignment.enums.Sizes;

public class Parrot  extends Bird {
	
	
	
	public Parrot() {
		this.setColor(Colors.GREEN);
		this.setSize(Sizes.SMALL);
		this.singBehaviour = new SingingParrot();
	}
	
	
	

}
