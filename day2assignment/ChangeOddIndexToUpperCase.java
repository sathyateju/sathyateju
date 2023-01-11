package week3.day2assignment;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {
	
	
	public static void main(String[] args) {
		
	      //        012134567
	String input = "changeme";
	char[] charArray = input.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if(i%2==1) {
			charArray[i]=Character.toUpperCase(charArray[i]);
			System.out.println(charArray[i]);
		}
	}
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	}
}

	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 if(i%2==1){
	 System.out.println(input.touppercase());
	 }
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	

