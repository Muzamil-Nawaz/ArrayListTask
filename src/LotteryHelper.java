
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class LotteryHelper {
    static ArrayList numbers;
    public static void main(String[] args) {
        
        // For taking input
        Scanner sc = new Scanner(System.in);
        // Arraylist for storing first 5 random numbers to be generated
        numbers = new ArrayList<>();
        // Random class object which will help us generate random numbers
        Random r = new Random();
        
        // Running for loop for 5 times in order to generate first 5 random numbers
        for (int i = 0; i < 5; i++) {
            // Generating random number between 1-70
            int num = r.nextInt(70-1)+1;
            // If number is already in list
            while(numbers.contains(num)){
                // then regenerate the number
                num = r.nextInt(70-1)+1;
            }
            // finally add the new, unique random number to the list 
            numbers.add(num);
            
        }
        // Sorting the list of numbers in ascending order
        Collections.sort(numbers);
        // Generating 6th random number in range of 1-25
        int sixthNum = r.nextInt(25-1);
        // Looping to print first 5 generated random numbers
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
        // and then printing the 6th random number
        System.out.println("and "+sixthNum);
    }
}
