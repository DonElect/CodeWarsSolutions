package com.codewars.oddNumber;
import java.util.*;

public class OddNumber {
    public static void main(String[] args) {

    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> mapValue = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(mapValue.containsKey(a[i])){
                mapValue.put(a[i], mapValue.get(a[i])+1);
            }
            else
                mapValue.put(a[i], 1);
        }

        for(Map.Entry<Integer, Integer> item:mapValue.entrySet()){
            if(item.getValue()%2 != 0){
                return item.getKey();
            }
        }
        return 0;
    }
}
