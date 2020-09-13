package com.donglq.basic;

public class FirstExample {
	
	public String printString(String input) {
		return (input == null || input.isEmpty()) ? "Please enter input in your browser address bar..." : input.trim();
	}
}
