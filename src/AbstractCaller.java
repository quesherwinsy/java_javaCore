
public class AbstractCaller extends AbstractClass {

	public static void main(String[] args) {
		
		AbstractCaller ac = new AbstractCaller();
		ac.engine();
		ac.safetyguide();
		// own implemented method
		ac.bodycolor();
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("add body color");
	}

}
