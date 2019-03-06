package com.example.demo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Pets {
	
	/*The @Id annotation tells spring that the _id field will be used as the
	primary identifier. The rest of the class contains the basic constructors, getters,
	setters for the Pets object */
	
	@Id
	public ObjectId _id;
	public String name;
	public String species;
	public String breed;
	
	
	//Constructors
	public Pets() {}
	
	public Pets(ObjectId _id, String name, String species, String breed) {
		
		this._id = _id;
		this.name = name;
		this.species = species;
		this.breed = breed;
		
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
