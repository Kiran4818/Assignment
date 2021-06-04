package com.learn.javacourse;

public class BubbleSort {
    public  static  void  bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;

        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-1); j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = {2,5,1, 6,7};
        System.out.println("Arrays before bubble sort");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Arrays after bubble sort");
        for(int i= 0; i< arr.length; i++)
        System.out.println(arr[i] + "");
    }
}
