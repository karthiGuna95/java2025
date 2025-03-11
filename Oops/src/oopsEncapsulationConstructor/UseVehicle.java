package oopsEncapsulationConstructor;

public class UseVehicle {
	public static void main (String[] args) {
		Vehicle v = new Vehicle("PORSHE","RED",1000000,true);
		System.out.println(v);
		
		v.setName("Ferrari");
		v.setColor("Yellow");
		v.setPrice(2000000);
		v.setIsWarranty(true);
		
		System.out.println(v.getName()+","+v.getColor()+","+v.getPrice()+","+v.getIsWarranty());

	}
}
	class Vehicle {
		private String name;
		private String color;
		private int price;
		private boolean isWarranty;
		
	public Vehicle (String name, String color, int price, boolean isWarranty) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.isWarranty=isWarranty;
	}
	public String toString() {
		return name+","+color+","+price+","+isWarranty;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsWarranty(boolean isWarranty) {
		this.isWarranty=isWarranty;
	}
	public boolean getIsWarranty() {
		return isWarranty;
	}
	}
