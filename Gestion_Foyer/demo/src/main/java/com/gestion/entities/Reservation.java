package com.gestion.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Reservation extends SuperClass {
	private Date anneeUniversitaire;
	private boolean estValide;
	
	
	@ManyToOne
	@JoinColumn(name="chambre_id_id")
	private Chambre chambre;
	
	@ManyToMany
	private List<Etudiant> etudiants= new ArrayList<>();
}
