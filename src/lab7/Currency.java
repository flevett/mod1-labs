package lab7;

public class Currency {

    //fields
    private String name;
    private double rateToGBP;


    //constructor
    public Currency (String name, double rateToGBP) {
        this.name = name;
        this.rateToGBP = rateToGBP;
    }

    //getters
    public String getName() {
        return name;
    }

    //behaviours
    public double convertToGBP(double gbpAmount) {
        return gbpAmount * rateToGBP;
    }
}