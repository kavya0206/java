package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonValues {
public static void main(String[] args) {
	Set<Integer> s1 = new HashSet<>();
	Set<Integer> s2 = new HashSet<>();
	
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(90);
	s1.add(10);
	s1.add(10);
	s1.add(40);
	s1.add(50);
	System.out.println("HashSet");
	System.out.println("s1" +s1);
	
	s2.add(30);
	s2.add(40);
	s2.add(50);
	s2.add(60);
	System.out.println("S2" +s2);
	
	s1.retainAll(s2);
	System.out.println("Common values" +s1);
	
	Set<Integer> s3 = new LinkedHashSet<>();
	Set<Integer> s4 = new LinkedHashSet<>();
	s3.add(10);
	s3.add(20);
	s3.add(30);
	s3.add(90);
	s3.add(10);
	s3.add(10);
	s3.add(40);
	s3.add(50);
	System.out.println("LinkedHashSet");
	System.out.println("s3" +s3);
	
	s4.add(10);
	s4.add(20);
	s4.add(60);
	s4.add(50);
	s4.add(40);
	s4.add(70);
	s4.add(80);
	s4.add(90);
	System.out.println("S4" +s4);
	
	s3.retainAll(s4);
	System.out.println("Common values" +s3);
	
	Set<Integer> s5 = new TreeSet<>();
	Set<Integer> s6 = new TreeSet<>();
	s5.add(10);
	s5.add(20);
	s5.add(30);
	s5.add(40);
	s5.add(50);
	s5.add(60);
	s5.add(70);
	s5.add(80);
	System.out.println("TreeSet");
	System.out.println("S5" +s5);
	
	s6.add(100);
	s6.add(200);
	s6.add(300);
	s6.add(400);
	s6.add(500);
	s6.add(600);
	s6.add(700);
	s6.add(800);
	System.out.println("S6" +s6);
	
	s5.retainAll(s6);
	System.out.println("Common Values" +s5);
	
}
}
