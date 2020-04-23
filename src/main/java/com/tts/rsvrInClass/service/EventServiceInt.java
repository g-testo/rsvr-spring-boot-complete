package com.tts.rsvrInClass.service;

import java.util.List;

import com.tts.rsvrInClass.model.Event;

public interface EventServiceInt {
	List<Event> findAll();
	Event findEventById(Long id);
	Event saveEvent(Event event);
	Event updateEventById(Long id, Event event);
	void deleteEventById(Long id);
}
