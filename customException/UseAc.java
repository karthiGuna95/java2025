package customException;

public class UseAc {
    public static void main(String[] args) {
        Ac[] acUnits = new Ac[5];

        try {
            acUnits[0] = new Ac("Samsung", "AC123", 45000, 12);
            acUnits[1] = new Ac("LG", "CoolBreeze", 48000, 24);
            acUnits[2] = new Ac("Daikin", "ChillPro", 52000, 0); // Will throw NoWarrantyException
            acUnits[3] = new Ac("Voltas", "FrostX", 40000, 18);
            acUnits[4] = new Ac("Hitachi", "ArcticCool", 55000, -5); // Will throw NoWarrantyException
        } catch (NoWarrantyException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Display details of successfully created AC objects
        for (Ac ac : acUnits) {
            if (ac != null) {
                ac.displayAcDetails();
            }
        }
    }
}
class NoWarrantyException extends Exception {
    public NoWarrantyException(String message) {
        super(message);
    }
}

class Ac {
    private String brand;
    private String model;
    private double price;
    private int noOfMonthsWarranty;

    public Ac(String brand, String model, double price, int noOfMonthsWarranty) throws NoWarrantyException {
        if (noOfMonthsWarranty <= 0) {
            throw new NoWarrantyException("Warranty period must be greater than zero.");
        }
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.noOfMonthsWarranty = noOfMonthsWarranty;
    }

    public void displayAcDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price + 
                           ", Warranty: " + noOfMonthsWarranty + " months");
    }
}