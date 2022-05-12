package com.training.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author UD SYSTEMS
 *
 *Indicates a configuration class that declares one or more @Bean methods 
 *and also triggers auto-configuration and component scanning. 
 *This is a convenience annotation that is equivalent to declaring 
 *@Configuration, @EnableAutoConfiguration and @ComponentScan.
 */
@SpringBootApplication
public class HellodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodemoApplication.class, args);
	}

}
