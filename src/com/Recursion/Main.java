package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	 Q1.
     Write a program to find x to the power n (i.e. x^n). Take x and n from the user.
     You need to return the answer.

     Do this recursively.
     Input format :
     Two integers x and n (separated by space)
     Output Format :
     x^n (i.e. x raise to the power n)

     Sample Input 1 :
     3 4
     Sample Output 1 :
     81
	 */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x*(power(x,n-1));
    }
}
