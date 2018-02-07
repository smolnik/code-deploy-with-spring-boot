package com.adamsmolnik;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@Value("${env}")
	private String env;

	@RequestMapping(path = "hc")
	public String hc() {
		return "OK...  :))))):) env=" + env + " " + Instant.now();
	}

}