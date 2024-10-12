package com.patrones.patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class PatronesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}

}
