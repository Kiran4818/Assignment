package com.learn.javacourse;

public class Main {

    public static void main(String[] args) {

        int [] array  = {1,2,3,4,4,};


        System.out.println("Duplicate elements in array are");

        for(int i = 0; i < array.length; ++i) {

            for(int j = i + 1; j < array.length; ++j) {

                if (array[i] == array[j]) {
                   System.out.println(array[j]);


               }


            }
        }



    }
}
