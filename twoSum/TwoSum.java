package com.codewars.twoSum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(num, 18)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return new int[0];
    }
}
