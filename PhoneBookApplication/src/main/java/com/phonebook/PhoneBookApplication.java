package com.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneBookApplication {
	
	

	private PhoneBookApplication() {
		super();
	}

	public static void main(String[] args) {
		SpringApplication.run(PhoneBookApplication.class, args);
	}

}
