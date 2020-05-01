package list;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
public static void main(String[] args) {
	List l1 = new ArrayList();
	List l2 = new ArrayList();

	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(90);
	l1.add(90);
	l1.add(10);
	System.out.println(l1);
	//adding values to another list
	l2.addAll(l1);
	System.out.println(l2);
	l2.add(40);
	l2.add(80);
	l2.add(70);
	System.out.println(l2);
	//using removeAll to return unique values
	l2.removeAll(l1);
	System.out.println(l2);
	
}
}
