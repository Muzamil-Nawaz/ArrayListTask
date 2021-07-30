
public class UberFareCalculator{
    public static final double SERVICE_FEE = 3.45;
    public static final double BASE_FEE = 7.75;
    public static final double PER_MINUTE_COST = 0.84;
    public static final double PER_MILEDRIVEN_COST = 2.23;

    public static void main(String[] args){
        double minsInCar = 10;
        double milesDriven = 20;
        double totalTripCost;
        minsInCar = 10 * 0.84;
        milesDriven = 20 * 2.23;
        totalTripCost = minsInCar + milesDriven + BASE_FEE + SERVICE_FEE;

        System.out.println("yikes, that's expensive!\nMiles Driven: "+milesDriven+"\n" +
                "Minutes in trip: "+minsInCar+"\n" +
                "Total trip cost: "+totalTripCost+"\n" +
                "Surge pricing: "+totalTripCost*2.5);
    }
}