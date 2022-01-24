package com.Recursion;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        /*
         Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the
         given array and print all the  occurrence(index) of search value(7) by holding
         the index in a result array . Do it recursively

         The prototype of the method is as follows:-

         public static int[] res(int arr[], int current index, int search_value)
        {
	     // set of statements;
         }
         */
         int[] arr = {1,7,4,7,6,7};
          res(arr,0,7);
    }

    public static void res(int[] arr, int currentIndex, int searchValue) {
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr1[k] =i;
                    arr2[k] =j;
                    k++;
                    break;
                }
            }
        }
        // the indexes of the duplicates are:
        System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
    }
}