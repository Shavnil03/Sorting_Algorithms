/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Merge_sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Merge_Sort {

    public int counter_M;

    /**
     *
     * @param <T>
     * @param original
     * @return
     */
    public <T extends Comparable<T>> List<T> mergeSort_AL(List<T> original) {
        List<T> leftA = new ArrayList<>();
        List<T> rightA = new ArrayList<>(); 

        int center;
        if (original.size() == 1) {
            return original;
        } else {
            center = original.size() / 2;
            for (int i = 0; i < center; i++) {
                leftA.add(original.get(i));  
            }
            for (int i = center; i < original.size(); i++) {
                rightA.add(original.get(i));
            }
            leftA = mergeSort_AL((ArrayList<T>) (leftA));
            rightA = mergeSort_AL((ArrayList<T>) rightA);
            merge(leftA, rightA, original);
        }
        return original;
    }
    
     public <T extends Comparable<T>> List<T> mergeSort_LL(List<T> original) {
        List<T> leftA = new LinkedList<>();
        List<T> rightA = new LinkedList<>(); 

        int center;
        if (original.size() == 1) {
            return original;
        } else {
            center = original.size() / 2;
            for (int i = 0; i < center; i++) {
                leftA.add(original.get(i));  
            }
            for (int i = center; i < original.size(); i++) {
                rightA.add(original.get(i));
            }            
            leftA = mergeSort_LL((LinkedList<T>) (leftA));
            rightA = mergeSort_LL((LinkedList<T>) rightA);
            merge(leftA, rightA, original);            
        }
        return original;
    }

    private <T extends Comparable<T>> void merge(List<T> left, List<T> right, List<T> original) {
        int leftIndex = 0;
        int rightIndex = 0;
        int originalIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {

            if (left.get(leftIndex).compareTo(right.get(rightIndex)) < 0) {
                original.set(originalIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                original.set(originalIndex, right.get(rightIndex));
                rightIndex++;
            }
            originalIndex++;
            counter_M++;
        }

        while (leftIndex < left.size()) {
            original.set(originalIndex, left.get(leftIndex));
            originalIndex++;
            leftIndex++;
        }
        while (rightIndex < right.size()) {
            original.set(originalIndex, right.get(rightIndex));
            originalIndex++;
            rightIndex++;
        }
    }

}
