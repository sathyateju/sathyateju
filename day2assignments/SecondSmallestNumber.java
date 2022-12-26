package week1.day2assignments;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] Number= {23,45,67,32,89,22};
		Arrays.sort(Number);
		int length = Number.length;
		System.out.println("Length of the Array is :" + length);
        System.out.println("Second Smallest Number is :" +Number[1]);
	
		for (int i=0; i<length; i++) {
			System.out.println(Number[i]);
		}
		
		}

}
