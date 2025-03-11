package oopsEncapsulation;

public class UseMarkers {
	public static void main(String[] args) {
		Marker m = new Marker();
		m.setBrand("camlin");
		m.setPrice(100);
		m.setColor("black");
		m.setTipWidth(10.5f);
		
		System.out.println(m.getBrand()+m.getPrice()+m.getColor()+m.getTipWidth());
	}


}
