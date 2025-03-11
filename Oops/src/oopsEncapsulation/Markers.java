package oopsEncapsulation;

public class Markers {
		private String brand;
		private int price;
		private String color;
		private float tipWidth;
		
	//Using Setters - Void return type with parameter:
		public void setbrand(String brand) {
			this.brand=brand;
		}
		public void setprice(int price) {
			this.price=price;
		}
		public void setcolor(String color) {
			this.color=color;
		}
		public void settipWidth(float tipWidth) {
			this.tipWidth=tipWidth;
		}

	//Using Getters - Return retun type without Parameter:
		public String getbrand() {
			return "camlin";
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
