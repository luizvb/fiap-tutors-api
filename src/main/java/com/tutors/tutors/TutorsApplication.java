package com.tutors.tutors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.tutors.tutors.repository")
public class TutorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorsApplication.class, args);
	}

}
