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

import com.gestion.entities.Universite;

import com.gestion.services.UniversiteService;

@RestController
@RequestMapping("/universites")
public class UniversiteController {
 
	@Autowired
	UniversiteService universiteService;
	
	@GetMapping()
	public List<Universite> getAll() {
		return universiteService.getAlluniversites();
	}

	@PostMapping("/ajouter")
	public ResponseEntity<Universite> addUniversite(@RequestBody Universite universite) {
		universiteService.createUniversite(universite);
		return (ResponseEntity.ok(universite));
	}

	@GetMapping("/{id}")
	public Optional<Universite> getUniversiteById(@PathVariable long id) {
		Optional<Universite> universite = universiteService.findById(id);

		if (universite.isPresent()) {
			return universite;
		} else {
			return Optional.empty();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUniversite(@PathVariable long id) {
		universiteService.delete(id);
		return ResponseEntity.noContent().build();

	}
	
}
