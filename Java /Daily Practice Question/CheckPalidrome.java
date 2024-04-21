package com.String;

public class CheckPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pali = "sos";
		
		String palidrome = findPalidrome(pali);
		
		if(palidrome == "true") {
			System.out.println("String is palidrome!!!");
		}else {
			System.out.println("String is not palidrome!!!");
		}

	}

	private static String findPalidrome(String pali) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = pali.length()-1;
		while(start < end) {
			if(pali.charAt(start) != pali.charAt(end)) {
				return "false";
			}
			start++;
			end--;
		}
		return "true";
	}

}
