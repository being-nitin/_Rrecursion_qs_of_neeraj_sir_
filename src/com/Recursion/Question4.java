package com.Recursion;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
    /*
      Write a program to find and return the sum of all elements of the array. Do this recursively.

      Sample Input 1 :
      3
      9 8 9
      Sample Output 1 :
      26
      Sample Input 2 :
      3
      4 2 1
      Sample Output 2 :
      7
     */
        int[] arr = {1,2,3,4,5};
        int ans = sumArray(arr,arr.length);
        System.out.println(ans);

    }
    public static int sumArray(int[] arr,int n){
        if(n==0){
            return 0;
        }
        return arr[n-1] +sumArray(arr,n-1);
    }
}
