package dayTwo;

public class UseAccountHolder {
	public static void main(String[]args) {
		AccountHolder A1 = new AccountHolder();
		A1.name = "mano";
		A1.age = 26;
		A1.ismale = true;
		A1.accountNumber = 28330485612583l;
		A1.monthlyIncome =21000;
		A1.savingPercentage = 18;
		A1.savingsamount = (A1.monthlyIncome*A1.savingPercentage)/100;
		System.out.println(A1.savingsamount);
		
		AccountHolder A2 = new AccountHolder();
		A2.name = "Savithri";
		A2.age = 25;
		A2.ismale = false;
		A2.accountNumber = 28330485612584l;
		A2.monthlyIncome =20000;
		A2.savingPercentage = 20;
		A2.savingsamount = (A2.monthlyIncome*A2.savingPercentage)/100;
		System.out.println(A2.savingsamount);
		
		AccountHolder A3 = new AccountHolder();
		A3.name = "Kamban";
		A3.age = 30;
		A3.ismale = true;
		A3.accountNumber = 28330485612585l;
		A3.monthlyIncome =30000;
		A3.savingPercentage = 10;
		A3.savingsamount = (A3.monthlyIncome*A3.savingPercentage)/100;
		System.out.println(A3.savingsamount);
		
		System.out.println("A1.savingsamount ="+ (A1.monthlyIncome*A1.savingPercentage)/100 +"\nA2.savingsamount = "+(A2.monthlyIncome*A2.savingPercentage)/100 +"\nA3.savingsamount = "+(A3.monthlyIncome*A3.savingPercentage)/100);
			
		
	}

}
