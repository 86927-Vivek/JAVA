package com.assignments6.q1.entity;

import com.assignments6.q1.exceptions.ExceptionLineTooLong;

public class Entity {
	
	String message;

	
	public Entity(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) throws ExceptionLineTooLong {
		if(message.length()> 80) {
			throw new ExceptionLineTooLong("The strings is too long....");
		}
		this.message = message;
	}

	@Override
	public String toString() {
		return "Entity [message=" + message + "]";
	}
	
	
}
