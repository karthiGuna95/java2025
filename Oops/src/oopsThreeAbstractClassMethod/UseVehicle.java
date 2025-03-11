package oopsThreeAbstractClassMethod;

public class UseVehicle {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.getBrand("Bajaj");
		b.getYear(2025);
		b.getPrice(100000);
		b.getModel("2Wheeler");
		System.out.println(b.getBrand("Bajaj")+","+b.getYear(2025)+","+b.getPrice(100000)+","+b.getModel("2Wheeler"));
	}

}