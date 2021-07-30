package arraylisttask;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMethods {
    LinkedList<Integer> listA , listB,listC;
    static LinkedListMethods lm;
    LinkedListMethods(){
        listA = new LinkedList<Integer>();
        listB = new LinkedList<Integer>();
        listC = new LinkedList<Integer>();
    }
    public static void main(String[] args) {
        lm = new LinkedListMethods();
        lm.listA.add(3);
        lm.listA.add(4);
        lm.listA.add(1);
        lm.listA.add(6);
        lm.listA.add(1);
        lm.listA.add(8);
        
        lm.listB.add(4);
        lm.listB.add(4);
        lm.listB.add(1);
        lm.listB.add(6);
        lm.listB.add(1);
        lm.listB.add(8);
         
        
        System.out.println(lm.add(lm.listA,lm.listB));
        System.out.println(lm.compare(lm.listA, lm.listB));
        
        
        
    }
    public LinkedList add(LinkedList listA,LinkedList listB){
        Integer i = Integer.parseInt(lm.reverseList(listA))+Integer.parseInt(lm.reverseList(listB));
        String s = i+"";
        for (int j = 0; j <s.length(); j++) {
            lm.listC.add(Integer.parseInt(s.charAt(j)+""));
        }
        return listC;
    }
    public String reverseList(LinkedList<Integer> list){
        Collections.reverse(list);
        String s ="";
        for(int i =0; i<list.size();i++){
            s+=list.get(i)+"";
        }
        return s;
    }
    public int compare(LinkedList<Integer> listA,LinkedList<Integer> listB){
        Integer a = Integer.parseInt(lm.reverseList(listA));
        Integer b = Integer.parseInt(lm.reverseList(listB));
        
        if(a>b)
            return 1;
        else if(a<b)
            return -1;
        else 
            return 0;
    }
}
