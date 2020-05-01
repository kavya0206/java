package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size: 1200x768");
	}

	public static void main(String[] args) {
		Desktop des = new Desktop();
		des.computerModel();
		des.desktopSize();
	}
}
