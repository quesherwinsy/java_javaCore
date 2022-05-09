package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetDemo {

	public static void main(String[] args) {
		// hash set initialize
		HashSet<String> hs = new HashSet<String>();
		hs.add("rahul");
		hs.add("shetty");
		hs.add("academy");
		hs.add("rahul");
		hs.add("QA");
		System.out.println(hs);
		System.out.println("removed object: " + hs.remove("shetty"));
		System.out.println("set empty? " + hs.isEmpty());
		System.out.println("set size: " + hs.size());

		// iterator
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}