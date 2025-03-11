package testModuleOopsConditions;

public class UseStapler {
	public static void main(String[] args) {
		Stapler s1 = new Stapler();
		s1.setBrand("camlin");
		s1.setPrice(100);
		s1.setColor("black");
		s1.setMaterial("plastic");
		
		Stapler s2 = new Stapler();
		s2.setBrand("DOMS");
		s2.setPrice(120);
		s2.setColor("White");
		s2.setMaterial("plastic");
		
		Stapler s3 = new Stapler();
		s3.setBrand("Apsara");
		s3.setPrice(80);
		s3.setColor("green");
		s3.setMaterial("plastic");
		
		Stapler[] s = {s1,s2,s3};
		for(int i=0 ;i<s.length ; i++) {
			if(s[i].getPrice()>100) {
				System.out.println(s[i].getBrand());

			}
		System.out.println(s[i].getBrand()+s[i].getPrice()+s[i].getColor()+s[i].getMaterial());
	}
	}
	
}
	class Stapler {
		private String brand;
		private int price;
		private String color;
		private String material;
		
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
}
		

