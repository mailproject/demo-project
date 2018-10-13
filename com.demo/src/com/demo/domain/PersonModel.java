package com.demo.domain;

public class PersonModel extends Model {

	private String name;
	private String subject;
	private String date;

	public PersonModel(String name, String subject, String date) {
		this.name = name;
		this.subject = subject;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		firePropertyChange("Name", this.name, this.name = name);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		firePropertyChange("Subject", this.subject, this.subject = subject);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
		firePropertyChange("date", this.date, this.date = date);
	}

}
