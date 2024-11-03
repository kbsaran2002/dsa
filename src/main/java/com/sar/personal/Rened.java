package com.sar.personal;

public class Rened {

    public static void main(String[] args) {

        int i = 152;
        double z = i;
    //    double z = 152;
        double zCubeRoot = Math.cbrt(z);

        //System.out.println(zCubeRoot);
        //System.out.println(Math.floor(zCubeRoot));





        for (double d = 0 ; d <= Math.cbrt(z) ; d++) {

            // x3+y3 = z
            // x=d
            // y3 = z-d3
            // y = cuberoot(z-d3)
            // y %1 == 0 , then good combo

            double x=d;
            double y = Math.cbrt(z-Math.pow(d,3));

            int iy = (int) y;

            if (y%1 == 0 ) {

                System.out.println(d +" , "+y);

            }

            if (iy == y) {
                System.out.println(d +" , "+y + " " +iy);
            }



        }







    }
}
