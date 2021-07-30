public class MostPopularTutors {

    public static void main(String[] args) {
   int [] [] countOfStudents = {{13,8,3,3,6},{15,5,11,12,3},{12,14,1,4,12},{12,8,2,9,14},{2,8,6,15,2},{12,4,13,15,2},{2,8,9,10,15}};
        findTutors(countOfStudents);
    }
    public static void findTutors(int [][] countOfStudents){
        int count =0;
        System.out.print("The most popular tutor(s):");
        String [] tutors = {"Bob","Alice","Mike","Jane","Justin","Paul","Dan"};
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                count+=countOfStudents[i][j];
            }
            if(count>45){
                System.out.print(tutors[i]+" ");
            }
            count=0;
        }
    }
}
