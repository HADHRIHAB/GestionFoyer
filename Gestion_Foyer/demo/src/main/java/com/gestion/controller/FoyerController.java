package com.gestion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.entities.Foyer;
import com.gestion.services.FoyerService;

@RestController
@RequestMapping("/foyers")
public class FoyerController {
	
	@Autowired
	
	FoyerService foyerService;
	
	@GetMapping()
	public List<Foyer> getAll() {
		return foyerService.getAllfoyers();
	}

	@PostMapping("/ajouterFoyer")
	public ResponseEntity<Foyer> addFoyer(@RequestBody Foyer foyer) {
		foyerService.createFoyer(foyer);
		return (ResponseEntity.ok(foyer));
	}

	@GetMapping("/{id}")
	public Optional<Foyer> getFoyerById(@PathVariable long id) {
		Optional<Foyer> foyer = foyerService.findById(id);

		if (foyer.isPresent()) {
			return foyer;
		} else {
			return Optional.empty();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteFoyer(@PathVariable long id) {
		foyerService.delete(id);
		return ResponseEntity.noContent().build();

	}

}
