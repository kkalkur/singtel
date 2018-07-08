package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.impl.Chicken;
import com.sg.singtel.assignment.impl.Rooster;

public class RoosterTest {
	
	private Rooster testRooster;
	 public static final String SING_EXPECTED_RESULT = "Cock-a-doodle-doo";
	 public static final String FLY_EXPECTED_RESULT = "Can not Fly";
	
	@Before
	public void setUP(){
		testRooster = new Rooster();
	}
	
	
  @Test
  public void testChickenSingling(){
  	String singResult = testRooster.sing();
  	assertEquals("Sucess",SING_EXPECTED_RESULT,singResult);
  	
  }
  
  
  @Test
  public void testChicken_FlyBehaviour(){
  	String singResult = testRooster.fly();
  	assertEquals("Sucess",FLY_EXPECTED_RESULT,singResult);
  	
  }

}
