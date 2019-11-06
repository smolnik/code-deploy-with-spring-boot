package com.adamsmolnik;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@Value("${env}")
	private String env;

	@Autowired
	private MyService myService;

	@RequestMapping(path = "hc")
	public String hc() {
		try {
			List<String> entities = myService.getEntities();
			return "Hello Adam from + " + Inet4Address.getLocalHost().getHostAddress() + " +  :) env=" + env + " "
					+ Instant.now() + " entities-> " + entities;
		} catch (UnknownHostException e) {
			throw new IllegalStateException(e);
		}
	}

}