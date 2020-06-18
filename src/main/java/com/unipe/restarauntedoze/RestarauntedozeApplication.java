package com.unipe.restarauntedoze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestarauntedozeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestarauntedozeApplication.class, args);
	}

	// FRONT -> API -> Controller -> [Lógica] -> Array [Pratos]

	// GET - https://api.restaurante.doze/pratos - READ
	// POST - https://api.restaurante.doze/pratos - CREATE
	// PUT - https://api.restaurante.doze/pratos/{id} - UPDATE
	// DELETE - https://api.restaurante.doze/pratos/{id} - DELETE
}
