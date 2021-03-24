package com.codecool.farm.animal;

public class Pig extends Animal {

	@Override
	public void feed() {
		size++;
	}

	@Override
	public String getType() {
		return "pig";
	}
}
