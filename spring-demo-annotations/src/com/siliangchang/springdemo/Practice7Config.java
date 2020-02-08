package com.siliangchang.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Practice7Config {
	// define bean for our fortune service
	@Bean
	public FortuneService practice7FortuneService() {
		return new Practice7FortuneService();
	}
	// define bean for our coach AND inject dependency
	@Bean
	public Coach practice7Coach() {
		return new Practice7Coach(practice7FortuneService());
	}
}
