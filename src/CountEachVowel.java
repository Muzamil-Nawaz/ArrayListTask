public class CountEachVowel {
public static void main(String[] args) {
   String sentence = "How are you today?";
   countVowels(sentence);
}
public static void countVowels(String sentence){
    int countA=0,countE=0,countI=0,countO=0,countU=0;
    
    for (int i = 0; i < sentence.length(); i++) {
        if(sentence.charAt(i)=='a' || sentence.charAt(i)=='A' ){
            countA++;
        }
        else if(sentence.charAt(i)=='e' || sentence.charAt(i)=='E' ){
            countE++;
        }
        else if(sentence.charAt(i)=='i' || sentence.charAt(i)=='I' ){
            countI++;
        }
        else if(sentence.charAt(i)=='o' || sentence.charAt(i)=='O' ){
            countO++;
        }
        else if(sentence.charAt(i)=='u' || sentence.charAt(i)=='U' ){
            countU++;
        }
    }
  
    System.out.println("a:" + countA);
    System.out.println("e:" + countE);
    System.out.println("i:" + countI);
    System.out.println("o:" + countO);
    System.out.println("u:" + countU);

    
}
    
}
