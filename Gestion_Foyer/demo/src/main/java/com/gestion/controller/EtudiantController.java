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

import com.gestion.entities.Etudiant;
import com.gestion.services.EtudiantService;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
	
	@Autowired
	
	EtudiantService etudiantService;
	
	@GetMapping()
	public List<Etudiant> getAll() {
		return etudiantService.getAlletudiants();
	}

	@PostMapping("/ajouter")
	public ResponseEntity<Etudiant> add(@RequestBody Etudiant etudiant) {
		etudiantService.createEtudiant(etudiant);
		return (ResponseEntity.ok(etudiant));
	}

	@GetMapping("/{id}")
	public Optional<Etudiant> getEtudiantById(@PathVariable long id) {
		Optional<Etudiant> etudiant = etudiantService.findById(id);

		if (etudiant.isPresent()) {
			return etudiant;
		} else {
			return Optional.empty();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEtudiant(@PathVariable long id) {
		etudiantService.delete(id);
		return ResponseEntity.noContent().build();

	}

}
