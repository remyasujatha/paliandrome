package com.test;

public class Paliandrome {
	public static void main(String[] args) {
		String a = "aba";
		String reversedWord = reverseWord(a);
		if(a.equals(reversedWord))
		 System.out.println("Paliandrome");
		else
			System.out.println("Not a paliandrome");
		
	}

	
	private static String reverseWord(String a) {
		if(a.length()<=0) {
			return a;
		}
		// TODO Auto-generated method stub
		return a.charAt(a.length()-1) + reverseWord(a.substring(0,a.length()-1));
	}


	
}
