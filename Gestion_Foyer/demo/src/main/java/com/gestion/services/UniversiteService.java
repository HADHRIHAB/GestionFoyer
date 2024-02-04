package com.gestion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.entities.Universite;
import com.gestion.repositories.UniversiteRepository;



@Service
public class UniversiteService  {

	@Autowired
	
	UniversiteRepository universiteRepository;
	
	
	public List<Universite> getAlluniversites() {

		return universiteRepository.findAll();

	}

	public Optional<Universite> findById(Long id) {
		return universiteRepository.findById(id);
	}

	public Universite createUniversite(Universite universite) {
		return universiteRepository.save(universite);
	}

	public void delete(Long id) {
		universiteRepository.deleteById(id);
	}
	

}
