public class Appliance extends ElectronicsProduct {
    public Appliance(String name, double price, Integer quantity, String ageRestriction) {
        super(name, price, quantity, ageRestriction, 6);
    }

    public double getPrice() {
        if (getQuantity() <50)
            return super.getPrice() * 1.05;
        else {
            return super.getPrice();
        }
    }
}
