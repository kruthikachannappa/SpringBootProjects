package com.myfirstproject.springbootstarter;

public class Topic {

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic(String iD, String name, String description) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
	}
	public Topic() {
		
	}

	private String ID;
	private String name;
	private String description;
}
