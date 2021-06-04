package com.learn.javacourse;



public class PairSum {

    public  static  void pair(int[] ia, int sum){

    for(int i = 0; i < ia.length; i++) {

        for(int j = i +  1; j < ia.length; j++) {

            if (sum == ia[i] + ia[j]) {
                System.out.println(ia[i] + ","  + ia[j]);
            }
        }

        }

    }

    public static void main(String[] args) {
        int[] ia = {8,7,5,2,3,1};
        pair(ia,10);
    }

}
