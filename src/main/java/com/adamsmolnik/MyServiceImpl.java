package com.adamsmolnik;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@Service
@XRayEnabled
public class MyServiceImpl implements MyService {

	public List<String> getEntities() {
		return Arrays.asList("1", "2", "3", "4");
	}
}