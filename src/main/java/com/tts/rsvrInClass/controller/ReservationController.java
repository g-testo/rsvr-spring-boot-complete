package com.tts.rsvrInClass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.rsvrInClass.model.Event;
import com.tts.rsvrInClass.model.Reservation;
import com.tts.rsvrInClass.model.User;
import com.tts.rsvrInClass.repository.ReservationRepository;
import com.tts.rsvrInClass.service.EventServiceImpl;
import com.tts.rsvrInClass.service.UserServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private EventServiceImpl eventServiceImpl;
	@Autowired
	private ReservationRepository reservationRepository;
	
	@GetMapping()
	public void test() {
		
		Event event = eventServiceImpl.findEventById(2L); 
		User user = userServiceImpl.findUserById(1L);
		Reservation reservation = new Reservation(user, event, "Test");
		reservationRepository.save(reservation);
		
//		Set<Reservation> resSet = new HashSet<>();
//		resSet.add(reservation);
//		event.setReservations(resSet);
//		user.setReservations(resSet);
//		userServiceImpl.saveUser(user);
//		eventServiceImpl.saveEvent(event);
		
		
	}
	
	@PostMapping()
	public void addReservation() {

	}
	
	@PutMapping("/{id}")
	public void udpateReservation() {		

	}
	
	@DeleteMapping("/{id}")
	public void deleteReservationById() {

	}
	
}
