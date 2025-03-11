package oopsHierarchicalInheritance;

public class UseFruit {
	public static void main(String[] args) {
		Apple a = new Apple();
		a.quality="Good";
		a.isSealed=true;
		a.weight=500.4f;
		a.name="Apple";
		a.price=250;
		a.quantity=50;
		a.isPacked=true;
		
		System.out.println("Quality:"+a.quality+", IsSealed:"+a.isSealed+", Weight:"+a.weight+
							", Name:"+a.name+", Price:"+a.price+", Quantity:"+a.quantity+", IsPacked:"+a.isPacked);
		
		Orange o = new Orange();
		o.quality="Good";
		o.isSealed=true;
		o.weight=500.4f;
		o.name="Orange";
		o.price=150;
		o.quantity=100;
		o.isPacked=true;
		
		System.out.println("Quality:"+o.quality+", IsSealed:"+o.isSealed+", Weight:"+o.weight+
				", Name:"+o.name+", Price:"+o.price+", Quantity:"+o.quantity+", IsPacked:"+o.isPacked);
		
		Mango m = new Mango();
		m.quality="Good";
		m.isSealed=true;
		m.weight=500.4f;
		m.name="Mango";
		m.price=350;
		m.quantity=500;
		m.isPacked=true;
		
		System.out.println("Quality:"+m.quality+", IsSealed:"+m.isSealed+", Weight:"+m.weight+
				", Name:"+m.name+", Price:"+m.price+", Quantity:"+m.quantity+", IsPacked:"+m.isPacked);
	}

}
	class Fruit {
		String quality;
		boolean isSealed;
		float weight;
	}
	class Apple extends Fruit {
		String name;
		int price;
		int quantity;
		boolean isPacked;
	}
	class Orange extends Fruit {
		String name;
		int price;
		int quantity;
		boolean isPacked;
	}
	class Mango extends Fruit {
		String name;
		int price;
		int quantity;
		boolean isPacked;
	}
