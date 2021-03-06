package com.learning.springbootschedular.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

@Configuration
public class ScheduledConfig implements SchedulingConfigurer {
	
	@Value("${schduler-pool-size}")
	private int POOL_SIZE;

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		
		System.out.println("poolsize : "+ POOL_SIZE);
		ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
		taskScheduler.setPoolSize(POOL_SIZE);
		taskScheduler.setThreadNamePrefix("sched-thread-");
		taskScheduler.initialize();
		System.out.println("initializing the schedConfig .....");
		// TODO Auto-generated method stub
		taskRegistrar.setTaskScheduler(taskScheduler);
	}

}
