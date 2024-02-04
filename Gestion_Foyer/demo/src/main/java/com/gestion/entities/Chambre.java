package com.gestion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Chambre extends SuperClass {
	private long numero;
	@Enumerated(EnumType.STRING)
	TypeChambre typeChambre;
	
	@ManyToOne
	@JoinColumn(name="bloc_id")
	private Bloc bloc;
}
