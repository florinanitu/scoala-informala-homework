public class ElectronicsProduct extends Product {
   private int guaranteePeriod;

    public ElectronicsProduct() {
    }

    public ElectronicsProduct(String name, double price, int quantity, String ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
