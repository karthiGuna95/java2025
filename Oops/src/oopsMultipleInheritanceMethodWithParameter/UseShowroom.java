package oopsMultipleInheritanceMethodWithParameter;

public class UseShowroom {
	public static void main(String[] args) {
		NoCar n = new NoCar();
	// sys.o for void type:	
		n.getBrand("TOYOTA");
		n.getPrice(2000000);
		n.getYear(2025);
	//	sys.o for return Type:
		System.out.println("Model:"+n.getModel("Crysta")+", Tax:"+n.getTax(15.8f));
		
	// object creation and sys.o for interface LuxCar:
		LuxCar l = new NoCar();
		System.out.println(l.getModel("Crysta")+l.getTax(15.8f));
		// object creation and sys.o for interface LuxCar:
		Showroom s = new NoCar();
		s.getBrand("TOYOTA");
		s.getPrice(2000000);
		s.getYear(2025);
	}

}
