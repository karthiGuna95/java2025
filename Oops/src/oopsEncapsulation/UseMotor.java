package oopsEncapsulation;

public class UseMotor {
	public static void main (String[] args) {
		Motor m = new Motor();
		m.setName("PORSHE");
		m.setColor("RED");
		m.setPrice(1000000);
		m.setIsWarranty(true);
		
		System.out.println(m.getName()+","+m.getColor()+","+m.getPrice()+","+m.getIsWarranty());
	}
}
	class Motor {
		private String name;
		private String color;
		private int price;
		private boolean isWarranty;
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
