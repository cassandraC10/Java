package ChapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int purchaseQuantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int purchaseQuantity,
                          double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.purchaseQuantity = purchaseQuantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfDiesel) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount() {
        return purchaseQuantity * pricePerLiter * (1 - percentageDiscount / 100);
    }
}
