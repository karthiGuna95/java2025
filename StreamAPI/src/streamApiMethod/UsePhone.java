package streamApiMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UsePhone {
	public static void main(String[] args) {
		Phone p1=new Phone(12542,"Red","Samsung",true,30000);
		Phone p2=new Phone(45216,"White","Iphone",true,60000);
		Phone p3=new Phone(96234,"Blue","Reno",false,25000);
		Phone p4=new Phone(23457,"Green","OnePlus",true,40000);
		Phone p5=new Phone(55421,"Grey","Oppo",false,10000);
		Phone p6=new Phone(56421,"Yellow","Reno",false,12000);
		Phone p7=new Phone(23548,"Pink","Mi",true,15000);
		Phone p8=new Phone(65423,"Black","Samsung",false,20000);
		Phone p9=new Phone(52165,"White","Rx",false,80000);
		Phone p10=new Phone(31225,"Black","Techno",true,11000);
		
		List<Phone>phones = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
//using forEach loop:		
		phones.forEach(a->System.out.println(a));
		System.out.println("*");
		
//using filters() and Collectors toCollect()	:
	//filter() is used to give the condition:	collectors used to collect the data:
		List<Phone>whiteColour=phones.stream().filter(f->f.getColour().equals("White")).collect(Collectors.toList());
		whiteColour.forEach(f-> System.out.println(f));
		System.out.println("*");
		
//using map(): while using map enter the required data type inside the object:
		List<Boolean>warranty=phones.stream().map(m->m.getIsWarranty()).collect(Collectors.toList());
		System.out.println(warranty); //(print all in one line):
		warranty.forEach(b-> System.out.println(b)); //(print using forEachLoop):
		
//using count()	:
		long count = phones.stream().count();
		System.out.println(count);
		System.out.println("*");
		
//using count().find isWarranty count:
		long count1 = phones.stream().filter(f->f.getIsWarranty()==true).count();
		System.out.println(count1); //to print:
		System.out.println("*");	
		
//using map() if price > 20000 print only brand:
		List<String>name=phones.stream().filter(f->f.getPrice()>20000).map(f->f.getBrand()).collect(Collectors.toList());
		System.out.println(name); // 
		System.out.println("*"); // use forEach loop to get one by one:
		
//using max() : using comparable::compareTo : to get single output:
		Integer maxPrice = phones.stream().map(m->m.getPrice()).max(Comparable::compareTo).get();
		System.out.println(maxPrice);//to get the max Price:
		System.out.println("*");
//using min():minimum:  using comparable::compareTo : to get single output:
		Integer minPrice = phones.stream().map(m->m.getPrice()).min(Comparable::compareTo).get();
		System.out.println(minPrice);
		System.out.println("*");
		
//using max(): using Comparator::comparing() to get an whole Object:
		Phone maxi = phones.stream().max(Comparator.comparing(Phone::getPrice)).get();
		System.out.println(maxi); //to get the max price object.
		System.out.println("*using colour object");
		Phone maxColour = phones.stream().max(Comparator.comparing(Phone::getColour)).get();
		System.out.println(maxColour);
		System.out.println("*");
		
//using sorted(): to getPrice in sorted:
		List<Integer> srt = phones.stream().map(m->m.getPrice()).sorted().collect(Collectors.toList());
		System.out.println(srt);
		System.out.println("*");
		
//using sorted(): to getPrice in reverse order	:
		List<Integer> srt1 = phones.stream().map(m->m.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(srt1);
		System.out.println("*");
		
//using sorted(): to get the whole object: in Ascending order:
		List<Phone> sr = phones.stream().sorted(Comparator.comparing(Phone::getPrice)).collect(Collectors.toList());
		System.out.println(sr);
		System.out.println("*");
		
//using sorted(): to get the whole object: in descending order: 
		List<Phone> sr1 = phones.stream().sorted(Comparator.comparing(Phone::getPrice).reversed()).collect(Collectors.toList());
		System.out.println(sr1);
		System.out.println("*");
		
//using skip(): to skip the object till skip value:
		List<Phone> sk = phones.stream().skip(2).collect(Collectors.toList());
		System.out.println(sk);
		System.out.println("*");
//using skip(): to skip the object till skip value in brand variable:
		List<String> sk1 = phones.stream().map(m->m.getBrand()).skip(2).collect(Collectors.toList());
		System.out.println(sk1);
		System.out.println("*");
		
//using limit(): to limit the object to limit value:
		List<Phone> skl = phones.stream().limit(2).collect(Collectors.toList());
		System.out.println(skl);
		System.out.println("*");
//using limit(): to skip the object till skip value in brand variable:
		List<String> skl1 = phones.stream().map(m->m.getBrand()).limit(2).collect(Collectors.toList());
		System.out.println(skl1);
		System.out.println("*");
		
//using sorted() and reversed() , limit()	: print the max 3 price objects: using price:
		List<Phone> max3 = phones.stream().sorted(Comparator.comparing(Phone::getPrice).reversed()).limit(3).collect(Collectors.toList());
		System.out.println(max3);
		System.out.println("*");
		
//using distinct() ; to get the unique value:
		List<Boolean>dis=phones.stream().map(m->m.getIsWarranty()).distinct().collect(Collectors.toList());
		System.out.println(dis);
		System.out.println("*");
		//List<Phone>dis1=phones.stream().distinct().collect(Collectors.toList());
		//System.out.println(dis1); // we cannot find using object in distinct():

//using findFirst(): to find the first object:
		Phone first = phones.stream().findFirst().get();
		System.out.println(first);
		System.out.println("*");
//using findFirst(): to find the min object:
		Phone mini = phones.stream().sorted(Comparator.comparing(Phone::getPrice)).findFirst().get();
		System.out.println(mini);
//using findFirst(): to find the max object:
		Phone maxim = phones.stream().sorted(Comparator.comparing(Phone::getPrice).reversed()).findFirst().get();
		System.out.println(maxim);
		System.out.println("*");
		
//using anyMatch() : to find the matching value in the object:
		boolean same = phones.stream().anyMatch(a->a.getBrand().equals("Iphone"));
		System.out.println(same);
		boolean same1 = phones.stream().anyMatch(a->a.getPrice()==20000);
		System.out.println(same1);
		System.out.println("*");
		
//using set(): to print the values:
		Set<String>sn=phones.stream().map(m->m.getBrand()).collect(Collectors.toSet());
		System.out.println(sn);
		
//Using toMap(): to print the values:
		Map<Integer,Phone> toMap = phones.stream().collect(Collectors.toMap(m->m.getPrice(),n->n));
		toMap.forEach((m,n)->System.out.println(m+" "+n)); // print using forEach loop:
		System.out.println("*");
		
//using summingInt(): to get the sum of total price:
		int sum = phones.stream().collect(Collectors.summingInt(s->s.getPrice()));
		System.out.println(sum);
//using summingInt(): to get the sum of total Id:
		int sum1 = phones.stream().collect(Collectors.summingInt(q->q.getId()));
		System.out.println(sum1);
		System.out.println("*");
		
//using groupingBy(): to find the count of duplicates:
		Map<String,Long> gb = phones.stream().collect(Collectors.groupingBy(g->g.getBrand(),Collectors.counting()));
		System.out.println(gb);
	//	gb.forEach(gbe-> {System.out.println(gbe);});
		System.out.println("*");
		
// find the color red increase price by 10%:
		List<Phone> ccl = phones.stream().map(m->
		{
					if(m.getColour().equals("Red")) {
						m.setPrice(m.getPrice()+m.getPrice()*10/100);
				}
				return m;})
				.collect(Collectors.toList());

		ccl.forEach(c1-> System.out.println(c1));

	}
}
class Phone {
	private int id;
	private String colour;
	private String brand;
	private boolean isWarranty;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean getIsWarranty() {
		return isWarranty;
	}
	public void setIsWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Phone(int id, String colour, String brand, boolean isWarranty, int price) {
		this.id = id;
		this.colour = colour;
		this.brand = brand;
		this.isWarranty = isWarranty;
		this.price = price;
	}
	public String toString() {
		return "MobileId=" + id + ", colour=" + colour + ", brand=" + brand + ", isWarranty=" + isWarranty+ ", price=" + price;
	}
	
	
	
}
