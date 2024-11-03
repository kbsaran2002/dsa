package com.sarv.sort;

import java.util.*;

public class SelectionStable {

    static void selectionStableSort(int[] arr) {

        int arr_size = arr.length;
        for (int i=0 ; i < arr_size;i++) {

            int low = i;
            for (int j=i;j< arr_size;j++) {
                if (arr[j] < arr[low]) {
                    low = j;
                }
            }
            int low_val = arr[low];
            while (low > i) {

                arr[low] = arr[low-1];
                low --;
            }

            arr[i] = low_val;
        }

    }

    static void printArray(int[] arr) {

        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+" , ");
        }

        System.out.println(arr.length);

    }

    static void printArray(ArrayList<Integer> arr) {

        for (int i = 0 ;i < arr.size();i++){
            System.out.print(arr.get(i)+" , ");
        }

    }
    static ArrayList<Integer> pair_sum_sorted_array(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.
        int i = 0;
        int j = numbers.size()-1;
        while (i < j) {

            int t = target-numbers.get(i);
            int r = numbers.get(j);

            if (r == t)
            {
                return new ArrayList<Integer>(Arrays.asList(i,j));
            }
            else if (r > t) {
                j--;
            }
            else
            {
                i++;
            }
        }
         return new ArrayList<Integer>(Arrays.asList(-1,-1));
    }

    static ArrayList<Integer> two_sum(ArrayList<Integer> numbers, Integer target) {
        HashMap<Integer,ArrayList<Integer> > hm = new HashMap<>();

        int index = 0;
        for (int num : numbers) {
            if (hm.containsKey(num)) {
                hm.get(num).add(index);
            }
            else {
                ArrayList<Integer> ali = new ArrayList<>();
                ali.add(index);
                hm.put(num,ali);
            }

            index++;
        }
        Collections.sort(numbers);
        int i = 0;
        int j = numbers.size()-1;
        while (i < j) {

            int t = target-numbers.get(i);

            if (numbers.get(j) > t)
            {
                j--;
            }
            else if (numbers.get(j) == t) {

                if (numbers.get(i).equals(numbers.get(j))) {
                    return new ArrayList<Integer>(Arrays.asList(hm.get(numbers.get(i)).get(0), hm.get(numbers.get(j)).get(1)));
                }
                else
                {
                    return new ArrayList<Integer>(Arrays.asList(hm.get(numbers.get(i)).get(0), hm.get(numbers.get(j)).get(0)));

                }
            }
            else
            {
                i++;
            }
        }
        return new ArrayList<Integer>(Arrays.asList(-1,-1));
    }



    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(251, 251, 251, 251));

        ArrayList<Integer>  b = two_sum(a,502);


        printArray(b);
      //  Collections.sort(a);




       // printArray(a);

      //  selectionStableSort(arr_inp);

     //   printArray(arr_inp);

    }

}

class LinkedListNode {
    Integer value;
    LinkedListNode next;

    LinkedListNode(Integer value) {
        this.value = value;
        this.next = null;
    }
}