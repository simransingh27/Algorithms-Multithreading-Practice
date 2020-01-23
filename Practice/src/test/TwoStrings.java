package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        int i = 0;
        String result = null;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(s2.indexOf(ch) > -1 && s1.indexOf(ch) > -1){
                return "YES";
            }
        }
        return "NO";


//        for (i = 0; i < s1.length(); i++) {
//            for (int j = 0; j < s2.length(); j++) {
//                if (s1.charAt(i) == s2.charAt(j)) {
//                    result = "YES";
//                    break;
//                }
//            }
//            if (result != "YES") {
//                result = "NO";
//            }
//
//        }
//        return result;
    }


    public static void main(String[] args) throws IOException {


        String s1 = "beetroot";

        String s2 = "sandals";

        String result = twoStrings(s1, s2);
        System.out.println("result : " + result);


    }
}

