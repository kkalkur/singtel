# Git Repo General Instruction


## The design principle's used to solve these problems
1. Program for Interface
1. Favor composition over inheritance 
1. Strategy design Pattern is used extensively 

 ---
The following class diagram explains the over all design 

![alt text](https://github.com/kkalkur/singtel/blob/master/AnimalClassDiagram.jpg "Logo Title Text 1")

All the behaviors of animals such as FlyBehaviour, SingBehaviour  are separated and **capsulated** into a separate interface . 

There will be concrete implementation of each Behaviors such as FlyingBird or FlyNoWay for each of the FlyBehaviour. 


Each Animal will have composed of many of the behaviors .
 We have encapsulated behavior which varies per Animal into a separate class and each Animal is composing the various behavior .

During the creation of the Objects each behavior can be injected into the Animal . 

This can be done by a Dependency Injection framework as well .  

 Here we are Favoring **composition**  over inheritance .

 This gives us lots of flexibility at runtime . 

We can change the behavior of the Animal by injecting a new behavior .





