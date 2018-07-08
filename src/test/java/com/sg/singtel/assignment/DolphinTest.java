package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.impl.Dolphins;


public class DolphinTest {
	
	private Dolphins testDouphins;
	 public static final String SWIM_EXPECTED_RESULT = "Swimming Fish";
	
	@Before
	public void setUP(){
		testDouphins = new Dolphins();
	}

 @Test
 public void testFish_SwimBehaviour(){
 	String SwimResult = testDouphins.swim();
 	assertEquals("Sucess",SWIM_EXPECTED_RESULT,SwimResult);
 	
 }

}
