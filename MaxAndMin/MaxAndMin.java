package com.donatus.MaxAndMin;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] list = {2, 5, 7, 3, 9};
        System.out.println(min(list));
        System.out.println(max(list));
    }


    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
