package com.example.MongoDemo.MongoDemo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.MongoDemo.MongoDemo.Entity.MongoEntity1;

public interface MongoRepo extends MongoRepository<MongoEntity1, Integer> {

}
