package com.learning.springbootschedular.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.learning.springbootschedular.services.SchedTaskService;

@Component
public class FileSchedTask {
	
	@Autowired
	private SchedTaskService taskService;
	
	@Scheduled(fixedRate = 60000)
	public void schedularWithFixedInterval() {
		System.out.println("current thread : "+ Thread.currentThread().getName());
		taskService.task();
	}
	

}
