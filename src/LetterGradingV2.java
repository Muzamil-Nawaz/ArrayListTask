
import java.util.Scanner;

/*  
    FPStarter.java: This is the starter file that will be shared with the students for the Final Project.
    Authored by: Michael Sidaras-Tirrito (Change to your student name)
    CMP128-20224: Computer Science I
    Spring 2021
    Professor Tirrito
    County College of Morris
    Date Last Modified: 05/01/2021
 */
// IMPORT STATEMENTS AREA
//FILL IN YOUR IMPORT STATEMENT HERE
// CLASS DEFINITION AREA
public class LetterGradingV2 {

    //MAIN FUNCTION DEFINITION AREA
    public static void main(String[] args) {
        //Variable Initializations Area
        String[] enrolledCourses = new String[5]; // This is a 5-member array, which Java defaults to all empty strings.
        int[] tuitionBill = new int[5]; // This is a 5-member array to store the following 5 integer values, in order:  totalCredits, labCredits, tuitionSubtotal, labFeesSubtotal and tuitionGrandTotal.  Even though some of these are representative of currency, only whole numbers will be shown with no decimal places, as the tuition and lab fees are in whole dollar amounts, so no calculations will need to go to floating-point values for cents.  Therefore, we  an store all five tuition bill items in the integer array.
        final int PER_CREDIT_TUITION = 75; // Constant cost of tuition.
        final int PER_CREDIT_LAB_FEES = 15;// Constant cost of lab fees.
        // ADD IN ANY REMAINIING VARIABLES, CONSTANTS AND ARRAYS YOU MAY NEED FOR THE PROGRAM.  I MAY NOT HAVE CREATED THEM ALL IN YOUR STARTER FILE.
        Scanner keyboard = new Scanner(System.in);
        int courseCounter = 0;
        char welcomeSymbol = '*';
        char mainMenuChoice = ' ';
        boolean tutionCalculation = false;
        int exitAnswer = 0;
        do {
            welcomeBanner(welcomeSymbol); // Calls the welcome banner function and passes in the user-chosen symbol.

            // You have to call the main menu function here.
            mainMenu(welcomeSymbol);

            mainMenuChoice = getChoice(mainMenuChoice); // Calls the getChoice function and passes in the mainMenuChoice variable, then captures the returned choice back into the mainMenuChoice variable.

            // Create the Multiple Choice Selection Structure for Main Menu Choice right here, and program in all features on all paths.
            switch (mainMenuChoice) {
                case 'E':
                    if (courseCounter < 5) {
                        enrollInCourse(courseCounter, enrolledCourses, welcomeSymbol);
                        courseCounter++;
                    } else {
                        System.out.println("You have already enrolled in the maximum of 5 courses. You cannot register anymore courses this semester.");
                        System.out.println("Press any key to continue...");
                        keyboard.next();
                    }
                    break;
                case 'T':
                    if (!tutionCalculation) {
                        calculateTutionBill(enrolledCourses, tuitionBill, courseCounter, welcomeSymbol);
                        tutionCalculation = true;
                    } else {
                        System.out.println("You have already calculated the tuition bill. It cannot be recalculated. We will now show you a copy of your Tuition Bill.");
                        System.out.println("Press any key to continue...");
                        keyboard.next();
                    }
                    displayTutionBill(enrolledCourses, tuitionBill, courseCounter, welcomeSymbol);
                    System.out.println("Press any key to continue...");
                    keyboard.next();
                    resetCourseEnrollments(enrolledCourses);
                    resetTuitionBill(tuitionBill);
                    break;
                case 'X':

                    exitAnswer = exitProgram(welcomeSymbol);
                    break;
                default:
                    System.out.println("Invalid Input! The only options are E, T or X. Please try again.");
                    System.out.println("Press any key to continue...");
                    keyboard.next();

            }

        } while (exitAnswer >= 0);// End of indefinite loop structure that coordinates the overall flow of the main function

        // The program is about to terminate.  Calling the Closing Banner to display closing message before program terminates.
        closingBanner(welcomeSymbol);
    }//END OF MAIN FUNCTION.

    // PROGRAMMER-DEFINED FUNCTIONS AREA
    public static void welcomeBanner(char symbol) {
        //Write all the code for this function in this body
        String banner = "";
        for (int i = 0; i < 80; i++) {
            banner += symbol;
        }

        System.out.println(banner);

        System.out.println("\t\t\t\t\t\t" + symbol + " Student Tuiton App " + symbol + "\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t" + symbol + " FINAL PROJECT " + symbol + "\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t" + symbol + " Written by Andrew " + symbol + "\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t" + symbol + " CMP128-20224: Computer Science I " + symbol + "\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t" + symbol + " School Name " + symbol + "\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t" + symbol + " Semester " + symbol + "\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t" + symbol + " Prof name " + symbol + "\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t" + symbol + " Date created " + symbol + "\t\t\t\t\t\t");
        System.out.println(banner);
        System.out.println("\n\n");

    }// End of welcomeBanner() function.

