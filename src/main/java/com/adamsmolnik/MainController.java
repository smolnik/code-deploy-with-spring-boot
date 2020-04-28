package com.adamsmolnik;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.Instant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class MainController {

	@RequestMapping("/")
	public String hc() {
		try {
			return "Hello here, Adam from Zory!!! " + Inet4Address.getLocalHost().getHostAddress() + " +  :) at " + Instant.now();
		} catch (UnknownHostException e) {
			throw new IllegalStateException(e);
		}
	}

}