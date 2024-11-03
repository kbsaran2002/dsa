package com.sar.hacker.rank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] inp = {2,5,7,3,6,1};
        int[] left = inp.clone();
        int[] right = inp.clone();

        Arrays.stream(inp).forEach(s-> System.out.print(s+" "));

        // left rotate

        int j = 0;
        int temp = 0;
        for (int i : inp) {

            if (j ==0 )
            {
                temp = i;
            }
            else {
                left[j-1] = i;
            }

            j++;

        }
        left[j-1] = temp;

        Arrays.stream(left).forEach(s-> System.out.print(s+" "));

        // left rotate

         j= 0;
        for (int i : inp) {

            if (j < inp.length -1 )
            {
                right[j+1] = i;
            }
            else {
                right[0] = i;
            }

            j++;

        }

        Arrays.stream(right).forEach(s-> System.out.print(s+" "));

    }
}
