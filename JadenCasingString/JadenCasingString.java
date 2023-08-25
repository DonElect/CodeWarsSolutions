package com.codewars.JadenCasingString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingString {
    public static void main(String[] args) {
        String phrase1 = "How can mirrors be real if our eyes aren't real";
        String phrase2 ="most trees Are Blue[]";
        String phrase3 = null;
        System.out.println(toJadenCase(phrase1));

    }

    public static String toJadenCase(String phrase) {
        if((phrase !=null)&&(!phrase.isEmpty())){
            String[] phraseArray = phrase.split(" ");
            return Arrays.stream(phraseArray).map(n-> n.replaceFirst
                            ((String.valueOf(n.charAt(0))), ((String.valueOf(n.charAt(0))).toUpperCase())))
                    .collect(Collectors.joining(" ")).strip();
        }
        return null;
    }
}
