package oopsPolymorphismMethodOverRiding;

public class UseAxisbank {
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		System.out.println(axis.getInterest(1000));
	}

}
	class Bank {
		public int getInterest(int amount) {
			return amount*10/100;
		}
	}
	class AxisBank extends Bank {
		public int getInterest(int amount) {
			return amount*15/100;
		}
	}
