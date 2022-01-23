package com.Recursion;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
    /*
     Write a program to print numbers from 1 to n in increasing order recursively.
     Sample Input 1 :
     6
     Sample Output 1 :
     1 2 3 4 5 6
     */
      int n = 6;
      print(n);


    }
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
