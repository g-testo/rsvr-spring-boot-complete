package com.tts.rsvrInClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.rsvrInClass.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	Event findEventById(Long id);

}
