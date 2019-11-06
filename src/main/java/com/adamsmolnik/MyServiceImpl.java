package com.adamsmolnik;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@Service
@XRayEnabled
public class MyServiceImpl implements MyService {

	public List<String> getEntities() {
		try {
			TimeUnit.MILLISECONDS.sleep(new Random().nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Arrays.asList("1", "2", "3", "4", "5");
	}
}