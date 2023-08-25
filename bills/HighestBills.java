package com.codewars.bills;

import java.util.ArrayList;
import java.util.Arrays;

public class HighestBills {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(withdraw(230)));
    }

    public static int[] withdraw(int amount) {
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        // TO DO
        while(amount != 0){
            if((amount >= 100) && (amount != 130) && (amount != 110)){
                amount -= 100;
                count100++;
            }
            else{
                if((amount >= 50) && ((amount-50 == 0) || (amount-50 >= 20)) && (amount != 80)){
                    amount -= 50;
                    count50++;
                }
                else if(amount >= 20){
                    amount -= 20;
                    count20++;
                }
            }
        }
        return new int[]{count100, count50, count20};
    }
}

