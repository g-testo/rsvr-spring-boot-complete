package com.tts.rsvrInClass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.rsvrInClass.model.Event;
import com.tts.rsvrInClass.service.EventServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private EventServiceImpl eventServiceImpl;
		
	@GetMapping()
	public List<Event> getEvent(){
		return eventServiceImpl.findAll();
	}
	
	@GetMapping("/{id}")
	public Event getEvent(@PathVariable Long id) {
		return eventServiceImpl.findEventById(id);
	}
	
	@PostMapping()
	public void saveEvent(@RequestBody Event event) {
		eventServiceImpl.saveEvent(event);
	}
	
	@PutMapping("/{id}")
	public void updateEvent(@PathVariable Long id, @RequestBody Event event) {
		eventServiceImpl.updateEventById(id, event);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEvent(@PathVariable Long id) {
		eventServiceImpl.deleteEventById(id);
	}
	
}