    public static void mainMenu(char symbol) {
        //Write all the code for this function in this body

        String borderline = "";
        for (int i = 0; i < 80; i++) {
            borderline += symbol;
        }
        System.out.println(borderline);
        System.out.println(symbol + " Student Tutition App : Main Menu " + symbol);
        System.out.println(symbol + " -------------------------------- " + symbol);
        System.out.println(symbol + "                                  " + symbol);
        System.out.println(symbol + " E. Enroll in a Course " + symbol);
        System.out.println(symbol + " T. Calculate Tution Bill " + symbol);
        System.out.println(symbol + " X. Exit the program " + symbol);
        System.out.println(borderline);

    }// End of mainMenu() function

    public static char getChoice(char choice) {
        //Write all the code for this function in this body

        Scanner sc = new Scanner(System.in);

        System.out.print(" Make a Selection Now >>>");
        choice = sc.next().charAt(0);
        for (int i = 0; i < 80; i++) {
            System.out.print(choice);
        }
        System.out.println("\n\n");
        return choice;

    }// End of getChoice() function.

    public static int enrollInCourse(int enrollCount, String[] coursesEnrolled, char bannerSymbol) {
        String[] courseListing = {"CMP120: Foundations of Info. Security",
            "CMP124: Network Security",
            "CMP125: Info Security Management",
            "CMP128: Computer Science I",
            "CMP129: Computer Science II",
            "CMP130: Introduction to Information Technology",
            "CMP131: Fundamentals of Programming (Python)",
            "CMP200: Operating Systems and Utilities",
            "CMP230: Computer Architecture & Assembly Language",
            "CMP233: Data Structures & Algorithms",
            "CMP239: The Internet and Web Page Design",
            "CMP241: Database Programming (SQL)",
            "CMP243 Ethical Hacking & Systems Defense",
            "CMP244: Web Design II",
            "CMP246: Operating Systems",
            "CMP249: Advanced Web Programming",
            "CMP255: Linux",
            "CMP262: Data Science Programming",
            "CMP263: Web Development Workflow",
            "CMP264: Machine Learning",
            "CMP280: Software Engineering",
            "CHM117/118: Introductory Chemistry Lecture/Lab (Lab Fee Applies)",
            "CHM125/126: General Chemistry I Lecture/Lab (Lab Fee Applies)",
            "CHM127/128: General Chemistry II Lecture/Lab (Lab Fee Applies)",
            "PHY125/126: Physics I Lecture/Lab (Lab Fee Applies)",
            "PHY127/128: Physics II Lecture/Lab (Lab Fee Applies)",
            "PHY130: Engineering Physics I (Lab Fee Applies)",
            "PHY133/134: Engineering Physics II Lecture/Lab (Lab Fee Applies)",
            "BIO101: Anatomy and Physiology I (Lab Fee Applies)",
            "BIO102: Anatomy and Physiology II (Lab Fee Applies)",
            "BIO 121: General Biology I (Lab Fee Applies)",
            "BIO 122: General Biology II (Lab Fee Applies)",
            "SCI 118: General Astronomy (Lab Fee Applies)",
            "PHY103: Concepts of Physics (Lab Fee Applies)",
            "PHY 118: Meteorology (Lab Fee Applies)",
            "ENG111: English Composition I",
            "ENG112: English Composition II",
            "MAT110: College Algebra",
            "MAT123: Precalculus",
            "MAT130: Probability and Statistics",
            "MAT131: Calculus I",
            "MAT132: Calculus II"
        };// Creates the 42-element course listing array and immediately populates it with all 42 courses.

        //Write all the remaining code for this function in this body, prior to the return statement.
        Scanner keyboard = new Scanner(System.in);
        String courseChoice = "";
        String borderline = "";
        for (int i = 0; i < 80; i++) {
            borderline += bannerSymbol;
        }
        boolean flag = false;
        while (!flag) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            System.out.println(borderline);
            System.out.println(bannerSymbol + " Department of Information Technologies at County College of Morris " + bannerSymbol);
            System.out.println(bannerSymbol + " Course Listing for Information Technology and Computer Science Degrees " + bannerSymbol);
            System.out.print(bannerSymbol);
            for (int i = 0; i < 78; i++) {
                System.out.print("-");
            }
            System.out.println(bannerSymbol);
            for (int i = 0; i < courseListing.length; i++) {

                System.out.println(bannerSymbol + " " + (i + 1) + "." + courseListing[i] + " " + bannerSymbol);

            }
            System.out.println(borderline);
            System.out.println(bannerSymbol + " Enter the Course Code, excluding the Course Title [Example: CMP128] " + bannerSymbol);
            System.out.print(" Make a Selection Now >>>");
            courseChoice = keyboard.nextLine();
            System.out.println("\n\n");

            int count = 0;
            while (!flag) {
                if (count >= courseListing.length) {

                    System.out.println(" Error: Invalid Input! No Such Course Code Found. Please Try Again.");
                    break;
                }
                if (courseListing[count].contains(courseChoice)) {
                    System.out.println(" You have registered for " + courseChoice);
                    flag = true;

                }
                count++;
            }

        }
        coursesEnrolled[enrollCount] = courseChoice;
        enrollCount++;
        return enrollCount;
        // Returning the enrolled courses counter variable back to main.
    }// End of enrollInCourse() function.

    public static void calculateTutionBill(String[] enrolledCourses, int[] tutionBill, int courseCount, char symbol) {
        final int PER_CREDIT_TUITION = 75; // Constant cost of tuition.
        final int PER_CREDIT_LAB_FEES = 15;// Constant cost of lab fees.
        String courseCode = "";
        String borderline = "";
        for (int i = 0; i < 80; i++) {
            borderline += symbol;
        }
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        int totalcredits = 0;
        int labcredits = 0;
        for (int i = 0; i < courseCount; i++) {
            courseCode = enrolledCourses[i];
            if (courseCode.charAt(0) == 'P' && courseCode.charAt(1) == 'H' && courseCode.charAt(2) == 'Y') {
                totalcredits += 4;
                labcredits += 4;
            } else if (courseCode.charAt(0) == 'S' && courseCode.charAt(1) == 'C' && courseCode.charAt(2) == 'I') {
                totalcredits += 4;
                labcredits += 4;
            } else if (courseCode.charAt(0) == 'B' && courseCode.charAt(1) == 'I' && courseCode.charAt(2) == 'O') {
                totalcredits += 4;
                labcredits += 4;
            } else if (courseCode.charAt(0) == 'C' && courseCode.charAt(1) == 'H' && courseCode.charAt(2) == 'M') {
                totalcredits += 4;
                labcredits += 4;
            } else {
                totalcredits += 4;
                labcredits += 4;
            }
        }
        tutionBill[0] = totalcredits;
        tutionBill[1] = labcredits;

        tutionBill[2] = totalcredits * PER_CREDIT_TUITION;

        tutionBill[3] = labcredits * PER_CREDIT_LAB_FEES;

        tutionBill[4] = tutionBill[2] + tutionBill[3];

    }

    public static void displayTutionBill(String[] courses, int[] tutionBill, int courseCount, char symbol) {
        final int PER_CREDIT_TUITION = 75; // Constant cost of tuition.
        final int PER_CREDIT_LAB_FEES = 15;// Constant cost of lab fees.
        String borderline = "";
        for (int i = 0; i < 80; i++) {
            borderline += symbol;
        }
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println(borderline);

        System.out.println(symbol + " Department of Information Technologies at County College of Morris " + symbol);
        System.out.println(symbol + " Tuition Bill for Information Technology and Computer Science Degrees " + symbol);
        System.out.print(symbol);
        for (int i = 0; i < 78; i++) {
            System.out.print("-");
        }
        System.out.println(symbol);
        for (int i = 0; i < courses.length; i++) {

            System.out.println(symbol + " " + (i + 1) + "." + courses[i] + " " + symbol);

        }

        System.out.println(borderline);
        System.out.println(" The tuition rate per credit is $" + PER_CREDIT_TUITION);
        System.out.println(" The lab fee per credit is $" + PER_CREDIT_LAB_FEES);
        System.out.println(" Total enrolled credits:" + tutionBill[0] + " Tution Subtotal: $" + tutionBill[2]);

        System.out.println(" Total lab credits:" + tutionBill[1] + " Lab Fee Subtotal: $" + tutionBill[3]);

        System.out.println(" Tution Grand Total: $" + tutionBill[4]);
        System.out.println("\n\n");
        System.out.println(borderline);
        System.out.println(symbol + " Your Tuition Bill Is Due At This Time! " + symbol);
        System.out.println(borderline);
        System.out.println("\n\n");

    }

    // Add in some of the missing function definition blocks here, up until the exitProgram() function.
    public static void resetCourseEnrollments(String[] enrolledCourses) {
        for (int i = 0; i < 5; i++) {
            enrolledCourses[i] = "";
        }
    }

    public static void resetTuitionBill(int[] tutionBill) {
        for (int i = 0; i < 5; i++) {
            tutionBill[i] = 0;
        }
    }

    public static void closingBanner(char symbol) {
        String borderline = "";
        for (int i = 0; i < 80; i++) {
            borderline += symbol;
        }
        System.out.println("\n\n");
        System.out.println(borderline);
        System.out.println(symbol + "Thank you for using the Tuition Bill Calculator App v. 1.0! " + symbol);
        System.out.println(symbol + " This program will now terminate… " + symbol);
        System.out.println(borderline);
        System.out.println("\n\n");

    }

    public static int exitProgram(char symbol) {
        /*  THIS ENTIRE FUNCTION IS PROGRAMMED.  STUDENTS DO NOT NEED TO MODIFY IT. */

        Scanner keyboard = new Scanner(System.in);
        int answer;
        System.out.println("\n\n");

        System.out.println("You have entered the Exit Program command!  If this was a mistaken entry, you can return to the main menu now by entering ANY positive number OR 0.  If you meant to exit this program, then please enter ANY negative number now to confirm the program termination.");
        System.out.print("   Make a Selection Now >>> ");

        answer = keyboard.nextInt();
        for (int i = 0; i < 80; i++) {
            System.out.print(symbol);
        }
        System.out.println("\n\n");

        return answer;
    }// End of exitProgram() function

}//END OF PUBLIC CLASS FPStarter
