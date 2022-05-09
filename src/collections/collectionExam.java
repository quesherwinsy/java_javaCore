package collections;

import java.util.ArrayList;

public class collectionExam {

	public static void main(String[] args) {
		// array instantiate and initialize
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// print unique number in array and print number of times repeated
		// 4 repeat 3x, 5 repeat 3x, 6 repeat 2x, 9 repeat 1x

		// 1 - create empty array list
		// a- check if number exist in array list
		// b- if not exist - push to array list
		// c- if exist - do not push to array list, create separate count
		// 2 - print unique number from array list

		ArrayList<Integer> al = new ArrayList<Integer>();

		int rep = 0;
		for (int i = 0; i < a.length; i++) {
			if (!al.contains(a[i])) {
				al.add(a[i]);
				for (int j = i; j < a.length; j++) {
					if (a[i] == a[j]) {
						rep++;
					}
				}
				System.out.println("value " + a[i] + " repeats " + rep);
				if (rep == 1) {
					System.out.println("unique value is " + a[i]);
				}
				rep = 0;
			}
		}
	}
}
