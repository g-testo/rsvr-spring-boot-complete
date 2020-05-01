package com.tts.rsvrInClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.rsvrInClass.model.Event;
import com.tts.rsvrInClass.model.Reservation;
import com.tts.rsvrInClass.model.User;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	public Reservation findReservationById(Long id);
	public boolean existsByUserAndEvent(User user, Event event);
}
