package dayThree;

public class UsePen {
	public static void main(String[]args) {
		Pen P1 = new Pen();
		P1.Brand = "Doms";
		P1.Price = 10;
		P1.isBlueColour = true;
		P1.tipWidth = 1.2f;
		
		Pen P2 = new Pen();
		P2.Brand = "Reynolds";
		P2.Price = 15;
		P2.isBlueColour = true;
		P2.tipWidth = 1.7f;
		
		Pen P3 = new Pen();
		P3.Brand = "camlin";
		P3.Price = 20;
		P3.isBlueColour = true;
		P3.tipWidth = 1.5f;
		
		int average=(P1.Price+P2.Price+P3.Price)/3;
		
		System.out.println(average);
		

		
		
		
	}

}
