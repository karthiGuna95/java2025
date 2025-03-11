package CustomException;

public class UseAc {
	
	public static void main(String[] args) {
		Ac ac1=new Ac("Samsung","Inverter",40000,2);
		Ac ac2=new Ac("Panasonic","Inverter",50000,0);
		Ac ac3=new Ac("OGeneral","NonInverter",60000,0);
		Ac ac4=new Ac("Hitachi","Inverter",20000,2);
		Ac ac5=new Ac("BlueStar","Inverter",40000,3);
	try {
		ac1.NoWarrantyAc();
		ac2.NoWarrantyAc();
		ac3.NoWarrantyAc();
		ac4.NoWarrantyAc();
		ac5.NoWarrantyAc();
	}
	catch (NoWarrantyException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Not appropriate");
	}
	}

}
class NoWarrantyException extends Exception {
	public NoWarrantyException(String message) {
		super(message);
	}
}
class Ac {
	private String brand;
	private String model;
	private int price;
	private int noOfMonthsWarranty;
	
	//create a method called NoWarrantyAc:
	public void NoWarrantyAc()throws NoWarrantyException {
		if(noOfMonthsWarranty <=0) {
			throw new NoWarrantyException("NO WARRANTY FOR THE PRODUCT");
		}
		else {
			System.out.println("Warranty Year: "+noOfMonthsWarranty);
		}
	}

	//constructor:
	public Ac(String brand, String model, int price, int noOfMonthsWarranty) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.noOfMonthsWarranty = noOfMonthsWarranty;
	}

	//toString():
//	public String toString() {
//		return "AcBrand=" + brand + ", model=" + model + ", price=" + price + ", noOfMonthsWarranty="
//				+ noOfMonthsWarranty;
//	}

}
