
package arraylisttask;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int size = Integer.parseInt(input.split(" ")[0]);
        String [] words = new String[size];
        for (int i = 1; i < input.split(" ").length; i++) {
            words[i-1] = input.split(" ")[i];
        }
        int [] frequencies = new int[size];
        int freq=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j]))
                    freq++;
            }
            frequencies[i]=freq;
            freq=0;
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]+" "+frequencies[i]);
        }
    }
    
}
