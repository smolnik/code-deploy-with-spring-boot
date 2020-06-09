package com.adamsmolnik;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@Service
@XRayEnabled
public class MyServiceImpl implements MyService {

	@Autowired
	private MyServiceXYZ myServiceXYZ;

	public List<String> getEntities() {
		try {
			TimeUnit.MILLISECONDS.sleep(new Random().nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myServiceXYZ.getEntitiesXYZ();
	}
}