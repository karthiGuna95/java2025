package testModuleOopsConditions;

public class UseTableFan {
	public static void main(String[] args) {

		TableFan t1 = new TableFan();
		t1.setBrand("Crompton");
		t1.setPrice(2000);
		t1.setColor("BLUE");
		t1.setLogo("CG");
		t1.setPowerSource("electric");
		t1.setTax(10);
		t1.setNetPrice(2000+10);
		
		TableFan t2 = new TableFan();
		t2.setBrand("Bajaj");
		t2.setPrice(1500);
		t2.setColor("Red");
		t2.setLogo("BJ");
		t2.setPowerSource("electric");
		t2.setTax(10);
		t2.setNetPrice(1500+10);
		
		TableFan t3 = new TableFan();
		t3.setBrand("General Motors");
		t3.setPrice(2500);
		t3.setColor("Black");
		t3.setLogo("GM");
		t3.setPowerSource("electric");
		t3.setTax(10);
		t3.setNetPrice(2500+10);
		
		TableFan[] t = {t1,t2,t3};
		for(int i=0 ; i<t.length ; i++) {
			System.out.println(t[i].getBrand()+t[i].getPrice()+t[i].getColor()+t[i].getLogo()+t[i].getPowerSource());
			System.out.println(t[i].getNetPrice());
		}
	}

}
	class TableFan {
		private String brand;
		private int price;
		private String color;
		private String logo;
		private String powerSource;
		private int tax;
		private int netPrice;
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
		public String getLogo() {
			return logo;
		}
		public void setLogo(String logo) {
			this.logo = logo;
		}
		public String getPowerSource() {
			return powerSource;
		}
		public void setPowerSource(String powerSource) {
			this.powerSource = powerSource;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		public int getNetPrice() {
			return netPrice;
		}
		public void setNetPrice(int netPrice) {
			this.netPrice = netPrice;
		}
		
		
		
	}
