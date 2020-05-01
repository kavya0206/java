package org.edu;

public class Education extends Arts {
	public void ug() {
		System.out.println("UG courses");
	}

	public void pg() {
		System.out.println("PG courses");
	}

	public static void main(String[] args) {
		Education edu = new Education();
		edu.ug();
		edu.bsc();
		edu.bEd();
		edu.ba();
		edu.bBa();
		edu.pg();
		edu.be();
		edu.bTech();
		edu.physio();
		edu.dental();
		edu.mbbs();
	}
}
