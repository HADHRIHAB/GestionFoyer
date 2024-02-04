package com.gestion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.entities.Reservation;
import com.gestion.repositories.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	ReservationRepository reservationRepository;

	public List<Reservation> getAllreservations() {

		return reservationRepository.findAll();

	}

	public Optional<Reservation> findById(Long id) {
		return reservationRepository.findById(id);
	}

	public Reservation createReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	public void delete(Long id) {
		reservationRepository.deleteById(id);
	}

}
