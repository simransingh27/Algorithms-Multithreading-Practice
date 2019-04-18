import java.io.*;
import java.util.Scanner;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Practice1 {

	// Complete the diagonalDifference function below.
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		int[] a = { 1, 2, 3, 4, 5 };
		int d = 4;
		int temp = 0;

		int first = a.length;

		for (int i = 0; i < d; i++) {
			a[first - 1] = a[i];
			for (int y = 0; y < a.length - 1; y++) {

				a[y] = a[y + 1];
			}
			//a[first - 1] = a[i];
		}

	}
}
