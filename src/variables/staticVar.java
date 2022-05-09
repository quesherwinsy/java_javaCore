package variables;

public class staticVar {

	// instance variables
	String name;
	String address;
	// class variable static
	static String city;
	static int i;
	static {
		city = "bangalore";
		i = 0;
	}

	public staticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(this.name + " " + i);
	}

	public String getAddress() {
		return address;
	}

	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVar sv1 = new staticVar("bob", "marthalli");
		staticVar sv2 = new staticVar("ram", "jayangar");

		System.out.println(sv1.getAddress() + " " + city);
		System.out.println(sv2.getAddress() + " " + city);

		staticVar.getCity();
		staticVar.i = 5;
	}

}
