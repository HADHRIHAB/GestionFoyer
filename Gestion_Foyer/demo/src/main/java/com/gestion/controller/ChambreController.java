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

import com.gestion.entities.Chambre;

import com.gestion.services.ChambreService;

@RestController
@RequestMapping("/chambres")
public class ChambreController {
	
	@Autowired
	ChambreService chambreService;
	
	@GetMapping()
	public List<Chambre> getAll() {
		return chambreService.getAllchambres();
	}

	@PostMapping("/ajouter")
	public ResponseEntity<Chambre> add(@RequestBody Chambre chambre) {
		chambreService.createChambre(chambre);
		return (ResponseEntity.ok(chambre));
	}

	@GetMapping("/{id}")
	public Optional<Chambre> getChambreById(@PathVariable long id) {
		Optional<Chambre> chambre = chambreService.findById(id);

		if (chambre.isPresent()) {
			return chambre;
		} else {
			return Optional.empty();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEtudiant(@PathVariable long id) {
		chambreService.delete(id);
		return ResponseEntity.noContent().build();

	}


}
