package com.gestion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Foyer extends SuperClass {
	private long capaciteFoyer;
	
	@OneToOne
	@JoinColumn(name = "universite_id")
	  private Universite universite;
}
