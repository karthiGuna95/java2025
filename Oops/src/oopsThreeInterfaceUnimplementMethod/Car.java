package oopsThreeInterfaceUnimplementMethod;

public interface Car {
	public String getBrand(String brand);
	public String getColour(String colour);
	public String getModel(String model);
}
 class SportCar implements Car {
	 public String getBrand(String brand) {
		 return brand;
	 }
	 public String getColour(String colour) {
		 return colour;
	 }
	 public String getModel(String model) {
		 return model;
	 }
	 public int getPrice(int price) {
		 return price;
	 }
	 public boolean getIsModified(boolean isModified) {
		 return isModified;
	 }

}
