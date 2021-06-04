package com.learn.javacourse;

import java.util.Arrays;

public class ShellSort {

    public  void  shellSort(int array[], int n) {
        for(int i = n/2; i > 0; i /=2){
            for(int j = i; j < n; j+=1) {
                int temp = array[j];
                int k;
                for(k = j; k >= i && array[k - i] > temp; k -= i){
                    array[k] = array[k - i];

                }
                array[k] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[]  data = {9,8,7,6,5,4,3,1};
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(data));
        int size = data.length;
        ShellSort s = new ShellSort();
        s.shellSort(data,size);
        System.out.println("sorted array in ascending order");
        System.out.println(Arrays.toString(data));
    }



        }



