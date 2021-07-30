
import java.util.Scanner;

public class SentenceParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        parseSentence(sentence);
    }
    public static void parseSentence(String sentence){
        if(sentence.endsWith("?")){
            if(sentence.length()%2==0)
                System.out.println("Yes");
            else
                System.out.println("No");
               
            
        }
        else if(sentence.endsWith("!"))
            System.out.println("Wow");
        else
            System.out.println("You always say \""+sentence+"\"");
    }
}

