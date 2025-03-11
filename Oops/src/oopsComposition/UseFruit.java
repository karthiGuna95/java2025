package oopsComposition;
//Composition:
public class UseFruit {
	public static void main(String[] args) {
		Apple a = new Apple();
		a.name = "APPLE";
		a.price = 250;
		a.color = "red";
		
		Fruit f = new Fruit();
		f.type = "VITAMIN A";
		f.isSweet = true;
		f.apple = a;
		
		System.out.println(f.type+","+f.isSweet+","+f.apple.name+","+f.apple.price+","+f.apple.color);
	}
}
class Apple {
	String name ;
	int price;
	String color;
}
class Fruit {
	String type;
	boolean isSweet;
	Apple apple;
}

