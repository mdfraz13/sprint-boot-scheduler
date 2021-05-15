package com.learning.springbootschedular.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class SchedTaskService {
	
	public void task() {
		System.out.println("task called ---- ");
		try {
			TimeUnit.SECONDS.sleep(10);
			//do some work .. or call any api
		} catch (Exception e) {
			System.out.println("exception occured ....");
		}
	}

}
