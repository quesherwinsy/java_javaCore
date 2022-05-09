package arrays;

public class arrayDemo {

	public static void main(String[] args) {
		// Array instantiate with static 5 array memory
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		// array instantiate with dynamic 5 array memory
		int b[] = {0,1,2,3,4};
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
