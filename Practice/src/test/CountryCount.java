package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class CountryCount {
    public static void main(String[] args) {
        int[][] array = new int[][]
                {{5, 4, 4},
                        {4, 3, 4},
                        {3, 2, 4},
                        {2, 2, 2},
                        {3, 3, 4},
                        {1, 4, 4},
                        {4, 1, 1}
                };

        int value = solution(array);
    }

    public static int solution(int[][] A) {
        // write your code in Java SE 8
        int count1 = 0;
        int count2 = 0;
        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < A.length - 2; i++) {
            for (int j = 0; j < A[i].length - 2; j++) {
                {
                    System.out.println("Value1 :" + A[i][j] + " Value2 :" + A[i + 1][j]);
                    if (A[i][j] == A[i + 1][j]) {
                        count1++;
                        if (A[i][j] == A[i][j + 1])
                            System.out.println("Value3 :" + A[i][j + 1]);
                        count2++;
                        List<String> value =  new LinkedList<>();
                    }

                    PriorityQueue<String> priorityQueue =  new PriorityQueue<>();
                }

                if (count1 +count2 > 1) {
                    list1.add("value");
                }


            }
            System.out.println("value"+ list1.toString());
        }


        return list1.size();
    }
}
