package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AddAll {
public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(90);
	l1.add(10);
	l1.add(10);
	l1.add(40);
	l1.add(50);
	System.out.println("List");
	System.out.println(l1);
	
	Set<Integer> s1 = new LinkedHashSet<>();
	s1.addAll(l1);
	System.out.println("Set");
	System.out.println(s1);
}
}
