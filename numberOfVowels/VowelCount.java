package com.codewars.numberOfVowels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class VowelCount {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(vowelCount("Donatus hello, what are you doing?"));
        StringBuilder builder = new StringBuilder();
        builder.append("Donatus");
        System.out.println(builder);
        builder.delete(0, builder.length());
        System.out.println(builder);
    }

    public  static int vowelCount(String words){
        
        String[] word = words.split(" ");
        int count = 0;
        for (int i = 0; i<word.length; i++){
            for (Character c : word[i].toCharArray()){
                switch (c){
                    case 'a', 'e', 'i', 'o', 'u' -> count++;
                }
            }
        }
        return count;
    }
}
