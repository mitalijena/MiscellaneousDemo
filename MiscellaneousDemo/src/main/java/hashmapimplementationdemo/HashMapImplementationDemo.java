package HashMapImplementationDemo;

import java.util.HashMap;

public class HashMapImplementationDemo {

	public static void main(String args[]) {
		
		HashMap<Name, String> nameHashmap = new HashMap<>();
		nameHashmap.put(new Name("Mitali","Jena"), "Oracle");
		nameHashmap.put(new Name("Manoj","Kotian"), "Oracle");
		nameHashmap.put(new Name("Manoj","Jena"), "Oracle");
		nameHashmap.put(new Name("Mitali","Jena"), "LTI");
		System.out.println(nameHashmap.toString());
		
		HashMap<Name, String> nameHashmap2 = new HashMap<>();
	}
	
}
