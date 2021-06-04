package com.learn.javacourse;

import java.util.Arrays;

public class Insertionsort {

    public  void  insertionSort(int array[]) {
        int size = array.length;

        for(int i = 1; i < size; i++) {
            int j = array[i];

            int k = i - 1;

            while (k >= 0 && j < array[k]) {
                array[k + 1] = array[k];
                k--;
            }
            array[k + 1] = i;

        }

    }

    public static void main(String[] args) {

        int[] arr = {10,7, 56,48,1,9};
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(arr));

        Insertionsort is  = new Insertionsort();
        is.insertionSort(arr);
        System.out.println("sorted arrays in ascending order");
        System.out.println(Arrays.toString(arr));

    }




}
