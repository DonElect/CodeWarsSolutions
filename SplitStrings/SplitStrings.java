package com.donatus.SplitStrings;

import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Donatus my guy")));
    }

    public static String[] solution(String s) {
        //Write your code here
        if(s.length()%2 != 0){
            s +="_";
        }
        String[] str = new String[(s.length())/2];
        int count = 0;
        for(int i=0; i<s.length(); i+=2){
            str[count++] = s.substring(i, i+2);
        }
        return str;
    }
}
