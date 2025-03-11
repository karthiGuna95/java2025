package dayThree;

public class UseStudent {
	public static void main(String[]args) {
		Student S1 = new Student();
		S1.name = "siva";
		S1.id = 234;
		S1.age = 14;
		S1.std = 9;
		S1.attendencePercentage = 75;
		S1.totalWorkingDays = 240;
		S1.noOfDaysPresent = (S1.totalWorkingDays*S1.attendencePercentage)/100;
		System.out.println(S1.noOfDaysPresent);
		
		Student S2 = new Student();
		S2.name = "mari";
		S2.id = 236;
		S2.age = 15;
		S2.std = 10;
		S2.attendencePercentage = 80;
		S2.totalWorkingDays = 240;
		S2.noOfDaysPresent = (S2.totalWorkingDays*S2.attendencePercentage)/100;
		System.out.println(S2.noOfDaysPresent);
		
		Student S3 = new Student();
		S3.name = "mari";
		S3.id = 237;
		S3.age = 13;
		S3.std = 8;
		S3.attendencePercentage = 90;
		S3.totalWorkingDays = 240;
		S3.noOfDaysPresent = (S3.totalWorkingDays*S3.attendencePercentage)/100;
		System.out.println(S3.noOfDaysPresent);
		
		
		
		
		System.out.println("S1.noOfDaysPresent ="+(S1.totalWorkingDays*S1.attendencePercentage)/100 + "\nS2.noOfDaysPresent = "+(S2.totalWorkingDays*S2.attendencePercentage)/100+ "\nS3.noOfDaysPresent = "+(S3.totalWorkingDays*S3.attendencePercentage)/100);
	}	

}
