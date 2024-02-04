package com.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {

}
