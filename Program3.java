package com.learn.javacourse;

import java.util.Arrays;

public class Program3 {

    public static void merge(int[] X, int[] Y) {

        int m = X.length;
        int n = Y.length;

        for (int i = 0; i < m; i++) {

            if (X[i] > Y[0]) {
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;
                int first = Y[0];

                int j;
                for (j = 1; j < n && Y[j] < first; j++) {
                    Y[j - 1] = Y[j];
                }
                Y[j - 1] = first;
            }
        }

    }


    public static void main(String[] args) {
        int[] X = {1, 4, 7, 8, 10};
        int[] Y = {2, 3, 9};
        merge(X,Y);
        System.out.println("X : " + Arrays.toString(X));
        System.out.println("Y : " + Arrays.toString(Y));
    }
}
