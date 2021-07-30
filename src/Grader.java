
import java.util.Scanner;

public class Grader {

    public static void main(String[] args) {
        int grades[] = new int[4];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean substitution = true;
        int prev = -1;
        while(count<4){
            System.out.print("Enter exam grade "+(count+1)+" (0-100): ");
            int grade = sc.nextInt();
            if(grade >=0 && grade <=100){
                grades[count] = grade;
                if(prev < grades[count] && substitution){
                    substitution = true;
                    prev = grades[count];
                }
                    
                else
                    substitution = false;
                count++;
                
            }
            
        }
        System.out.print("Enter number of absesces: ");
        int absences = sc.nextInt();
        
        if(substitution)
            grades[0] = grades[3];
        
        int total = getTotalGrades(grades,absences);
        double avg = getAverage(total);
        if(avg >= 0.0 && avg < 60.0  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: F");
        }
        else if(avg >= 60.0 && avg < 61.5  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: D- ");
        }
        else if(avg >= 61.5 && avg < 68.00  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: D ");
        }
        else if(avg >= 68.00 && avg < 70.00  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: D+ ");
        }
        else if(avg >= 70.00 && avg < 71.5  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: C-");
        }
        else if(avg >= 71.5 && avg <  78.00 ){
            System.out.println("Student's course %: "+avg+"%\tGrade: C ");
        }
        else if(avg >= 78.00 && avg < 80.00  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: C+");
        }
        else if(avg >= 80.00 && avg < 82.00  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: B-");
        }
        else if(avg >= 82.00 && avg < 88.00  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: B");
        }
        else if(avg >= 88.00 && avg < 90.00  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: B+");
        }
        else if(avg >= 90.00 && avg < 92.5  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: A-");
        }
        else if(avg >= 92.5 && avg < 100  ){
            System.out.println("Student's course %: "+avg+"%\tGrade: A");
        }
        else if(avg == 100.0  ){
            System.out.println("The student's total score is "+(total+absences*2)+" less "+absences+" "
                    + "points for absences, to give "+total+" points. This averages out to "+avg+"%, which gives the student a A+ grade");
        }
    }
    static int getTotalGrades(int [] grades, int absences){
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total+=grades[i];
        }
        return total - absences*2;
    }
    static double getAverage( int totalScore){
        return totalScore/4;
        
    }
}
