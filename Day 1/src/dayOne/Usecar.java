package dayOne;

public class Usecar {
	public static void main(String[]args) {
		Car C1 = new Car();
		C1.brand = "Hyundai";
		C1.Price = 1000000;
		C1.taxPercentage = 15;
		C1.isAirbag = true;
		C1.netPrice = C1.Price +(C1.Price*C1.taxPercentage/100);
		System.out.println("Brand ="+C1.brand+ "\nPrice ="+C1.Price +"\ntaxPercentage ="+C1.taxPercentage +"\nnetPrice ="+C1.netPrice);
		
		Car C2 = new Car();
		C2.brand = "Mahindra";
		C2.Price = 1500000;
		C2.taxPercentage = 23;
		C2.isAirbag = true;
		C2.netPrice = C2.Price+(C2.Price*C2.taxPercentage/100);
		System.out.println("Brand ="+C2.brand+ "\nPrice ="+C2.Price +"\nTaxPercentage ="+C2.taxPercentage +"\nNetPrice ="+C2.netPrice);
		
		Car C3 = new Car();
		C3.brand = "Tata";
		C3.Price = 1200000;
		C3.taxPercentage = 18;
		C3.isAirbag = true;
		C3.netPrice = C3.Price+(C3.Price*C3.taxPercentage/100);
		System.out.println("Brand ="+C3.brand+ "\nPrice ="+C3.Price +"\nTaxPercentage ="+C3.taxPercentage +"\nNetPrice ="+C3.netPrice);
		
	}

}
