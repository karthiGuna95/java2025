package testModuleOopsConditions;

public class UseMask {
	public static void main(String[] args) {
		Mask m1 = new Mask();
		m1.setBrand("indra");
		m1.setPrice(10);
		m1.setColor("Black");
		m1.setIsN95(true);
		
		Mask m2 = new Mask();
		m2.setBrand("Asura");
		m2.setPrice(15);
		m2.setColor("Green");
		m2.setIsN95(true);
		
		Mask m3 = new Mask();
		m3.setBrand("Madara");
		m3.setPrice(20);
		m3.setColor("Blue");
		m3.setIsN95(true);
		
		Mask[] m = {m1,m2,m3};
		int max = 0;
		for(int i=0 ;i<m.length ; i++) {
			if(m[i].getPrice() > max) {
			max = m[i].getPrice();
			}
			if(m[i].getPrice()<=15) {
				m[i].setIsN95(false);
			}
			System.out.println(m[i].getBrand()+" "+m[i].getPrice()+" "+m[i].getColor()+" "+m[i].getIsN95());
			System.out.println(m[i].getIsN95());
		}
		System.out.println("Maximum: "+max);
	}
}
	class Mask {
		private String brand;
		private int price;
		private String color;
		private boolean isN95;
		
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
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean getIsN95() {
			return isN95;
		}
		public void setIsN95(boolean isN95) {
			this.isN95 = isN95;
		}
		
	}
