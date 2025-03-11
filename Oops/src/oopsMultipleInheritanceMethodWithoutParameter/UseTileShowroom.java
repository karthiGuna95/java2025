package oopsMultipleInheritanceMethodWithoutParameter;

public class UseTileShowroom {
	public static void main(String[] args) {
		Hub h = new Hub();
		System.out.println(h.getBrand()+"\n"+h.getPrice());
		h.getModel();
		h.getQuality();
		System.out.println(h.getQuantity()+"\n"+h.getCoated()+"\n"+h.getWarranty());
	}
}
