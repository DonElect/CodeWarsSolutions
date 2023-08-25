package com.codewars.stringReverse;

public class StringReversal {
    public static void main(String[] args) {
        String wordOrPhrase = "Hello everyone. I am your science teacher";
        System.out.println(stringReversal(wordOrPhrase));
    }

    public static String stringReversal(String wordOrPhrase){
        return new StringBuilder(wordOrPhrase).reverse().toString();
    }
}
