package com.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
