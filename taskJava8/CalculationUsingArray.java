package taskJava8;

public class CalculationUsingArray {
	public static void main(String[] args) {
		int []a= {10,11,15,12,45,25,89,47};
		MyCal mc = new MyCal();
		Calculation even = mc::getEven;
		Calculation odd = mc::getOdd;
		Calculation max = mc::getMax;
		Calculation min = mc::getMin;
		Calculation total = mc::getTotal;
		
		even.getCal(a);
		odd.getCal(a);
		max.getCal(a);
		min.getCal(a);
		total.getCal(a);
	}

}
interface Calculation {
	public void getCal(int []a);
}