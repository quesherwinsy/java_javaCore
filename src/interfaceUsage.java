
public class interfaceUsage implements Interfacesample, InterfaceSample2{

	public static void main(String[] args) {
		// create object that implement methods of Interfacesample interface class
		Interfacesample iu = new interfaceUsage();
		iu.redStop();
		iu.yellowFlash();
		iu.greenGo();
		
		interfaceUsage ii = new interfaceUsage();
		ii.walkStreet();
		
		InterfaceSample2 iu2 = new interfaceUsage();
		iu2.trainrun();
	}
	
	public void walkStreet() {
		System.out.println("walk street");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop");
		
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("yellow flash");
	}

	@Override
	public void trainrun() {
		// TODO Auto-generated method stub
		System.out.println("train run");
	}

}
