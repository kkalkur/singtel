package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.sg.singtel.assignment.behaviour.FlyingBird;
import com.sg.singtel.assignment.behaviour.SingingBird;
import com.sg.singtel.assignment.behaviour.WalkingAnimal;
import com.sg.singtel.assignment.impl.Bird;
public class BirdTest {
	
	private Bird testBird;
	public static final String SING_RESULT = "I am singing";
	
	@Before
	public void setUP(){
		testBird = new Bird();
	}

	
	
    @Test
    public void test_Bird_Singling_behaviour(){
    	String singResult = testBird.sing();
    	assertEquals("Sucess",SING_RESULT,singResult);	
    }


}
