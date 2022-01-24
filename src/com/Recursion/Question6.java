package com.Recursion;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
         /*
         Create an array of 5 elements with values {1,2,4,2,6}.search value 2
         in the given array and print the first occurrence(index) of search value.
         Do it recursively The prototype of the method is as follows
         public static int find(int arr[ ], int currentIndex, int search_value)
         {
	       // set of statements;
           }
          */
         int[] arr = {1,2,4,2,6};
         int ans = find(arr,1,2);
        System.out.println(ans);
    }
    public static int find(int[] arr,int currentIndex,int search_values){
        for(int i=currentIndex+1;i<arr.length;i++){
            if(arr[i]==search_values){
                return i;
            }
        }
        return 0;
    }
}
