package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class MyList {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		List l2 = new LinkedList();
		List l3 = new Vector();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(90);
		l1.add(10);

		System.out.println(l1.size());
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add(700);
		System.out.println(l2.size());
		l3.add(205);
		l3.add(305);
		l3.add(105);
		l3.add(405);
		l3.add(505);
		System.out.println(l3.size());

		List<Integer> l4 = new ArrayList();
		l4.addAll(l1);
		System.out.println(l4);
		System.out.println(l4.indexOf(10));
		System.out.println(l4.lastIndexOf(10));
		l4.add(3, 10);
		System.out.println(l4);
		// Normal For loop
		for (int i = 0; i <= l4.size() - 1; i++) {
			System.out.println(l4.get(i));
		}
		System.out.println("Enhanced for Loop");
		for (Integer x : l4) {
			System.out.println(x);
		}
		System.out.println("Remove value");
		System.out.println(l4);
		System.out.println(l4.remove(6));
		System.out.println(l4);
		l4.remove(2);
		System.out.println(l4);
		// replacing value at 2nd index
		l4.add(2, 50);
		System.out.println(l4);
		// replacing values 300 to 350
		l2.set(2, 350);
		System.out.println(l2);
		// adding values at 6th index
		l2.set(6, 90);
		System.out.println(l2);
		// Replacing all 10 to 100 in l4
		for(int i =0; i<=l4.size()-1; i++) {
			if(l2.contains(10)) {
				l2.get(100);
				
			}
			
		}
		System.out.println(l4);
	}
}