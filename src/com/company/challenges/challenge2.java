package com.company.challenges;

import java.util.Arrays;

public class challenge2 {
    //challenge 2
    public static String[] sortByLength(String input){
        String[] array = input.split(" ");
        Arrays.sort(array, (a, b)->Integer.compare(a.length(), b.length()));
        return array;
    }
}
