package oopsHybridInheritanceMethod;

public class UseCompany {
	public static void main(String[] args) {
		Small s=new Small();
		s.getName("Titan");
		s.getType("WatchComapny");
		System.out.println(s.getProduct("Watch"));
		s.getPrice(5000);
		System.out.println(s.getYear(1982));
		System.out.println(s.getCertified(true));
		
		Large l = new Large();
		l.getName("Sonata");
		l.getType("WatchComapny");
		System.out.println(l.getProduct("Watch"));
		l.getPrice(3000);
		System.out.println(l.getYear(1990));
		l.getListed(true);
	}
}
