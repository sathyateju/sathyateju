package org.system;

public class Desktop extends Computer {
	
	public void desktopsize() {
		System.out.println("5 inch");

	}
public static void main(String[] args) {
	Desktop des = new Desktop();
	des.computermodel();
	des.desktopsize();
}
}
