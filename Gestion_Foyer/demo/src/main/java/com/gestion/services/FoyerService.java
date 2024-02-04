package com.gestion.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.entities.Foyer;
import com.gestion.repositories.FoyerRepository;

@Service
public class FoyerService {

	@Autowired
	FoyerRepository foyerRepository;

	public List<Foyer> getAllfoyers() {

		return foyerRepository.findAll();
	}

	public Optional<Foyer> findById(Long id) {
		return foyerRepository.findById(id);
	}

	public Foyer createFoyer(Foyer foyer) {
		return foyerRepository.save(foyer);
	}

	public void delete(Long id) {
		foyerRepository.deleteById(id);
	}

}
