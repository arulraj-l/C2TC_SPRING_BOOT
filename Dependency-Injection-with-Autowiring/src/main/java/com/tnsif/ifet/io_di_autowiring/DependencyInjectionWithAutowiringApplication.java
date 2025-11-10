package com.tnsif.ifet.io_di_autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionWithAutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DependencyInjectionWithAutowiringApplication.class, args);
		
		Consumer1 c = var.getBean(Consumer1.class);
		c.show();
	}

}
