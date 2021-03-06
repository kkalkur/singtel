# Git Repo General Instruction

### Pre requisite
- Java 8 needs to present in the system
---
### How to Clone the repo and Build the Project
-  How to clone the repo -  Run the following command

`git clone https://github.com/kkalkur/singtel.git`


- To build the project use the following command
`gradlew clean build`


- To import the Project in eclipse first run the following command 


`gradlew eclispe`

-  Import the project in eclipse as gradle project

----

### Run the Test cases 
I have written a test cases for all the 4 Assignment 
To test each of the assignment Problem runt the following test cases 

1. **BirdTest** for Assignment A 1st Problem
1. **DuckTest** and Chicken Test for Assignment A 2 nd Problem
1. **RoosterTest** for Assignment A 3 rd Problem
1. **ParrotTest** for Assignment A 4 th Problem
1. **FishTest** for Assignment B 1st th Problem
1. **SharkTest** for Assignment B 2 nd Problem
1. **DolohinTest** for Assignment B 3 nd Problem
1. **ButterflyTest** for  Assignment D 1 st Problem
1. **Animal CountTest** for Assignment E Oroblem



## The design principle's used to solve these problems
1. Program for Interface
1. Favor composition over inheritance 
1. Strategy design Pattern is used extensively 

 ---
The following class diagram explains the over all design 

![alt text](https://github.com/kkalkur/singtel/blob/master/AnimalClassDiagram1.jpg "Logo Title Text 1")

All the behaviors of animals such as FlyBehaviour, SingBehaviour  are separated and **capsulated** into a separate interface . 

There will be concrete implementation of each Behaviors such as FlyingBird or FlyNoWay for each of the FlyBehaviour. 


Each Animal will have composed of many of the behaviors .
 We have encapsulated behavior which varies per Animal into a separate class and each Animal is composing the various behavior .

During the creation of the Objects each behavior can be injected into the Animal .  For example

```
 public Bird() {

		singBehaviour =new SingingBird();
		walkBehaviour =   new WalkingAnimal();
		flybehaviour = new FlyingBird();
	}
```


This can be done by a Dependency Injection framework as well .  

 Here we are Favoring **composition**  over inheritance .

 This gives us lots of flexibility at runtime . 

We can change the behavior of the Animal by injecting a new behavior .

### How did I implement various Parrots 
In case of Parrot we do not need to create new **Specialize Parrots Class**  for various singing behavior we can simply **create a new singing behavior** and inject into existing Parrot class 

---

The following class Diagram shows the Behavior Hierarchy 


![alt text](https://github.com/kkalkur/singtel/blob/master/Behaviour.jpg "Logo Title Text 1")







