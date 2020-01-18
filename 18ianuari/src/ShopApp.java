public class ShopApp {
    public static void main(String[] args) {
        Product primulProdus = new Product("PrimulProdus", 5, 1, Product.AGE_RESTRICTION_TEENAGER_AND_ABOVE);
        Product doiProdus = new Product("AlDoileaProdus", 1, 1, Product.AGE_RESTRICTION_ADULT_ONLY);
        Customer ion = new Customer("Ion", 16, 10);

        PurchaseManager.processPurchase(primulProdus, ion);
        PurchaseManager.processPurchase(doiProdus, ion);

    }
}
