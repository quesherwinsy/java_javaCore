package arrays;

public class arrayMulti {

	public static void main(String[] args) {
		// instantiate 2 dimension static array 3 row 3 column
		int a[][] = new int[3][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;

		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		a[2][0] = 1;
		a[2][1] = 2;
		a[2][2] = 9;

		// instantiate 2 dimension dynamic array 3 row 3 column
		int b[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		Integer small = null;
		Integer beeg = null;
		int scol = 0;

		// traverse array then get smallest value and column number
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
				if (small == null) {
					small = a[i][j];
				} else if (a[i][j] < small) {
					small = a[i][j];
					scol = j;
				}
			}
			System.out.println(" ");
		}

		// traverse array column then get largest value
		for (int i = 0; i < a.length; i++) {
			if (beeg == null) {
				beeg = a[i][scol];
			} else if (a[i][scol] > beeg) {
				beeg = a[i][scol];
			}
		}
		System.out.println("smallest value: " + small);
		System.out.println("biggest value: " + beeg);
	}

}
