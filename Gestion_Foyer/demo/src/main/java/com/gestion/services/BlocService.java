package com.gestion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestion.entities.Bloc;
import com.gestion.repositories.BlocRepository;

public class BlocService {

	@Autowired

	BlocRepository blocRepository;

	public List<Bloc> getAllBlocs() {

		return blocRepository.findAll();

	}

	public Optional<Bloc> findById(Long id) {
		return blocRepository.findById(id);
	}

	public Bloc createBloc(Bloc bloc) {
		return blocRepository.save(bloc);
	}

	public void delete(Long id) {
		blocRepository.deleteById(id);
	}

}
