public class PurchaseManager {
    public static void processPurchase(Product product, Customer customer){
    if(customer.getBalance()-product.getPrice()<0)
        System.out.println("Ups. Looks like you don't have enough money");
    else customer.setBalance(customer.getBalance()-product.getPrice());
    product.setQuantity(product.getQuantity()-1);

    if(product.getQuantity()<0){
        System.out.println();
    }

        if(product.getAgeRestriction().equals(Product.AGE_RESTRICTION_TEENAGER_AND_ABOVE)) {
            if(customer.getAge() < 12) {
                System.out.println("Esti prea mic pentru produsul asta, produsul este restrictionat celor care nu sunt adulti sau adolescenti!");
            }
        }

        if(product.getAgeRestriction().equals(Product.AGE_RESTRICTION_ADULT_ONLY)) {
            if(customer.getAge() < 18) {
                System.out.println("Esti prea mic pentru produsul asta, produsul este restrictional celor care nu sunt adulti!");
            }
        }
    }
}


