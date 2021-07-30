
public class Array {

    static int[] source = {7, 5, 12, 11, 14, 10, 5, 4, 17, 5, 2, 8, 7, 4, 11, 10, 5, 18, 10, 7};
    static int[] search = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        String output = "";
        for (int i = 0; i < search.length; i++) {
            int count=0;
            for (int j = 0; j < source.length; j++) {
                if(source[j] == search[i]){
                    count++;
                }
            }
            if(count>=3){
                output+=Integer.toString(search[i])+",";
                
            }
            count=0;
        }
        System.out.println("The numbers "+output+" occurs at least 3 times in the source.");
    }

}
