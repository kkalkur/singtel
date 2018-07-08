package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.impl.ButterFly;
import com.sg.singtel.assignment.impl.Fish;
import com.sg.singtel.assignment.impl.Shark;

public class SharkTest {
	
	private Shark testShark;
	 public static final String SWIM_EXPECTED_RESULT = "Swimming Fish";
	 public static final String EAT_EXPECTED_RESULT = "Can eat other Fish";
	
	@Before
	public void setUP(){
		testShark = new Shark();
	}

@Test
public void testShark_SwimBehaviour(){
	String flyResult = testShark.swim();
	assertEquals("Sucess",SWIM_EXPECTED_RESULT,flyResult);
	
}


@Test
public void testShark_eatBehaviour(){
	String eatResult = testShark.eat(new Fish());
	assertEquals("Sucess",EAT_EXPECTED_RESULT,eatResult);
	
}

}
