package com.soprasteria.bestof.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.bestof.model.Movie;
import com.soprasteria.bestof.model.Song;

@RestController
@RequestMapping("/bestof/*")
public class BestofController {

	@GetMapping("/movie")
	public Movie film() {
		return new Movie();
	}
	
	@GetMapping("/song")
	public Song canzone() {
		return new Song();
	}
}
