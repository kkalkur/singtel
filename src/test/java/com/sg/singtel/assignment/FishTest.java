package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.impl.Chicken;
import com.sg.singtel.assignment.impl.Fish;

public class FishTest {
	
	private Fish testFish;
	 public static final String SWIM_EXPECTED_RESULT = "Swimming Fish";
	
	@Before
	public void setUP(){
		testFish = new Fish();
	}

  @Test
  public void testFish_SwimBehaviour(){
  	String SwimResult = testFish.swim();
  	assertEquals("Sucess",SWIM_EXPECTED_RESULT,SwimResult);
  	
  }

}
