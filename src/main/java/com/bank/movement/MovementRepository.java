package com.bank.movement;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovementRepository extends MongoRepository<Movement, String> {

}
