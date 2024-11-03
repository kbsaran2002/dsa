package com.sar.personal;

public class Test2 {

    public static void main(String[] args) {
        int[][] mat = new int[3][3];

        mat[0][0] = 5;
        mat[0][1] = 6;
        mat[0][2] = 7;
        mat[1][0] = 8;
        mat[1][1] = 9;
        mat[1][2] = 10;
        mat[2][0] = 11;
        mat[2][1] = 12;
        mat[2][2] = 13;

        for (int i = 0 ; i < 3;i++)
        {
            for (int j = 0;j< 3;j++) {

                System.out.print(mat[i][j]+" ");

            }
            System.out.println();
        }

    }
}
