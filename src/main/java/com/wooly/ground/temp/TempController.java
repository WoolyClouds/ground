package com.wooly.ground.temp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.random.RandomGenerator;

@RestController
public class TempController {

	@PostMapping(value = "/")
	public String root() {
		return "Hello";
	}
}
