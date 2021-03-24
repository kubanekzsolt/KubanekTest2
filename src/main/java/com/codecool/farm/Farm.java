package com.codecool.farm;

import java.util.List;
import java.util.stream.Collectors;

import com.codecool.farm.animal.Animal;

class Farm {

	private List<Animal> animals;

	public Farm(List<Animal> animals) {
		this.animals = animals;
	}
	
	public void feedAnimals() {
		animals.stream().forEach(a -> a.feed());
	}
	
	public void butcher(Butcher butcher) {
		animals = animals.stream()
			.filter(a -> !butcher.canButcher(a))
			.collect(Collectors.toList());
	}
	
	public boolean isEmpty() {
		return animals.size() == 0;
	}
	
	public List<String> getStatus() {
		return animals.stream()
				.map(a -> "There is a " + a.getSize() + " sized " + a.getType() + " in the farm.")
				.collect(Collectors.toList());
	}

	public List<Animal> getAnimals() {
		return animals;
	}
}
