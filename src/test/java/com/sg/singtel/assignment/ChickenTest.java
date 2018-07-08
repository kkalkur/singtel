package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.impl.Chicken;

public class ChickenTest {
	
	private Chicken testChicken;
	 public static final String SING_EXPECTED_RESULT = "Cluck, cluck";
	 public static final String FLY_EXPECTED_RESULT = "Can not Fly";
	
	@Before
	public void setUP(){
		testChicken = new Chicken();
	}
	
	
   @Test
   public void testChickenSingling(){
   	String singResult = testChicken.sing();
   	assertEquals("Sucess",SING_EXPECTED_RESULT,singResult);
   	
   }
   
   
   @Test
   public void testChicken_FlyBehaviour(){
   	String flyResult = testChicken.fly();
   	assertEquals("Sucess",FLY_EXPECTED_RESULT,flyResult);
   	
   }


}
