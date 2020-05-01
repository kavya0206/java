package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Loop {
public static void main(String[] args) {
	Set<Integer> s1 = new LinkedHashSet<>();
	s1.add(105);
	s1.add(205);
	s1.add(305);
	s1.add(405);
	s1.add(505);
	s1.add(605);
	s1.add(705);
	s1.add(805);
	
	for(Integer s2: s1) {
		System.out.println(s2);
	}
	
	Set<Integer> s2 = new TreeSet<Integer>();
	s2.add(10);
	s2.add(20);
	s2.add(30);
	s2.add(40);
	s2.add(50);
	s2.add(60);
	s2.add(70);
	s2.add(80);
	s2.add(90);
	s2.add(10);
	s2.add(20);
	System.out.println("TreeSet For loop");
	for(Integer s3: s2) {
		System.out.println(s3);
	}
	
	Set<Integer> s3 = new TreeSet<Integer>();
	s3.add(10);
	s3.add(20);
	s3.add(30);
	s3.add(40);
	s3.add(50);
	s3.add(60);
	s3.add(70);
	s3.add(80);
	s3.add(90);
	s3.add(10);
	s3.add(20);
	System.out.println("HashSet For loop");
	for(Integer s4: s3) {
		System.out.println(s4);
	}
}
}
