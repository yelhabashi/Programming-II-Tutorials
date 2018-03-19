package section6;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {

		// Before Java 5 - [Before Generics]

		// ArrayList oldList = new ArrayList();  // List supports type "Object" (Parent class of all classes) so you can add any type to it
		// oldList.add("String 1"); // Type String -> Accepted
		// oldList.add(1); // Type int -> Accepted
		// oldList.add(true); // Type boolean -> Accepted
		// String s = (String) list.get(0); // Because list is of type object we have to  cast it to the type we want for manipulation later on
		// int i = (int) oldList.get(1);
		// System.out.println("Item 1: " + s + " Item 2: " + i);
		// printList(oldList);

		// [After Generics]

		// ArrayLists
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello"); // Type String -> Accepted
		// list.add(1); // Type int -> Rejected
		list.add("Hey");
		
		System.out.println(list.get(0));
		System.out.println(list);

		// HashMaps
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Book 1");
		map.put(2, "Book 2");

		System.out.println(map.get(1));
		System.out.println(map);

	}

	// public static void printList(List list) // Couldn't apply type safety
	// {
	// Iterator iterator = list.iterator();
	//
	// while(iterator.hasNext())
	// {
	// System.out.println((String) iterator.next());
	// }
	// }

}
