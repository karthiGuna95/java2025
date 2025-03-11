package reviewStudy;

public class EncapsulationMarker {
	public static void main(String[] args) {
		Marker m = new Marker("CAMLIN",25,"RED");
	
		m.setBrand("DOMS");
		m.setPrice(20);
		m.setColour("Black");
		
		System.out.println(m);
		System.out.println(m.getBrand()+m.getPrice()+m.getColour());
	}

}
class Marker {
	private String brand;
	private int price;
	private String colour;
// using constructor:	
	public Marker(String brand,int price,String colour) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	}
//using ToString():
	public String toString() {
		return brand+","+price+","+colour;
	}
		
//using Setters and Getters:
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

}