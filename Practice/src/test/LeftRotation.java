package test;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        Integer number = 5;
        int[] integers = new int[]{1,2,3,4,5};

        int[] output = leftRotation(number, integers);
        System.out.println("outcome : " + Arrays.toString(output));
    }

    public static int[] leftRotation(int number, int[] integers)
    {
        int count =0;
        int temp =0;
        int temp1 =0;
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<integers.length;j++)
            {
              temp =  integers[integers.length-1];
              integers[integers.length-1] = integers[0];


                integers[integers.length]

            }
        }

        return null;
    }
}
