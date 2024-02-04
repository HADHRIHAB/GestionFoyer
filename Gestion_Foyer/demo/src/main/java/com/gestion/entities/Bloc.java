package com.gestion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bloc extends SuperClass {
	private long capaciteBloc;
    
	@ManyToOne
	@JoinColumn(name="foyer_id")
	private Foyer foyer;
}
