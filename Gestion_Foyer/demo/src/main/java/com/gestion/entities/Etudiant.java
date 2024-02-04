package com.gestion.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Etudiant extends SuperClass {

	private long cin;
	private String ecole;
	private Date dateNaissance;
	
	@ManyToMany
	@JoinTable(name="Etudiant_Reservation", joinColumns = @JoinColumn(name="etudiant_id"), 
	inverseJoinColumns = @JoinColumn(name="reservation_id"))
			
	private List<Reservation> reservations= new ArrayList<>();
	
	
}
