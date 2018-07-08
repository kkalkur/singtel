package com.sg.singtel.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sg.singtel.assignment.impl.Animal;
import com.sg.singtel.assignment.impl.AnimalCountUtility;
import com.sg.singtel.assignment.impl.Bird;
import com.sg.singtel.assignment.impl.ButterFly;
import com.sg.singtel.assignment.impl.Cat;
import com.sg.singtel.assignment.impl.Chicken;
import com.sg.singtel.assignment.impl.Clownfish;
import com.sg.singtel.assignment.impl.Dog;
import com.sg.singtel.assignment.impl.Dolphins;
import com.sg.singtel.assignment.impl.Duck;
import com.sg.singtel.assignment.impl.Fish;
import com.sg.singtel.assignment.impl.Frog;
import com.sg.singtel.assignment.impl.Parrot;
import com.sg.singtel.assignment.impl.Rooster;
import com.sg.singtel.assignment.impl.Shark;

public class AnimalCountTest {
	
	
	private Animal[] testAnimals;
	public static final long FLY_ANIMAL_COUNT=5;
	public static final long WALK_ANIMAL_COUNT=7;
	public static final long SING_ANIMAL_COUNT=5;
	public static final long SWIM_ANIMAL_COUNT=5;
	
	@Before
	public void setUP(){
		testAnimals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphins(),
				new Frog(),
				new Dog(),
				new ButterFly(),
				new Cat()
				};
	}

	
	
    @Test
    public void test_count_animalThatCanFly(){
    	long count = AnimalCountUtility.totalFlyingAnimal(testAnimals);
    	assertEquals("Sucesss",FLY_ANIMAL_COUNT,count);
    	
    }
    
    
    @Test
    public void test_count_animalThatCanWalk(){
    	long count = AnimalCountUtility.totalwalkingAnmimals(testAnimals);
    	assertEquals("Sucesss",WALK_ANIMAL_COUNT,count);
    	
    }
    
    
   @Test
    public void test_count_animalThatCanSing(){
    	long count = AnimalCountUtility.totalFlyingAnimal(testAnimals);
    	assertEquals("Sucesss",SING_ANIMAL_COUNT,count);
    	
    }
    
    @Test
    public void test_count_animalThatCanSwim(){
    	long count = AnimalCountUtility.totalFlyingAnimal(testAnimals);
    	assertEquals("Sucesss",SWIM_ANIMAL_COUNT,count);
    	
    }
    
    

}
