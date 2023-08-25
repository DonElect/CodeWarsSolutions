package com.codewars.smallestElement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SmallestArrayElement {

    public static void main(String[] args) {
        int[] array = IntStream.range(1, 10).toArray();
        Set<Integer> set = new HashSet<>();
        System.out.println(Arrays.toString(min(array)));
        int[] arr = {1, 1, 5, 2, 5, 5, 7, 7};
        System.out.println(Arrays.toString(distinct(arr)));
        System.out.println(eliminateUnsetBits(null));
    }
    public static long eliminateUnsetBits(String number) {
        // TODO
        long decimal = 0;
        if(number!=null) {
            String binaryString = number.replaceAll("0", "").strip();
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
    public static int[] distinct(int[] arr){
       return Arrays.stream(arr).distinct().toArray();
    }
    public static int[] min(int[] array){
        return Arrays.stream(array).sorted().toArray();//min().getAsInt();
    }
}
