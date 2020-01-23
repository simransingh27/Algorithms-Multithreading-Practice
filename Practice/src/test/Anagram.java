package test;

import java.util.Arrays;

public class Anagram {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int count = 0;
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < b1.length; j++) {
                if (a1[i] == b1[j]) {
                    count++;
                }
            }

        }
        int finalResult = (a1.length + b1.length) - (count * 2);

        return finalResult;
    }


    public static void main(String[] args) {

        String a = "fcrxzwscanmligyxyvym";

        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";


        int res = makeAnagram(a, b);
        System.out.println("result :" + res);
    }
}

