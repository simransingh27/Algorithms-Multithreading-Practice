package test;
/*Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. 
 * There are a number of different toys lying in front of him, tagged with their prices. 
 * Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.
 * Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy? 
 * For example, if  and Mark has  to spend, he can buy items  for , or  for  units of currency. 
 * He would choose the first group of  items.
 * Sample Input :7 50 [1 12 5 111 200 1000 10]
 * Sample Output : 4
 * */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraySortAndResult {

	// Complete the maximumToys function below.
	static int maximumToys(int[] prices, int k) {

		Arrays.sort(prices);
		int count = 0;
		int num = 0;
		int i = 0;

		for (i = 0; i < prices.length; i++) {

			count += prices[i];
			if (count < k) {
				num += 1;
			} else {
				break;
			}
		}
		return num;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] prices = new int[n];

		String[] pricesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pricesItem = Integer.parseInt(pricesItems[i]);
			prices[i] = pricesItem;
		}

		int result = maximumToys(prices, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
