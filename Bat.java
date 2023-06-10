package com.coreassignment.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Whoosh! Whoosh!");
		energyLevel -= 50;
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Bat eats a human. Yum, yum.");
		energyLevel += 25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("Let the bodys hit the floor.");
		energyLevel -= 100;
		displayEnergy();
	}
}
