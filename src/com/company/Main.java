package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int sum = Challenge1();

    System.out.println(sum);

    String[] output_array = sortByLength("how ar you today");


    System.out.println(Arrays.asList(output_array));
    }

    //challenge 1
    public static int Challenge1(){
        int total_sum = 0;
        for (int i = 0; i< 1000; i++)
        {
            if(i % 3 == 0)
                total_sum = total_sum + i;
            else if (i % 5 == 0)
                total_sum = total_sum + i;
        }
        return total_sum;
    }

    //challenge 2
    public static String[] sortByLength(String input){
        String[] array = input.split(" ");
        Arrays.sort(array, (a, b)->Integer.compare(a.length(), b.length()));
        return array;
    }
}
