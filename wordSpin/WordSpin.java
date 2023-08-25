package com.codewars.wordSpin;

import java.util.HashMap;
import java.util.Map;

public class WordSpin {

    public static void main(String[] args) {
    }
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        String[] arr = sentence.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() >=5){
                builder1.append(arr[i]).reverse();
                builder2.append(builder1).append(" ");
            }
            else
                builder2.append(arr[i]).append(" ");

            builder1.delete(0, builder1.length());
        }
        return String.valueOf(builder2).trim();
    }
}
