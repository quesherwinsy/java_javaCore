package constructor;

public class constructorDemo {

	// default constructor
	public constructorDemo() {
		System.out.println("default constructor");
	}
	
	// parameterized constructor
	public constructorDemo(int a, int b) {
		System.out.println("paramererized constructor");
	}
	
	public void getData() {
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		// instantiate object
		constructorDemo cd = new constructorDemo();
		constructorDemo cdp = new constructorDemo(1, 2);
	}

}
