package oopsThreeAbstractClassMethod;

public abstract class Vehicle {
	public String getBrand(String brand) {
		return brand;
	}
	public abstract int getYear(int year);
	public abstract int getPrice(int price);
}
	class Bike extends Vehicle {
		public int getYear(int year) {
			return year;
		}
		public int getPrice(int price) {
			return price;
		}
		public String getModel(String model) {
			return model;
		}
	}