package oopsHierarchicalPrivateKeyword;

public class UseFruits {
	public static void main(String[] args) {
		Apple a = new Apple("Good",true,500,"Apple",250,50,true);
		Orange o = new Orange("Medium",true,300,"Orange",150,60,false);
		Mango m = new Mango("Premium",false,400,"Mango",350,200,false);
		
		System.out.println(a);
		System.out.println(o);
		System.out.println(m);

	}

}
	class Fruits {
		private String quality;
		private boolean isSealed;
		private int weight;
		
		public Fruits(String quality,boolean isSealed,int weight) {
			this.quality=quality;
			this.isSealed=isSealed;
			this.weight=weight;
		}
		public String toString() {
			return "Quality:"+quality+", IsSealed:"+isSealed+", Weight:"+weight;
		}
		public void Quality(String quality) {
			this.quality=quality;
		}
		public String Quality() {
			return quality;
		}
		public void IsSealed(boolean isSealed) {
			this.isSealed=isSealed;
		}
		public boolean IsSealed() {
			return isSealed;
		}
		public void Weight(int weight) {
			this.weight=weight;
		}
		public int Weight() {
			return weight;
		}
	}

	class Apple extends Fruits {
		private String name;
		private int price;
		private int quantity;
		private boolean isPacked;
		
		public Apple(String quality,boolean isSealed,int weight,String name,int price,int quantity,boolean isPacked) {
			super(quality,isSealed,weight);
			this.name=name;
			this.price=price;
			this.quantity=quantity;
			this.isPacked=isPacked;
		}
		public String toString() {
			return super.toString()+", Name:"+name+", Price:"+price+", Quantity:"+quantity+", IsPacked:"+isPacked;
		}
		public void Name(String name) {
			this.name=name;
		}
		public String Name() {
			return name;
		}
		public void Price(int price) {
			this.price=price;
		}
		public int Price() {
			return price;
		}
		public void Quantity(int quantity) {
			this.quantity=quantity;
		}
		public int Quantity() {
			return quantity;
		}
		public void IsPacked(boolean isPacked) {
			this.isPacked=isPacked;
		}
		public boolean IsPacked() {
			return isPacked;
		}
	}
	class Orange extends Fruits {
		private String name;
		private int price;
		private int quantity;
		private boolean isPacked;
		
		public Orange(String quality,boolean isSealed,int weight,String name,int price,int quantity,boolean isPacked) {
			super(quality,isSealed,weight);
			this.name=name;
			this.price=price;
			this.quantity=quantity;
			this.isPacked=isPacked;
		}
		public String toString() {
			return super.toString()+", Name:"+name+", Price:"+price+", Quantity:"+quantity+", IsPacked:"+isPacked;
		}
		public void Name(String name) {
			this.name=name;
		}
		public String Name() {
			return name;
		}
		public void Price(int price) {
			this.price=price;
		}
		public int Price() {
			return price;
		}
		public void Quantity(int quantity) {
			this.quantity=quantity;
		}
		public int Quantity() {
			return quantity;
		}
		public void IsPacked(boolean isPacked) {
			this.isPacked=isPacked;
		}
		public boolean IsPacked() {
			return isPacked;
		} 
	}
	class Mango extends Fruits {
		private String name;
		private int price;
		private int quantity;
		private boolean isPacked;
		
		public Mango(String quality,boolean isSealed,int weight,String name,int price,int quantity,boolean isPacked) {
			super(quality,isSealed,weight);
			this.name=name;
			this.price=price;
			this.quantity=quantity;
			this.isPacked=isPacked;
		}
		public String toString() {
			return super.toString()+", Name:"+name+", Price:"+price+", Quantity:"+quantity+", IsPacked:"+isPacked;
		}
		public void Name(String name) {
			this.name=name;
		}
		public String Name() {
			return name;
		}
		public void Price(int price) {
			this.price=price;
		}
		public int Price() {
			return price;
		}
		public void Quantity(int quantity) {
			this.quantity=quantity;
		}
		public int Quantity() {
			return quantity;
		}
		public void IsPacked(boolean isPacked) {
			this.isPacked=isPacked;
		}
		public boolean IsPacked() {
			return isPacked;
		} 
	}

