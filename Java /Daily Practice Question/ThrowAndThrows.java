package com.ExceptionHandling;

import java.io.IOException;

public class ThrowAndThrows {
	public static void main(String[] args) {
		try {
			checkAge(15);
		}catch (ArithmeticException e){
			System.out.println("Exception Caught : " + e.getMessage());
			
		}
		
		try {
			readFile();
		}catch (IOException e){
			System.out.println("Exception Caught : " + e.getMessage());
			
		}
		
	}

	private static void readFile() throws IOException {
		// TODO Auto-generated method stub
		throw new IOException("File not found!!!!");		
	}

	public static void checkAge(int age) throws ArithmeticException{
		// TODO Auto-generated method stub
		if (age < 18) {
			throw new ArithmeticException("Age is under 18");
		}
		
	}

}
