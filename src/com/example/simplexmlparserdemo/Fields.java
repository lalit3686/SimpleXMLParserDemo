package com.example.simplexmlparserdemo;

import org.simpleframework.xml.Element;

public class Fields {

	@Element
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Element
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
