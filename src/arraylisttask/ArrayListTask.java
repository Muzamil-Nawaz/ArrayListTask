
package arraylisttask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTask {
    static ArrayList<Integer> list ;

    
    public static void main(String[] args) {
        list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<7; i++){
            System.out.println("Enter Number "+(i+1)+": ");
            int j = sc.nextInt();
            list.add(j);
            
        }
        System.out.println("Sorted List :");
        sort(list);
        System.out.println("sum of all:");
        System.out.println(sum(list));
        System.out.println("After duplicae removal:");
        removeDuplicate(list);
        
    }
    public static void sort(ArrayList<Integer> list){
        for (int a = 0; a < list.size(); a++) {
            for (int b = a+1; b < list.size(); b++) {
                int num = list.get(a);
                int num2 = list.get(b);
                if(num >num2){
                    list.set(a, num2);
                    list.set(b, num);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
        
    }
    public static double sum(ArrayList<Integer> list){
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum +=list.get(i);
            
        }
        return sum;
    }
    public static void removeDuplicate(ArrayList<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)==list.get(j)){
                    list.remove(i);
                }
                
            }        
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
            
        }
        
    }
    
}
