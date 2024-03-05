package ProjectCarRental.services;

public class RentalService {
    
    private double pricePerhour;
    private double pricePerDay;

    private BrasilTaxService BRtaxService;

    public RentalService(){
        
    }

    public RentalService(double pricePerhour, double pricePerDay) {
        this.pricePerhour = pricePerhour;
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerhour() {
        return pricePerhour;
    }

    public void setPricePerhour(double pricePerhour) {
        this.pricePerhour = pricePerhour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    


}
