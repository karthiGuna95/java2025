package oopsThreeInterfaceUnimplementMethod;

public interface Fruit {
	public String getType(String type);
	public int getQuantity(int quantity);
	public int getBoxes(int boxes);

}
	class Apple implements Fruit {
		public String getType(String type) {
			return type;
		}
		public int getQuantity(int quantity) {
			return quantity;
		}
		public int getBoxes(int boxes) {
			return boxes;
		}
		public boolean getSealed(boolean sealed) {
			return sealed;
		}
	}
