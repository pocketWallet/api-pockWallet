package io.github.pocketwallet.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RepositoryRestResource(collectionResourceRel = "expence", path = "expence")
public class Expence {
	
	@Id
	private String id;
	
	private String label;
	private float price;

}
