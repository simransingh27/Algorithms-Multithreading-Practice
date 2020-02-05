package test;

import jdk.nashorn.internal.ir.CallNode;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.*;

public class Solition {

    public static void main(String[] args) {

        int[] test = {-1, -2, -3};

        Integer[] test1 = new Integer[3];
        ArrayList<Integer> test2 = new ArrayList<>();

        int number = Solition.solution(test);
        System.out.println("output : " + number);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static int solution1(int[] A) {
        // write your code in Java SE 8
        int value = A.length;
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < value; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }

        for (int i = 1; i < value + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}