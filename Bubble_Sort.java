package Bubble_Sort;

/*
   Shabneel Kumar
   S11184954
   This is a fully functional genric bubble sort Algorithm code in java
*/
 
import java.util.List;
 
public class Bubble_Sort {
     public int counter_B;

    public   <T extends Comparable<T>> int bubbleSort(List<T> list) {
        T temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
                counter_B++;
            }
        }
        return 0;
    }

}
