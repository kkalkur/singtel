package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.behaviour.ParraotSingWIthDog;
import com.sg.singtel.assignment.behaviour.ParraotSingWithRooster;
import com.sg.singtel.assignment.behaviour.ParrotSingWithCat;
import com.sg.singtel.assignment.impl.Duck;
import com.sg.singtel.assignment.impl.Parrot;

public class ParrotTest {
	
	private Parrot testParrot;
	 public static final String DEFAULT_SING_EXPECTED_RESULT = "Silent";
	 public static final String DOG_PARROT_SING_EXPECTED_RESULT = "Woof, woof";
	 public static final String CAT_PARROT_SING_EXPECTED_RESULT = "Meow";
	 public static final String ROOSTER_PARROT_SING_EXPECTED_RESULT = "Cock-a-doodle-doo";
	
	@Before
	public void setUP(){
		testParrot = new Parrot();
	}
	
	
 @Test
 public void test_Dog_Parrot_Singling(){
	 testParrot.setSingBehaviour(new ParraotSingWIthDog());
 	String singResult = testParrot.sing();	
 	assertEquals("Sucess",DOG_PARROT_SING_EXPECTED_RESULT,singResult);
 	
 }
 
 
	
@Test
public void test_cat_Parrot_Singling(){
	 testParrot.setSingBehaviour(new ParrotSingWithCat());
	String singResult = testParrot.sing();
	assertEquals("Sucess",CAT_PARROT_SING_EXPECTED_RESULT,singResult);
	
}



@Test
public void test_rooster_Parrot_Singling(){
	 testParrot.setSingBehaviour(new ParraotSingWithRooster());
	String singResult = testParrot.sing();
	assertEquals("Sucess",ROOSTER_PARROT_SING_EXPECTED_RESULT,singResult);
	
}



 
 
 
}
