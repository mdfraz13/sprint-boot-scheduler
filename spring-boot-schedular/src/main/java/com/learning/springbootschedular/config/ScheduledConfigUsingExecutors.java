package com.learning.springbootschedular.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.quartz.DisallowConcurrentExecution;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

@Configuration
public class ScheduledConfigUsingExecutors implements SchedulingConfigurer {
	
	private final int POOL_SIZE = 10;

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) 
	{
		Executor executor = Executors.newScheduledThreadPool(POOL_SIZE);
		taskRegistrar.setScheduler(executor);
	}

}
