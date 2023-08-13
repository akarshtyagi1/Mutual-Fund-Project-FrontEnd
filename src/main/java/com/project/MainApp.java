package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.MainApp;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mutual Funds spring application started....");
		SpringApplication.run(MainApp.class, args);
	}

}
