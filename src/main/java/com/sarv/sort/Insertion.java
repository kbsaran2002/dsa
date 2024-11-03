package com.sarv.sort;

public class Insertion {

    static void insertionSort(int[] i_arr) {

        for (int i = 1;i < i_arr.length;i++) {

            int key = i_arr[i];
            int j = i-1;

            while (j >=0 && i_arr[j] > key) {

                i_arr[j+1] = i_arr[j];
                j--;
            }

            i_arr[j+1] = key;
        }

    }

    static void printArray(int[] arr) {

        for (int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 5 , 2 , 3  , 9 , 1};

        printArray(arr);

        insertionSort(arr);

        printArray(arr);
    }
}
