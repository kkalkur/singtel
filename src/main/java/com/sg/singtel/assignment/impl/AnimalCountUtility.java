package com.sg.singtel.assignment.impl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnimalCountUtility {
	
	public static void main(String[] args){
		
		
		
	}
	
	
	public  static long totalFlyingAnimal(Animal[] input){		
		List<Animal> list = Arrays.asList(input); 	
		Predicate <Animal> predicate = element -> element.canFly();
		long i =  list.stream().filter(predicate).count();
		return i;
      }
	
	public static long totalwalkingAnmimals(Animal[] input){		
		List<Animal> list = Arrays.asList(input); 	
		Predicate <Animal> predicate = element -> element.canwalk();
		long i =  list.stream().filter(predicate).count();
		return i;
      }
	
	public static long totalSingingAnimals(Animal[] input){		
		List<Animal> list = Arrays.asList(input); 	
		Predicate <Animal> predicate = element -> element.canSing();
		long i =  list.stream().filter(predicate).count();
		return i;
      }
	
	public static long totalSwimmingAnimals(Animal[] input){		
		List<Animal> list = Arrays.asList(input); 	
		Predicate <Animal> predicate = element -> element.canSwim();
		long i =  list.stream().filter(predicate).count();
		return i;
      }

}
