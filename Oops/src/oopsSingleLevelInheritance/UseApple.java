package oopsSingleLevelInheritance;

public class UseApple {
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
