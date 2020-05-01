package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyValues {
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
	
	System.out.println("HashMap");
	System.out.println(m1);
	System.out.println("Key Values" + m1.keySet());
	
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
	System.out.println("LinkedHashMap");
	System.out.println(m2);
	System.out.println("Key Values" + m2.keySet());
	
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
	System.out.println("TreeMap");
	System.out.println(m3);
	System.out.println("Key Values" + m3.keySet());
	
	Map<String, String> m4 = new Hashtable<>();
	m4.put("vel", "Selenium");
	m4.put("Ganesh", "Framework");
	m4.put("Dinesh", "Oracle");
	m4.put("Kannan", "CoreJave");
	m4.put("Raj", "Jira");
	System.out.println("Hashtable");
	System.out.println(m4);
	System.out.println("Key Values" + m4.keySet());
	
}
}
