package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.sg.singtel.assignment.impl.Duck;

public class DuckTest {
	private Duck testDuck;
	 public static final String SING_EXPECTED_RESULT = "Quack quack";
	 public static final String SWIM_EXPECTED_RESULT = "Swimming Duck";
	
	@Before
	public void setUP(){
		testDuck = new Duck();
	}
	
	
  @Test
  public void testChickenSingling(){
  	String singResult = testDuck.sing();
  	assertEquals("Sucess",SING_EXPECTED_RESULT,singResult);
  	
  }
  
  
  @Test
  public void testChicken_SwimBehaviour(){
  	String singResult = testDuck.swim();
  	assertEquals("Sucess",SWIM_EXPECTED_RESULT,singResult);
  	
  }

}
