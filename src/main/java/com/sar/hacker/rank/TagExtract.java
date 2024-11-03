package com.sar.hacker.rank;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class TagExtract{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            Matcher matcher = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);

            if (matcher.find() == false) {
                System.out.println("None");
                testCases--;
                continue;
            }

            matcher.reset();

            while (matcher.find() == true){
                System.out.println(matcher.group(2));
            }

            testCases--;
        }



    }


}



