package com.adamsmolnik;

import java.net.Inet4Address;
import java.net.UnknownHostException;
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
		try {
			return "Hello Sir Adam from + " + Inet4Address.getLocalHost().getHostAddress() + " +  :) env=" + env + " "
					+ Instant.now();
		} catch (UnknownHostException e) {
			throw new IllegalStateException(e);
		}
	}

}