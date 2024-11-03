package com.sarv.sort;

public class Quick {

    static void quickSort(int[] arr,int low,int high) {

        if (low < high) {
            int pi = partitionIndex(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static int partitionIndex(int[] arr, int low, int high) {

        int i = low-1 ; // moving low index
        int pivot = high; //setting pivot with right most value

        for (int j = low ; j <= high;j++) {

            if (arr[j] < pivot) {
                i++ ; // moving low index by 1 value if we find an element smaller than pivot
            }

        }

        swap(arr,i+1,high) ;

        return  i+1;
    }

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {

        for (int a : arr) {
            System.out.print(a+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr  = { 3 , 6 , 1, 8 , 5, 9 , 2,  7};

        printArray(arr);
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
