package week1.day2assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 12;
		int count = 0;
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
		if(count==2) {
		System.out.println("This is Prime Number");
		}else {
		System.out.println("This is not a Prime Number");
		}
	}

}
