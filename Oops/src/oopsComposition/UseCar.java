package oopsComposition;
// composition;
public class UseCar {
	public static void main(String[] args) {
		Engine e = new Engine();
		e.brand = "TOYOTA";
		e.cc = 2500;
		e.isWarranty = true;
		
		Car c = new Car();
		c.model = "CRYSTA";
		c.price = 2500000;
		c.color = "RED";
		c.engine = e;
		
		System.out.println(c.model+", "+c.price+", "+c.color+", "+c.engine.brand+", "+c.engine.cc+", "+c.engine.isWarranty);
		System.out.println(c);
	}
}
class Engine {
	String brand;
	int cc;
	boolean isWarranty;
}
class Car {
	String model;
	int price;
	String color;
	Engine engine;
}