package com.min.rabbitmq.api;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -2737186889213167683L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
