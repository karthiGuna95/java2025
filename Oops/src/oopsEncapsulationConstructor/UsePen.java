package oopsEncapsulationConstructor;

public class UsePen {
	public static void main(String[] args) {
		Pen p1 = new Pen("BMW",10000,"BLUE");
	// Using constructor and toString() :	
		System.out.println(p1);
		
	// using condition if brand is BMW change the price to 20000000:	
		if(p1.getbrand().equals("BMW")) {
		p1.setprice(2000000);
		System.out.println(p1);
		}
		
	// Using constructor and without using toString() :	
		p1.setbrand("RollsRoyce");
		p1.setprice(2000000);
		p1.setcolor("Black");
		System.out.println(p1.getbrand()+","+p1.getprice()+","+p1.getcolor());
	}
}
class Pen {
	private String brand;
	private int price;
	private String color;
	
public Pen (String brand,int price, String color) {
	this.brand=brand;
	this.price=price;
	this.color=color;
}

public void setbrand(String brand) {
	this.brand=brand;
}
public void setprice(int price) {
	this.price=price;
}
public void setcolor(String color) {
	this.color=color;
}
public String getbrand() {
	return brand;
}
public int getprice() {
	return price;
}
public String getcolor() {
	return color;
}
public String toString() {
	return brand+","+price+","+color;
}

}