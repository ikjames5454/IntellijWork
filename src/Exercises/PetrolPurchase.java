package Exercises;
public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantityPurchaseInLiters;
    private double pricePerLiter;
    private double percentageDiscount;

    public  PetrolPurchase (String stationLocation, String petrolType, int quantityPurchaseInLiters, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityPurchaseInLiters = quantityPurchaseInLiters;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }
    public String getPetrolType(){
        return petrolType;
    }
    public void setQuantityPurchaseInLiters(int quantityPurchaseInLiters){
        this.quantityPurchaseInLiters = quantityPurchaseInLiters;
    }
    public int getQuantityPurchaseInLiters(){
        return quantityPurchaseInLiters;
    }
    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
    public double getPricePerLiter(){
        return pricePerLiter;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public double getPurchaseAmount() {
        double netPurchaseAmount = getQuantityPurchaseInLiters() * getPricePerLiter();
        double netAmount = netPurchaseAmount - getPercentageDiscount();
        return netAmount;
    }
}
