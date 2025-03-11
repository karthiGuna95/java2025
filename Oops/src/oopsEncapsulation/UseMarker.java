package oopsEncapsulation;

public class UseMarker {
	public static void main(String[] args) {
		Marker m = new Marker();
		m.setBrand("camlin");
		m.setPrice(100);
		m.setColor("black");
		m.setTipWidth(10.5f);
		
		System.out.println(m.getBrand()+m.getPrice()+m.getColor()+m.getTipWidth());
	}


}
class Marker {
	private String brand;
	private int price;
	private String color;
	private float tipWidth;
	
//Using Setter - void return type with Parameter:	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setTipWidth(float tipWidth) {
		this.tipWidth = tipWidth;
	}
	
//Using Setters - Void return type with parameter:
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public float getTipWidth() {
		return tipWidth;
	}
}