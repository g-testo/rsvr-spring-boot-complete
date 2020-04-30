package com.tts.rsvrInClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.rsvrInClass.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	public Reservation findReservationById(Long id);
}
