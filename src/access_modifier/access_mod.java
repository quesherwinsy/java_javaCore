package access_modifier;

public class access_mod {

	// default variable
	int i = 5;

	// default method, can be access within the package only
	void getData0() {
		System.out.println("default method");
	}

	// public method, can be accessed outside the package
	public void getData1() {
		System.out.println("public method");
	}

	// private variable

	// private method, cannot be accessed outside the class
	private void getData2() {
		System.out.println("private method");
	}

	// protected method, can be accessed by one who inherit or within same package
	protected void getData3() {
		System.out.println("protected method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access_mod am = new access_mod();
	}

}
