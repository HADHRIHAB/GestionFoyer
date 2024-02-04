package com.gestion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.gestion.entities.Reservation;
import com.gestion.services.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

	@Autowired
	ReservationService reservationService;

	@GetMapping()
	public List<Reservation> getAll() {
		return reservationService.getAllreservations();
	}

	@PostMapping("/AjouterReservation")
	public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
		reservationService.createReservation(reservation);
		return (ResponseEntity.ok(reservation));
	}

	@GetMapping("/{id}")
	public Optional<Reservation> getReservationById(@PathVariable long id) {
		Optional<Reservation> reservation = reservationService.findById(id);

		if (reservation.isPresent()) {
			return reservation;
		} else {
			return Optional.empty();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteReservation(@PathVariable long id) {
		reservationService.delete(id);
		return ResponseEntity.noContent().build();

	}
}
