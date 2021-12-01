package com.company.challenges;

public class challenge1 {
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
}
