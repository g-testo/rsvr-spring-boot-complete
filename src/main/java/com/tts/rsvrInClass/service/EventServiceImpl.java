package com.tts.rsvrInClass.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.rsvrInClass.model.Event;
import com.tts.rsvrInClass.repository.EventRepository;

@Service
public class EventServiceImpl implements EventServiceInt {
	
	@Autowired
	private EventRepository eventRepository;

	@Override
	public List<Event> findAll() {
		return eventRepository.findAll();
	}
	
	@Override
	public Event findEventById(Long id) {
		return eventRepository.findEventById(id);
	}

	@Override
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public Event updateEventById(Long id, Event eventFromForm) {
		Event eventFromDb = findEventById(id);
		
//		eventFromDb.setName(eventFromForm.getName());
//		eventFromDb.setLocation(eventFromForm.getLocation());	
		
        BeanUtils.copyProperties(eventFromForm, eventFromDb); // Make sure to check
        
        return eventRepository.save(eventFromDb);
	}

	@Override
	public void deleteEventById(Long id) {
		eventRepository.deleteById(id);
	}
	
}
