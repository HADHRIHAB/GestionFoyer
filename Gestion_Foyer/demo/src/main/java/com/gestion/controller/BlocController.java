package com.gestion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.entities.Bloc;
import com.gestion.services.BlocService;



@RestController
@RequestMapping("/blocs")
public class BlocController {

	@Autowired(required = false)
	BlocService blocService;

	@GetMapping()
	public List<Bloc> getAll() {
		return blocService.getAllBlocs();
	}

	@PostMapping("/ajouter")
	public ResponseEntity<Bloc> addBloc(Bloc bloc) {
		blocService.createBloc(bloc);
		return (ResponseEntity.ok(bloc));
	}

	@GetMapping("/{id}")
	public Optional<Bloc> getById(@PathVariable long id) {
		Optional<Bloc> bloc = blocService.findById(id);
		if (bloc.isPresent()) {
			return bloc;
		} else {
			return Optional.empty();
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable long id) {
		blocService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
