package inheritance;

public class childdemo extends parentdemo {

	public void engine() {
		System.out.println("engine code child class");
	}

	public void color() {
		System.out.println("color inherited is " + colour);
	}

	// function overload
	public void getData(int a, int b) {
		System.out.println("function overload " + a + " " + b);
	}

	// function overload
	public void getData(String a) {
		System.out.println("function overload " + a);
	}

	// function override
	public void audiosystem() {
		System.out.println("audio code implemented child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childdemo cd = new childdemo();
		cd.color();
		cd.audiosystem();
		cd.brake();
		cd.engine();
		cd.getData(1, 2);
		cd.getData("hello");
		cd.audiosystem();
	}

}
