/*  In the block below, explain what this program is designed to do.  
*Also add inline comments to further demonstrate your knowledge of the code.
*This assignment is worth 50 points
*



This program gives an inputNumber and searches a 
given integer array for any pair of numbers whose 
sum is equal to given inputNumber and display the pair of numbers and their sum.
*
*
*
*
*
*
 */

public class Exam3ExplainCode {

    /**
     *
     * @param inputArray an integer array to search for pair of numbers
     * @param inputNumber a number whose sum we are searching in array
     */
    static void pairs_value(int inputArray[], int inputNumber) {
        // Displaying messgage representing output
        System.out.println("Pairs of elements and their sum : ");

        // Looping through given array for adding each item of array with other corresponding items one by one
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                // Checking if sum of corresponding items of given array is equal to given inputNumber
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    // If yes, then print the pair of numbers and their sum
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Passing input array and input number to pairs_value function
        pairs_value(new int[]{2, 7, 4, -5, 11, 5, 20}, 15);

    }
}
