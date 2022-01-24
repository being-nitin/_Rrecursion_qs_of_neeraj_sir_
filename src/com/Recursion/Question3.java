package com.Recursion;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
     /*
      Write a program to find out and return the number of digits present in a number recursively.

      Sample Input 1 :
      156
      Sample Output 1 :
      3
      Sample Input 2 :
      7
      Sample Output 2 :
      1
      */
        int n = 678987;
        noOfDigits(n,0);
    }

    public static void noOfDigits(int n,int c){
        int rem=0;
        if(n==0){
            System.out.println(c);
            return;
        }
        rem=n%10;
        noOfDigits(n/10,c+1);
    }
}
