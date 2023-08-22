package com.wooly.ground.temp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

	@PostMapping(value = "/")
	public String root() {
		return "Hello";
	}

}
