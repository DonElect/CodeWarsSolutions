package com.codewars.selectiveFearOfNumber;

public class FearOfNumber {
    public static void main(String[] args) {
        System.out.println(AmIAfraid("Friday", 10));
    }
    static public boolean AmIAfraid(final String day, final int num) {
        //Help me...
        if((day.equalsIgnoreCase("Monday"))&&(num != 12)){
            return true;
        }
        else if((day.equalsIgnoreCase("Tuesday"))&&(num <= 95)){
            return true;
        }
        else if((day.equalsIgnoreCase("Wednesday"))&&(num != 34)){
            return true;
        }
        else if((day.equalsIgnoreCase("Thursday"))&&(num != 0)){
            return true;
        }
        else if((day.equalsIgnoreCase("Friday"))&&(num%2 != 0)){
            return true;
        }
        else if((day.equalsIgnoreCase("Saturday"))&&(num != 56)){
            return true;
        }
        else if((day.equalsIgnoreCase("Sunday"))&&((num != 666)||(num != -666))){
            return true;
        }
        else
            return false;
    }
}
