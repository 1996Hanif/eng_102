package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.company.challenges.challenge1.Challenge1;
import static com.company.challenges.challenge2.sortByLength;
import static com.company.challenges.challenge3.name_switch;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = Challenge1();
        System.out.println(sum);
        String[] output_array = sortByLength("how ar you today");
        System.out.println(Arrays.asList(output_array));

        String name= name_switch("Hanif Ali");
        System.out.println(name);
    }




}
