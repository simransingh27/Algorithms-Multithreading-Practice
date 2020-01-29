package test;

import java.io.*;
import java.util.Arrays;

public class ParseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int count = 0;
        int[] totalCount = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (queries[i] == strings[j]) {
                    count++;
                    System.out.println("count" + count);
                }
            }
            totalCount[i] = count;
            count = 0;
        }

        return totalCount;
    }

    public static void main(String[] args) throws IOException {


        String[] queries = new String[]{"abcde", "sdaklfj", "asdjf","na","basdn"};
        String[] strings = new String[]{"abcde", "sdaklfj", "asdjf", "na","basdn" ,"sdaklfj","asdjf", "na", "asdjf","na", "basdn", "sdaklfj", "asdjf"};

        int[] output = matchingStrings(strings, queries);
        System.out.println("outcome : " + Arrays.toString(output));
    }
}
