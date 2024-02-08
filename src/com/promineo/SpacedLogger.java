package com.promineo;

public class SpacedLogger implements Logger {

	
	public void log(String log) {
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			if (i > 0) {
				
				result.append(" ");
			
			}
			
			result.append(log.charAt(i));
		}
		
		System.out.println(result.toString());
	}

	
	public void error(String error) {
		
		StringBuilder errorResult = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			if (i > 0) {
				
				errorResult.append(" ");
			
			}
			
			errorResult.append(error.charAt(i));
		
		}
		
		System.out.println("ERROR: " + errorResult.toString());		
	
	}

}
