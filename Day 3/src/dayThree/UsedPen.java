package dayThree;

public class UsedPen {
	public static void main (String[]args) {
		String[] a = args[0].split(",");
		Pen1 P1 = new Pen1();
		P1.Brand = "cello";
		P1.Price = Integer.parseInt(a[1]);
		P1.tipWidth = Float.parseFloat(a[2]);
		
		System.out.println("Brand ="+P1.Brand +" Price ="+P1.Price +" tipWidth ="+P1.tipWidth);
		
		
	}

}
class Pen1{
	String Brand;
	int Price;
	float tipWidth;
}