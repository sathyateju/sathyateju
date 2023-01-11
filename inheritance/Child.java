package inheritance;

public class Child extends Parent{
	
	public void newhouse() {
		System.out.println("This my newhouse");

	}
	

	public static void main(String[] args) {
		Child ch = new Child();
		ch.appartment();
		ch.bunglow();
		ch.hut();
		ch.newbuilding();
		ch.newrent();
		ch.newhouse();

	}

}
