package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int temp = 0;
        int count = 0;
        int position;

        for (int i = 0; i < (arr.length - 1); i++) {
            position = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[position] > arr[j]) {
                    position = j;
                }
            }
            if (position != i) {
                temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
                count++;
            }
        }


//        int i,j,position,swap;
//        int count = 0;
//        int arr_count = arr.length;
//        for (i = 0;i<(arr_count - 1);i++)
//        { position = i;
//            for (j=i + 1;j<arr_count;j++)
//            {
//                if (arr[position]>arr[j])
//                    position = j;
//            }
//            if (position != i)
//            {
//                swap = arr[i];
//                arr[i] = arr[position];
//                arr[position] = swap;
//                count++;
//            }
//        }
        return count;
    }

    //  return count;


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] arr = new int[]{2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19};
        int res = minimumSwaps(arr);
        System.out.println("Number of swaps : " + res);

    }
}
