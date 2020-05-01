package org.univ;

public class College extends University {
	@Override
	public void pg() {
		System.out.println("PG Courses");

	}

	@Override
	public void ug() {
		System.out.println("UG Courses");
	}
	public static void main(String[] args) {
		College col = new College();
		col.pg();
		col.ug();
	}
}
