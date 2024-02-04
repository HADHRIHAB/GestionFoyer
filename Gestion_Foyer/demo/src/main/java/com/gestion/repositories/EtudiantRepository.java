package com.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gestion.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
