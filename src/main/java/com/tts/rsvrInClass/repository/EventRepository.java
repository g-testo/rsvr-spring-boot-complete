package com.tts.rsvrInClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.rsvrInClass.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	Event findEventById(Long id);

}
