package com.example.simplexmlparserdemo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="result")
public class Mihir {

	@Element(name="resultflag")
	private String text;

	@Element(name="field")
	private Fields field;
	
	public Fields getField() {
		return field;
	}

	public void setField(Fields field) {
		this.field = field;
	}

	public Mihir(){
		super();
	}
	
	public Mihir(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
