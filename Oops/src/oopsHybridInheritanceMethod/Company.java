package oopsHybridInheritanceMethod;

// Parent1 class Using Interface:
public interface Company {
	public void getName(String name);
	public void getType(String type);
}
// Parent2 class using Interface:
	interface Production {
	public String getProduct(String product);
	public void getPrice(int price);

	}
// Parent class implements both interface:	
	class SmallCompany implements Company,Production {
		public void getName(String name) {
			System.out.println(name);
		}
		public void getType(String type) {
			System.out.println(type);
		}
		public String getProduct(String product) {
			return product;
		}
		public void getPrice(int price) {
			System.out.println(price);
		}
		public int getYear(int year) {
			return year;
		}
	}
// Child1 class using (extends) access parent class:	
	class Small extends SmallCompany {
		public void getName(String name) {
			System.out.println(name);
		}
		public void getType(String type) {
			System.out.println(type);
		}
		public String getProduct(String product) {
			return product;
		}
		public void getPrice(int price) {
			System.out.println(price);
		}
		public int getYear(int year) {
			return year;
		}
		public boolean getCertified(boolean certified) {
			return certified;
		}
	}
// Child2 class using (extends) to access parent class:
	class Large extends SmallCompany {
		public void getName(String name) {
			System.out.println(name);
		}
		public void getType(String type) {
			System.out.println(type);
		}
		public String getProduct(String product) {
			return product;
		}
		public void getPrice(int price) {
			System.out.println(price);
		}
		public int getYear(int year) {
			return year;
		}
		public void getListed(boolean listed) {
			System.out.println(listed);
		}
		
	}
