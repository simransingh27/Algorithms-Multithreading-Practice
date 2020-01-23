package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CreateMagazine {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Arrays.sort(magazine);
        Arrays.sort(note);
        int counter = 0;
        int match = 0;


        while (counter < magazine.length && match < note.length) {
            if (magazine[counter] == note[match]) {
                match++;
            }
            counter++;
        }
        if (match == note.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


    public static void main(String[] args) {


        String[] magazine = new String[]{"give", "me", "one", "grand", "today", "night"};
        String[] note = new String[]{"give", "one", "grand", "today"};
        checkMagazine(magazine, note);

    }
}
