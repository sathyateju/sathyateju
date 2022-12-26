package week1.day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		String num = "34343";
		String rev = "";
		
		for (int i=num.length()-1; i>=0; i--) {
			rev = rev + num.charAt(i);
		}
		if(rev.equals(num)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		

	}

} 
