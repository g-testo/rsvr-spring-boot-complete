package com.tts.rsvrInClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tts.rsvrInClass.model.Event;
import com.tts.rsvrInClass.model.Reservation;
import com.tts.rsvrInClass.model.User;
import com.tts.rsvrInClass.service.UserServiceImpl;

@SpringBootApplication
public class RsvrInClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsvrInClassApplication.class, args);
	}
	
}
