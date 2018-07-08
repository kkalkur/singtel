package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.impl.ButterFly;
import com.sg.singtel.assignment.impl.Dolphins;

public class ButterFlyTest {
	
	private ButterFly testButterFlys;
	 public static final String FLY_EXPECTED_RESULT = "I am flying";
	
	@Before
	public void setUP(){
		testButterFlys = new ButterFly();
	}

@Test
public void testButterfuly_FlyBehaviour(){
	String flyResult = testButterFlys.fly();
	assertEquals("Sucess",FLY_EXPECTED_RESULT,flyResult);
	
}

}
