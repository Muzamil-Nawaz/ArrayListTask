
import java.util.Scanner;

public class MethodsAssignment {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1- For any given pair of integers, determine if the second is a multiple of the first\n"
                + "2- For any given integer, determine whether it is odd or even\n"
                + "3- For any given number, print a square of asterisks with each side's length equal to the given number\n"
                + "4- Calculate and return the area of a circle, given the radius\n"
                + "5- Given a number from 1-12, return the name of the appropriate month\n"
                + "6- Check whether a given number is a prime number\n"
                + "7- Check whether a given 1D array is a palindrome\n"
                + "8- Calculate the average of a given 2D integer array\n"
                + "9- Exit the program\n"
                + "\nEnter your choice:");

        while (true) {
            System.out.println("1- For any given pair of integers, determine if the second is a multiple of the first\n"
                    + "2- For any given integer, determine whether it is odd or even\n"
                    + "3- For any given number, print a square of asterisks with each side's length equal to the given number\n"
                    + "4- Calculate and return the area of a circle, given the radius\n"
                    + "5- Given a number from 1-12, return the name of the appropriate month\n"
                    + "6- Check whether a given number is a prime number\n"
                    + "7- Check whether a given 1D array is a palindrome\n"
                    + "8- Calculate the average of a given 2D integer array\n"
                    + "9- Exit the program\n"
                    + "\nEnter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter 1st value:");
                    int first = sc.nextInt();
                    System.out.print("Enter 2nd value:");
                    int sec = sc.nextInt();

                    boolean result = checkMultiples(first, sec);
                    if (result) {
                        System.out.println("Yes, 2nd value is multiple of 1st value.\n");
                    } else {
                        System.out.println("No, 2nd value is not multiple of 1st value.\n");
                    }
                    continue;

                case 2:
                    System.out.print("Enter any number in range 1-12:");
                    int num = sc.nextInt();
                    checkEvenOrOdd(num);
                    continue;
                case 3:
                    System.out.print("Enter length of asteriks:");
                    int length = sc.nextInt();
                    printDynamicSquares(length);
                    continue;
                case 4:
                    System.out.print("Enter radius of the circle:");
                    double radius = sc.nextDouble();
                    System.out.println("Area of circle with radius " + radius + " =" + calculateCircleArea(radius) + "\n");
                    continue;
                case 5:
                    System.out.print("Enter numer of month:");
                    int numOfMon = sc.nextInt();
                    System.out.println(getNameOfMonth(numOfMon) + " is name of month on number " + numOfMon);
                    continue;
                case 6:
                    System.out.print("Enter any number:");
                    num = sc.nextInt();
                    result = checkPrimeNumber(num);
                    if (result) {
                        System.out.println(num + " is a prime number");
                    } else {
                        System.out.println(num + " is not a prime number");
                    }
                    continue;
                case 7:
                    System.out.println("Enter array elements on one line seperated with comma i.e :1,2,3,4 :");
                    String arrayInput = sc.next();
                    String[] arrayValues = arrayInput.split(",");
                    int[] intArray = new int[arrayValues.length];
                    for (int i = 0; i < arrayValues.length; i++) {
                        intArray[i] = Integer.parseInt(arrayValues[i]);
                    }
                    result = checkPalindromeArray(intArray, 0, intArray.length - 1);
                    if (result) {
                        System.out.println("Yes, the given array is palindrome.\n");
                    } else {
                        System.out.println("No, the given array is not palindrome.\n");
                    }
                    continue;
                case 8:
                    int[][] twoDArray = {{1, 2, 4, 11, 5}, {41, 5, 12, 5, 2}};
                    System.out.println("Average of {{1,2,4,11,5},{41,5,12,5,2}} = " + calculate2DArrayAvg(twoDArray) + "\n");
                    continue;

                case 9:
                    System.exit(0);

            }
        }
    }

    private static boolean checkMultiples(int first, int sec) {
        if (sec % first == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is a even number.\n");
        } else {
            System.out.println(num + " is a odd number\n");
        }
    }

    private static void printDynamicSquares(int length) {
        String asterik = "*";
        for (int a = 1; a < length; a++) {
            asterik = asterik + " *";
        }
        for (int b = 0; b < length; b++) {
            System.out.println(asterik);
        }
    }

    private static double calculateCircleArea(double radius) {
        return 3.1416 * (radius * radius);
    }

    private static String getNameOfMonth(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    private static boolean checkPrimeNumber(int num) {
        int factorsCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsCount++;
            }
        }
        if (factorsCount > 2) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean checkPalindromeArray(int[] array, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return true;
        }
        if (array[startIndex] == array[endIndex]) {
            return checkPalindromeArray(array, startIndex + 1, endIndex - 1);
        } else {
            return false;
        }
    }

    private static double calculate2DArrayAvg(int[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum / (array.length * array[0].length);
    }
}
