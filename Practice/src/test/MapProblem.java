package test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
/**
 * Simple Map problem
 * It prints phone number if its available in the directory else print "Not found"
 * */
public class MapProblem {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> phoneDirectory = new HashMap<>();
        Integer[] a ={};
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneDirectory.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            boolean value = phoneDirectory.containsKey(s);
            if (value) {
                System.out.println("Name : " + s + " Number" + phoneDirectory.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}




