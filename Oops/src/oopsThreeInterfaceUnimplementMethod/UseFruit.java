package oopsThreeInterfaceUnimplementMethod;

public class UseFruit {
	public static void main(String[] args) {
		Apple a = new Apple();
		a.getType("Vitamin a");
		a.getQuantity(5000);
		a.getBoxes(100);
		a.getSealed(true);
		System.out.println("Type:"+a.getType("Vitamin a")+", Quantity:"+a.getQuantity(5000)+", Boxes:"+a.getBoxes(100)+", Sealed:"+a.getSealed(true));
	}

}
