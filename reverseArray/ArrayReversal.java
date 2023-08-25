package com.codewars.reverseArray;

import java.util.*;
import java.util.stream.*;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3,7, 7, 1, 8};
        //System.out.println(Arrays.toString(reverseArray(arr)));
        StringBuilder builder = new StringBuilder(Arrays.toString(arr));//.reverse();
        builder.deleteCharAt(0).deleteCharAt(builder.length()-1).reverse();

        System.out.println(Arrays.toString(String.valueOf(builder).split(",")));
    }

   // public static int[] reverseArray(int[] arr){
        //StringBuilder builder = new StringBuilder(Arrays.toString(arr));

//        int[] newArr = new int[arr.length];
//        int count = 0;
//        for(int i=arr.length-1; i>=0; i--){
//            newArr[count++] = arr[i];
//        }
//        return  newArr;
    //}
}
