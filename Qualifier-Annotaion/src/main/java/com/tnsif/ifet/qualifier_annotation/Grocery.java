package com.tnsif.ifet.qualifier_annotation;

import org.springframework.stereotype.Component;

@Component
public class Grocery implements Ordering{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("ordering Kadugu and pepper");
	}

}
