package testModuleOopsConditions;

public class UseStickPen {
	public static void main(String[] args) {
	StickPen s1 = new StickPen();
	s1.setBrand("camlin");
	s1.setPrice(20);
	s1.setColor("black");
	s1.setIsPlastic(true);
	s1.setTipWidth(5);
	
	StickPen s2 = new StickPen();
	s2.setBrand("Doms");
	s2.setPrice(10);
	s2.setColor("purple");
	s2.setIsPlastic(true);
	s2.setTipWidth(4);
	
	StickPen s3 = new StickPen();
	s3.setBrand("camlin");
	s3.setPrice(20);
	s3.setColor("black");
	s3.setIsPlastic(true);
	s3.setTipWidth(6);
	
	StickPen [] s = {s1,s2,s3};
	int total=0;
	for(int i=0 ;i<s.length ; i++) {
		total = s[i].getPrice()+total;
//	  using condition if price is >10 print all iaPlastic = true:
		if(s[i].getPrice()>10) {
			s[i].setIsPlastic(false);
		}
		System.out.println(s[i].getBrand()+" "+s[i].getPrice()+" "+s[i].getColor()+" "+s[i].getIsPlastic()+" "+s[i].getTipWidth());
	}
	System.out.println(total);
	}
}
	class StickPen {
		private String brand;
		private int price;
		private String color;
		private boolean isPlastic;
		private int tipWidth;
		
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
		public boolean getIsPlastic() {
			return isPlastic;
		}
		public void setIsPlastic(boolean isPlastic) {
			this.isPlastic = isPlastic;
		}
		public int getTipWidth() {
			return tipWidth;
		}
		public void setTipWidth(int tipWidth) {
			this.tipWidth = tipWidth;
		}
	}
