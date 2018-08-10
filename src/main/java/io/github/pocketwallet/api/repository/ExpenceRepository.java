package io.github.pocketwallet.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.github.pocketwallet.api.model.Expence;
import io.swagger.annotations.Api;

@Api
@RepositoryRestResource(path = "expences")
public interface ExpenceRepository  extends MongoRepository<Expence, String>{

}
