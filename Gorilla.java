package com.coreassignment.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwsSomething() {
		System.out.println("Gorilla throws something.");
		energyLevel -= 5;
		displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("Gorilla is satisfied eating a banana.");
		energyLevel += 10;
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("Gorilla climbs a tree.");
		energyLevel -= 10;
		displayEnergy();
	}
}
