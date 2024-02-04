package com.gestion.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperClass {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;

	public SuperClass(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public SuperClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
