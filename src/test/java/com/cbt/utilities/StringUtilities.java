package com.cbt.utilities;

public class StringUtilities {
    public static void verifyEquals(String expected, String actual){
        if(expected.equalsIgnoreCase(actual)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
