package com.ExceptionHandling;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = {3,5,23,6,34,4,23};
			
			System.out.println(arr[2]);  // Access index out of bond
			
			int result =24/1; // example of ArithmeticException
			System.out.println(result);
			
			String str =null;
			System.out.println(str.length());// Accessing length of string
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array index out  of bound occurd : "+ e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurd : "+ e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception occurd : "+ e.getMessage());
		}
		finally {
			System.out.println("Code wiill Execute!!!!");
		}
		
		// if there is same output of all exception error then we write all catch error in one statement====>
//		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//			System.out.println("Something Went wrong!!!");
//		}
		
		

	}

}
