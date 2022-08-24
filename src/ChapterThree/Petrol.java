package ChapterThree;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("island", "fuel", 20, 166.24, 20);

        System.out.println("The station's location: " + petrolPurchase.getStationLocation());
        System.out.println("The type of petrol: " + petrolPurchase.getTypeOfPetrol());
        System.out.println("The purchase quantity in liters: " + petrolPurchase.getPurchaseQuantity());
        System.out.println("The price per liter: " + petrolPurchase.getPricePerLiter());
        System.out.println("The percentage discount %: " + petrolPurchase.getPercentageDiscount());
        System.out.println("The purchase amount: " + petrolPurchase.getPurchaseAmount());
        System.out.println();

        petrolPurchase.setStationLocation("Lagos");
        petrolPurchase.setTypeOfPetrol("fuel");
        petrolPurchase.setPurchaseQuantity(100);
        petrolPurchase.setPricePerLiter(166.24);
        petrolPurchase.setPercentageDiscount(20);

        System.out.println("The station's location: " + petrolPurchase.getStationLocation());
        System.out.println("The type of diesel: " + petrolPurchase.getTypeOfPetrol());
        System.out.println("The purchase quantity in liters: " + petrolPurchase.getPurchaseQuantity());
        System.out.println("The price per liter: " + petrolPurchase.getPricePerLiter());
        System.out.println("The percentage discount %: " + petrolPurchase.getPercentageDiscount());
        System.out.println("The purchase amount: " + petrolPurchase.getPurchaseAmount());

    }
}
