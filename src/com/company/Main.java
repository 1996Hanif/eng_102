package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.company.challenges.challenge1.Challenge1;
import static com.company.challenges.challenge2.sortByLength;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int sum = Challenge1();

    System.out.println(sum);

    String[] output_array = sortByLength("how ar you today");


    System.out.println(Arrays.asList(output_array));
    }




}
