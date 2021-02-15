package com.uvas.application.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ping")
public class PingController {

	@GetMapping
	public ResponseEntity<String> ping(){
		return ResponseEntity.status(HttpStatus.OK).body("Pong");
	}
}
