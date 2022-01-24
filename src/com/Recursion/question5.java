package com.Recursion;
import java.util.*;

public class question5 {
    public static void main(String[] args) {
        String str = "tiniyui";
        remove(str,'i');
    }
    public static void remove(String str,char ch){
        char[] ch1 = new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch) {
                System.out.println(str.substring(i-1)) ;
            }
        }
        for(char ch2:ch1){
            System.out.println(ch2);
        }
    }
}
