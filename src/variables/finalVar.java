package variables;

public class finalVar {

	final void getData() {
		System.out.println("final method");
	}

	public static void main(String[] args) {
		// variable that cannot be updated
		final int i = 4;
	}

}
