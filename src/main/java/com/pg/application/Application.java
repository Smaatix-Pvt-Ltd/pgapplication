package com.pg.application;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

//		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(Application.class, args);
//		String[] beanDefinitions = applicationContext.getBeanDefinitionNames();
//		Arrays.stream(beanDefinitions)
//				.sorted()
//				.forEach(System.out::println);

	}
}

