package io.github.pocketwallet.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.pocketwallet.api.model.Expence;

public interface ExpenceRepository  extends MongoRepository<Expence, String>{

}
