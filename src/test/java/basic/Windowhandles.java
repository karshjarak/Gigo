package basic;

import java.util.HashMap;
import java.util.Iterator;

import com.sun.xml.bind.v2.util.QNameMap.Entry;

import groovy.util.MapEntry;

public class Windowhandles {
	
	
	String name;
	int age;
	String value;
	
	
	public Windowhandles(String name, int age, String value) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.age = age;
		this.value = value;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubHash
		 
		
		HashMap<Integer, Windowhandles>  a = new HashMap();
		
		Windowhandles wid1 = new Windowhandles("kareshak", 23, "hyd4e");
		Windowhandles wid2 = new Windowhandles("kareshak", 23, "hyd4e");

		System.out.println(wid1.equals(wid2));
		
		String b = new String("A");
		String c = new String("A");
		
		System.out.println(b.equals(c));


//		
//		a.put(2, null);
//		a.put(1, "k");
//		a.put(22, "a");
//		a.put(3, "r");
//		a.put(4, "s");
//		a.put(5, "h");
//		a.put(6, "a");
//		a.put(7, "k");
		
		
//		a.put(1, wid1);
//		a.put(11, wid2);
//
//		for(java.util.Map.Entry<Integer, Windowhandles> b: a.entrySet()) {
//			
//		int i =	b.getKey();
//		  Windowhandles c = b.getValue();
//		  
//		  System.out.println("key is"+i);
//			
//		}
		
		
		
	//	System.out.println(a.get(4));
		
//	Iterator<Integer> g =	a.keySet().iterator();
//	
//	
//	while(g.hasNext()) {
//		
//		System.out.println(a.get(g));
//	}

		

		

	}

}
