package super_this_keyword;

public class childDemo extends parentDemo {

	String name = "QaClickAcademy";

	public childDemo() {
		// this super should be in 1st line
		super();
		System.out.println("child class constructor");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
	}

}
