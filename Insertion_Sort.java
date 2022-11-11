package Insertion_Sort;

/*
   Shabneel Kumar
   S11184954
   This is a fully functional genric Insertion sort Algorithm code in java
*/

import java.util.ArrayList; 
import java.util.List;
 
public class Insertion_Sort {

    public int counter_I;

    //Insertion sort 
    public <T extends Comparable<T>> int InsertionSort(List<T> list) {
        for (int j = 1; j < list.size(); j++) {
            T current = list.get(j);
            int i = j - 1;
            while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
                list.set(i + 1, list.get(i));
                i--;
                counter_I++;
            }
            list.set(i + 1, current);
        }
        return 0;
    }
}
 
