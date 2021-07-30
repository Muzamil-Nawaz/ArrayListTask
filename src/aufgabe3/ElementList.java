package aufgabe3;

/*
 * a)	Geben Sie die Zahlen aller Elemente der Liste am Ende der AusfÃ¼hrung der main-Methode an. (7 Punkte)
 * 
 * ANTWORT:
 * 
 * b)	Welche RÃ¼ckgabe erfolgt in der Methode getElementAt(int index), wenn diese Methode auf einer Liste der LÃ¤nge 1 mit dem Parameter 2 aufgerufen wird?
 * 		ErlÃ¤utern Sie, wie es zu dieser RÃ¼ckgabe kommt. (3 Punkte)
 * 
 * ANTWORT: 
 * 
 * c)	Implementieren Sie die Methode removeAtIndex(int index), welche das Element mit dem Ã¼bergebenen Index aus der Liste entfernt. 
 * 		Wird eine negative Zahl oder ein zu groÃŸer Index Ã¼bergeben, soll nichts verÃ¤ndert werden. (10 Punkte)
 */
public class ElementList<T> {

    private Element<T> head = null;

    // c)
    public void removeAtIndex(int index) {
        if (index < 0 || index >10000) {
            return;
        }
        if(index ==0){
            head = head.getNext();
            return;
        }
        
        int curPos = 0;
        Element<T> element = head;
        Element<T> prev = null;
        while (curPos < index && element != null) {
            prev = element;
            element = element.getNext();
            curPos = curPos + 1;
        }
        if(element!=null){
            prev.setNext(element.getNext());
            
        }
        

    }

    public void add(int index, T value) {
        Element<T> element = new Element<>(value);
        if (index == 0) {
            element.setNext(head);
            head = element;
        } else if (index > 0) {
            Element<T> prev = getElementAt(index - 1);
            if (prev != null) {
                element.setNext(prev.getNext());
                prev.setNext(element);
            }
        }
    }

    private Element<T> getElementAt(int index) {
        if (index < 0) {
            return null;
        }
        int curPos = 0;
        Element<T> element = head;
        while (curPos < index && element != null) {
            element = element.getNext();
            curPos = curPos + 1;
        }
        return element;
    }

    public static void main(String[] args) {
        ElementList<String> list = new ElementList<>();
        list.add(0, "1");
        list.add(1, "2");
        list.add(1, "3");
        list.add(0, "4");
        list.add(2, "5");
        list.add(3, "6");
        list.add(4, "7");
        Element temp = list.head;
        int count = 0;
        while (temp != null) {

            temp = temp.getNext();
            count++;
        }
        System.out.println("Number of elements in the list: " + count); // a

        /**
         * part b // First, it will check if index is less than 0, which in this
         * case is not and move on. // Now, a current position local variable is
         * initialized to track index of items in list, and temp list element is
         * initialized // Now looping until current position varible is less
         * than passed parameter which is 2 in this case, and temperory list
         * element is not null. // for first iteration: // list is pushed to
         * next item. // current position is incremented with 1. Now its value
         * is 1. // for second iteration: // // list is pushed to next item. //
         * // current position is incremented with 2. Now its value is 2. // At
         * 3rd iteration condition of loop : current position less than index is
         * false now so ending loop. // and returning the element at 2 index in
         * list.
         *
         * *
         */
    }
}
