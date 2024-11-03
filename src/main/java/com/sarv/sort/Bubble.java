package com.sarv.sort;

public class Bubble {

    static void bubbleSort(int[] arr) {
        int high = arr.length;
        for (int i = 0;i < high-1;i++) {

            boolean swap_happened = false;

            for (int j = 0 ; j < high-i-1;j++) {

                if (arr[j+1] < arr[j]) {
                    swap(arr,j+1,j);
                    swap_happened = true;
                }

            }

            if (!swap_happened)
            {
                break;
            }

        }

    }
    static void swap(int[] arr,int a , int b) {

        int x = arr[a];
        arr[a] = arr[b];
        arr[b] =x;
    }

    static void printArray(int[] arr) {

        for (int a : arr) {
            System.out.print(a+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] a = { 5, 3, 1 , 9, 8 , 2 , 4 , 7 };

        printArray(a);
        bubbleSort(a);
        printArray(a);

    }
}
