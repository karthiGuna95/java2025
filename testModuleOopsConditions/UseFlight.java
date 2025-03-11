package testModuleOopsConditions;

public class UseFlight {
	public static void main(String[] args) {
		Flight f1 = new Flight();
		f1.setBrand("Emirates");
		f1.setPrice(10000);
		f1.setColor("RED WHITE");
		f1.setMaterial("Carbon Fiber");
		f1.setNoOfSeats(1000);
		
		Flight f2 = new Flight();
		f2.setBrand("Luftansa");
		f2.setPrice(25000);
		f2.setColor("BLUE WHITE");
		f2.setMaterial("Carbon Fiber");
		f2.setNoOfSeats(700);
		
		Flight f3 = new Flight();
		f3.setBrand("Etihad");
		f3.setPrice(20000);
		f3.setColor("BLUE RED");
		f3.setMaterial("Carbon Fiber");
		f3.setNoOfSeats(1500);
		
		Flight[] f= {f1,f2,f3};
		for(int i=0 ;i<f.length ; i++) {
			if(f[i].getNoOfSeats() > 800) {
			System.out.println("SUPER JUMBO");
		}
		else {
			System.out.println("Minimum Seat");
		}
			System.out.println(f[i].getBrand()+" "+f[i].getPrice()+" "+f[i].getColor()+" "+f[i].getMaterial()+" "+f[i].getNoOfSeats());
		}
	}
		
}
	class Flight {
		private String brand;
		private int price;
		private String color;
		private String material;
		private int noOfSeats;
		
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
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public int getNoOfSeats() {
			return noOfSeats;
		}
		public void setNoOfSeats(int noOfSeats) {
			this.noOfSeats = noOfSeats;
		}
		
		
	}
