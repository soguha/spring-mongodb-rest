package com.example.demo.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Pets;

public interface PetsRepository extends MongoRepository<Pets, String> {
	
	Pets findBy_id(ObjectId _id);

}
/*The name of this repository is extremely important as it tell the MongoDB the collection it will be
querying. This interface will be extending the MongoRepository class which already contains generic methods
like save(for creating/updating documents) and delete(for removing documents) but we need to specify additional methods by ourself
We can use Spring Boot's  repository naming conventions and the MongoRepository will intelligently construct the queries at runtime.*/