package com.tnsif.ifet.qualifier_annotation;

import org.springframework.stereotype.Component;

@Component
public class Book implements Ordering{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Ordering Harry potter");
	}

}
