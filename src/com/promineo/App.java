package com.promineo;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger logMethod = new AsteriskLogger();
		
		AsteriskLogger errorMethod = new AsteriskLogger();
		
		logMethod.log("Hello");
		
		System.out.println();
		
		errorMethod.error("Hello");
		
		
		SpacedLogger logMethod2 = new SpacedLogger();
		
		logMethod2.log("Hello");
		
		System.out.println();
		
		logMethod2.error("Hello");
	}

	
	
}
