package com.tnsif.ifet.qualifier_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QualifierAnnotaionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(QualifierAnnotaionApplication.class, args);
		
		Consumer c2= var.getBean(Consumer.class);
		
		c2.order();
	}

}
