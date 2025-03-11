package testModuleOopsConditions;

public class UseTelePhone {
	public static void main(String[] args) {
		TelePhone t1 = new TelePhone();
		t1.setBrand("BSNL");
		t1.setPrice(2000);
		t1.setColor("Black");
		t1.setIsWireless(false);
		
		TelePhone t2 = new TelePhone();
		t2.setBrand("Airtel");
		t2.setPrice(2500);
		t2.setColor("Blue");
		t2.setIsWireless(true);
		
		TelePhone t3 = new TelePhone();
		t3.setBrand("VI");
		t3.setPrice(2800);
		t3.setColor("White");
		t3.setIsWireless(true);
		
		TelePhone[] t = {t1,t2,t3};
		int count=0;
		boolean wireless = true;
		for(int i=0 ; i<t.length ;i++) {
			if(t[i].getIsWireless() == true) {
				wireless = false;
				count++;
				t[i].setPrice(t[i].getPrice()+(t[i].getPrice()*15/100));
			}
			System.out.println(t[i].getBrand()+" "+t[i].getPrice()+" "+t[i].getColor()+" "+t[i].getIsWireless());
			System.out.println(t[i].getPrice());
		}
		System.out.println("IsWireless: "+count);
	}
}
	class TelePhone {
		private String brand;
		private int price;
		private String color;
		private boolean isWireless;
		
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
		public boolean getIsWireless() {
			return isWireless;
		}
		public void setIsWireless(boolean isWireless) {
			this.isWireless = isWireless;
		}
		
	}