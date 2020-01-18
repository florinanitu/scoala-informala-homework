public class Computer extends ElectronicsProduct {
    public Computer(String name, double price, Integer quantity, String ageRestriction) {
        super(name, price, quantity, ageRestriction, 24);
    }

    public double getPrice() {
        if (getQuantity() > 1000)
            return super.getPrice() * 0.95;
        else {
            return super.getPrice();
        }
    }


}
