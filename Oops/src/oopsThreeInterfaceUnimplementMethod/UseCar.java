package oopsThreeInterfaceUnimplementMethod;

public class UseCar {
	public static void main(String[] args) {
		SportCar c = new SportCar();
		c.getBrand("AUDI");
		c.getColour("RED");
		c.getModel("R8");
		c.getPrice(10000000);
		c.getIsModified(true);
		System.out.println("Brand:"+c.getBrand("AUDI")+", Colour:"+c.getColour("RED")+", Model:"+c.getModel("R8")+", Price:"+c.getPrice(10000000)+", IsModified:"+c.getIsModified(true));
		
// we can create only interface object in this :		
		Car c1=new SportCar();
		c1.getBrand("AUDI");
		c1.getColour("RED");
		c1.getModel("R8");
		System.out.println("Brand:"+c1.getBrand("AUDI")+", Colour:"+c1.getColour("RED")+", Model:"+c1.getModel("R8"));
	}
}
	

