package oopsMultipleInheritanceMethodWithParameter;

public interface Showroom {
	public void getBrand(String brand);
	public void getPrice(int price);
	public void getYear(int year);

}
	interface LuxCar {
	public String getModel(String model);
	public float getTax(float tax);
}
	class NoCar implements LuxCar,Showroom {
		public void getBrand(String brand) {
			System.out.println(brand);
		}
		public void getPrice(int price) {
			System.out.println(price);
		}
		public void getYear(int year) {
			System.out.println(year);
		}
		public String getModel(String model) {
			return model;
		}
		public float getTax(float tax) {
			return tax;
		}
	}
