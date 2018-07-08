package com.sg.singtel.assignment.impl;

import com.sg.singtel.assignment.enums.Colors;
import com.sg.singtel.assignment.enums.Sizes;
import com.sg.singtel.assignment.interfaces.Animalbehaviour;

public class Animal implements Animalbehaviour {
	
	protected Colors Color;
	protected Sizes Size;
	
	
	public Colors getColor() {
		return Color;
	}
	public void setColor(Colors color) {
		Color = color;
	}
	public Sizes getSize() {
		return Size;
	}
	public void setSize(Sizes size) {
		Size = size;
	}
	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean canwalk() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean canSing() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean canSwim() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
