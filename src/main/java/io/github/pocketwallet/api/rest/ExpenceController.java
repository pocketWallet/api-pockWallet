package io.github.pocketwallet.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.github.pocketwallet.api.model.Expence;
import io.github.pocketwallet.api.repository.ExpenceRepository;

//@RestController
public class ExpenceController {
	
	@Autowired
	private ExpenceRepository expenceRepository;
	
	@GetMapping(value = "/expence/{id}")
	public Optional<Expence> expence(@PathVariable(value="id") String id) {
		return expenceRepository.findById(id);
	}
	
	@PostMapping(value = "/expence")
	public Expence expence(@RequestBody Expence expence) {
		return expenceRepository.save(expence);
	}
	
	@GetMapping(value = "/expences")
	public List<Expence> expences() {
		return expenceRepository.findAll();
	}

}
