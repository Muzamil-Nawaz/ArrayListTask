public class AlgorithmDesign {

public static void main(String[] args) {
   String words [] = {"four","score","and","seven","years","ago","aa"};
   swithPairs(words);
           
}
public static void swithPairs(String [] words){
    int one =0,two=1;
    for (int i = 0; i < words.length/2; i++) {
        String first = words[one];
        words[one] = words[two];
        words[two] = first;
        one+=2;
        two+=2;
    }
    for (int i = 0; i < words.length; i++) {
        System.out.println(words[i]);
    }
}
    
}
