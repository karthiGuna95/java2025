package oopsMultipleInheritanceMethodWithoutParameter;

public interface TileShowroom {
	public String getBrand();
	public int getPrice();
	public void getModel();
}
	interface SubShowroom {
		public void getQuality();
		public int getQuantity();
		public boolean getCoated();
	}
	class Hub implements TileShowroom,SubShowroom {
		public String getBrand() {
			return "JOHNSON";
		}
		public int getPrice() {
			return 250;
		}
		public void getModel() {
			System.out.println("DOUBLE COATED");
		}
		public void getQuality() {
			System.out.println("Premium");
		}
		public int getQuantity() {
			return 500;
		}
		public boolean getCoated() {
			return true;
		}
		public boolean getWarranty() {
			return true;
		}
	}
