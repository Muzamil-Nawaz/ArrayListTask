
import java.util.Scanner;


public class VendingMachineCalculator {
    static double itemCost,totalRemainingAmount;

    static int quarters =0,dimes=0,nickels=0,dollars=0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item cost e.g. 1.45 :");
        itemCost = sc.nextDouble();
        System.out.print("Enter dollars put in machine, e.g. 5 is 5 dollars :");
        double inputDollars = sc.nextDouble();
        dollars =  (int) inputDollars*100;
        
        calculateChange();
        System.out.println("Item Cost: $"+itemCost+", Dollars input: $"+inputDollars+", change amount: $"+totalRemainingAmount);
        System.out.println("Change: "+dollars+" dollars, "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels");
    }
    public static void calculateChange(){
        
        double remainingAmount = dollars-(itemCost*100);
        totalRemainingAmount = remainingAmount/100;
        dollars = (int) remainingAmount/100;
        remainingAmount = remainingAmount-(dollars*100);
        
        quarters = (int) remainingAmount/25;
        remainingAmount = remainingAmount-(quarters*25);
        dimes = (int)remainingAmount/10;
        remainingAmount = remainingAmount-(dimes*10);
        nickels = (int) remainingAmount/5;
        
        
    }
    
}
