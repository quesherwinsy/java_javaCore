package collections;

import java.util.ArrayList;

public class arraylistDemo {

	public static void main(String[] args) {
		// array list initialize
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		System.out.println(a);
		a.add(0, "shetty");
		System.out.println(a);
		// a.remove(1);
		// a.remove("java");
		System.out.println(a.get(1));
		System.out.println(a.contains("rahul"));

		System.out.println(a.indexOf("java"));
		System.out.println("array empty? " + a.isEmpty());
		System.out.println("array size: " + a.size());
	}

}
