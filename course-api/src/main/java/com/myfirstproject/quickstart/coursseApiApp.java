package com.myfirstproject.quickstart;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.myfirstproject.*")
public class coursseApiApp {

	public static void main(String[] args) {
		//creates a servlet container and host this application in that servlet container
		// static method - SpringApplication.run(className of the Main method, args passed to main method);
		SpringApplication.run(coursseApiApp.class, args);

	}

}
