package com.gestion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.entities.Etudiant;
import com.gestion.repositories.EtudiantRepository;

@Service
public class EtudiantService {
	@Autowired

	EtudiantRepository etudiantRepository;

	public List<Etudiant> getAlletudiants() {

		return etudiantRepository.findAll();

	}

	public Optional<Etudiant> findById(Long id) {
		return etudiantRepository.findById(id);
	}

	public Etudiant createEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}

	public void delete(Long id) {
		etudiantRepository.deleteById(id);
	}
}
