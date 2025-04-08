package com.example.sender;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderRepo extends MongoRepository<SenderModel,Integer> {
}
