package week3.day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		int length = str.length();
		for (int i = length-1; i >=0 ; i--) {
			rev=rev+str.charAt(i);
			}
System.out.println(rev);
if(str.equals(rev)) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}

	
}
