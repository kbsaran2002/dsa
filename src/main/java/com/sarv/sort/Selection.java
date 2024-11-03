package com.sarv.sort;

public class Selection {

    static void selectionSort(int[] arr) {

        int high = arr.length;
        for (int i = 0 ; i < high;i++) {

            int low = i;
            for (int j = i ; j < high; j ++) {

                if (arr[j] < arr[low]) {

                    low = j;
                }
            }

            swap(arr,i,low);

        }
    }

    static void swap(int[] arr, int a , int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    static void printArray(int[] arr) {

        for (int j : arr) {
            System.out.print(j + " , ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr_inp = { 5, 3 , 3 , 4 , 1 , 9 , 6,6};
        printArray(arr_inp);
        selectionSort(arr_inp);
        printArray(arr_inp);
    }
}
