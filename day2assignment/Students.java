package week3.day2assignment;

public class Students {
	private static final String Sathya = null;
	private static final String Sathyateju = null;
	
	
	public void getstudentinfo(int id, String name, String email, long Phonenum ){
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(Phonenum);

	}
	public static void main(String[] args) {
		Students stu = new Students();
		stu.getstudentinfo(2020, Sathya, Sathyateju, 7845855721);

	}

}
