package testModuleOopsConditions;

public class UseWaterBottle {
	public static void main(String[] args) {
		WaterBottle w1 = new WaterBottle();
		w1.setBrand("milton");
		w1.setPrice(100);
		w1.setColor("black");
		w1.setIsPlastic(true);
		
		WaterBottle w2 = new WaterBottle();
		w2.setBrand("bisleri");
		w2.setPrice(80);
		w2.setColor("blue");
		w2.setIsPlastic(true);
		
		WaterBottle w3 = new WaterBottle();
		w3.setBrand("Aqua");
		w3.setPrice(150);
		w3.setColor("white");
		w3.setIsPlastic(true);
		
		WaterBottle[] w = {w1,w2,w3};
		int count = 0;
		for(int i=0 ;i<w.length ; i++) {
			if(w[i].getIsPlastic() == true) {
				count++;
			}
			System.out.println(w[i].getBrand()+" "+w[i].getPrice()+" "+w[i].getColor()+" "+w[i].getIsPlastic());
		}
		System.out.println(count);
	}
}
	class WaterBottle {
		private String brand;
		private int price;
		private String color;
		private boolean isPlastic;
		
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
	}
