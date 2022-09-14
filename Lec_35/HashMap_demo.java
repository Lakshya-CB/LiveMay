package Lec_35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {

//		HashMap<Key,Value>
		HashMap<String, Integer> map = new HashMap<>();
		map.put("azc", null); //O(1)
		map.put("bcxb", 12);//O(1)
		map.put("zvc", 14);
		map.put("adxd", 11);
		map.put("ae", 60);

		System.out.println(map.get("D"));//O(1)
		System.out.println(map.get("E"));
		System.out.println(map.get("c"));
		
		map.put("D", 99);//O(1)
		System.out.println(map.get("D")); //O(1)

		System.out.println(map.get("A")); 
		
		System.out.println(map.containsKey("c")); //O(1)
	
		System.out.println(map);
		map.remove("bcxb"); //O(1)
		System.out.println(map);
		
		Set<String> Keys = map.keySet();
		System.out.println(Keys);
		ArrayList<String> AL = new ArrayList<>(Keys);
		System.out.println(AL);
		System.out.println("-==--==-=-=-=-=-=-==-");
		for(String Key : map.keySet()) {
			System.out.println(Key+"=>"+map.get(Key));
		}
	}
}
