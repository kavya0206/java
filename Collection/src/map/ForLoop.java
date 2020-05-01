package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ForLoop {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(10, "Java");
		m1.put(20, "Sql");
		m1.put(30, "oops");
		m1.put(40, "Sql");
		m1.put(50, "Oracle");
		m1.put(60, "DB");
		m1.put(10, "Selenium");
		m1.put(50, "psql");
		m1.put(40, "Hadoop");
		
		System.out.println("HashMap For loop");
		System.out.println(m1);
		Set<Entry<Integer, String>> e1 = m1.entrySet();
		for(Entry<Integer, String> x:e1) {
			System.out.println(x);
		}
		
		Map<Integer, Integer> m2 = new LinkedHashMap<>();
		m2.put(10, 10);
		m2.put(20, 20);
		m2.put(30, 30);
		m2.put(40, 40);
		m2.put(50, 50);
		m2.put(60, 60);
		m2.put(10, 10);
		m2.put(50, 50);
		m2.put(40, 40);
		System.out.println("LinkedHashMap For Loop");
		System.out.println(m2);
		Set<Entry<Integer,Integer>> e2 = m2.entrySet();
		for(Entry<Integer, Integer> x:e2) {
			System.out.println(x);
		}
		
		Map<Character, Integer> m3 = new TreeMap<>();
		m3.put('!', 10);
		m3.put('@', 20);
		m3.put('#', 30);
		m3.put('$', 40);
		m3.put('%', 50);
		m3.put('^', 60);
		m3.put('&', 10);
		m3.put('*', 50);
		m3.put('(', 40);
		System.out.println("TreeMap For Loop");
		System.out.println(m3);
		Set<Entry<Character,Integer>> e3 = m3.entrySet();
		for(Entry<Character, Integer> x:e3) {
			System.out.println(x);
		}
		
		Map<String, String> m4 = new Hashtable<>();
		m4.put("vel", "Selenium");
		m4.put("Ganesh", "Framework");
		m4.put("Dinesh", "Oracle");
		m4.put("Kannan", "CoreJave");
		m4.put("Raj", "Jira");
		System.out.println("Hashtable For Loop");
		System.out.println(m4);
		Set<Entry<String,String>> e4 = m4.entrySet();
		for(Entry<String, String> x:e4) {
			System.out.println(x);
		}
		
}
}
