package com.gestion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.entities.Chambre;
import com.gestion.repositories.ChambreRepository;

@Service
public class ChambreService {
	@Autowired

	ChambreRepository chambreRepository;

	public List<Chambre> getAllchambres() {

		return chambreRepository.findAll();

	}

	public Optional<Chambre> findById(Long id) {
		return chambreRepository.findById(id);
	}

	public Chambre createChambre(Chambre chambre) {
		return chambreRepository.save(chambre);
	}

	public void delete(Long id) {
		chambreRepository.deleteById(id);
	}
}
