package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapDemo {

	public static void main(String[] args) {
		// initialize hash map key and value pair
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "rahul");
		hm.put(1, "hello");
		hm.put(2, "shetty");
		hm.put(3, "bye");

		System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		hm.remove(0);
		System.out.println(hm);
		// get all key/value then convert map (unordered) into set (ordered)
		Set es = hm.entrySet();
		Iterator it = es.iterator();

		while (it.hasNext()) {
			// map casting separates key and value in the iterator
			Map.Entry mp = (Map.Entry) it.next();
			System.out.print(mp.getKey() + " ");
			System.out.println(mp.getValue());
		}
		
		// initialize hash table key and value pair
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "rahul");
		ht.put(1, "hello");
		ht.put(2, "shetty");
		ht.put(3, "bye");
		System.out.println(ht);
	}

}
