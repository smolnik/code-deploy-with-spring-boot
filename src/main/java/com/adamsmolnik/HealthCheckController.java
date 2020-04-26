package com.adamsmolnik;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HealthCheckController {

	@Autowired
	private MyService myService;

	@RequestMapping(path = "hc")
	public String hc() {
		try {
			List<String> entities = myService.getEntities();
			return "Hello here, Adam from + " + Inet4Address.getLocalHost().getHostAddress() + " +  :) " + Instant.now()
					+ " entities-> " + entities;
		} catch (UnknownHostException e) {
			throw new IllegalStateException(e);
		}
	}

}