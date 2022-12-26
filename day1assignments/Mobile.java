package week1.day1assignments;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Calling");
		
		String mobileModel = "REDMI";
		float weight = 5.2f;
		System.out.println(mobileModel);
		System.out.println(weight);

	}
	
	public void sendSMS() {
		System.out.println("Hai");
		
		boolean fullcharged = true;
	    int mobileCost = 10000;
	    System.out.println(fullcharged);
	    System.out.println(mobileCost);
	}


	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.makeCall();
		m.sendSMS();

	}

}
