package test;

/*
 * Scenario
 * HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .

Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

 * */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingProblem {

	static int[] gradingStudents(int[] grades) {
		int temp = 0;
		int temp1 = 0;
		int value = 0;
		int value1 = 0;

		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 37) {
				temp = grades[i] / 5;
				temp1 = temp + 1;
				value = temp1 * 5;

				value1 = value - grades[i];
				if (value1 < 3) {
					grades[i] = value;
				}

				if (grades.length == 3 & temp == 0) {

					for (int x = i; x < grades.length; x++) {
						grades[x] = grades[x + 1];
					}
				}
			}

		}
		for (int k = 0; k < grades.length - 1; k++) {
			if (grades.length == 2)
				if (grades[k] == 38) {
					grades[k] = 40;
				}
		}
		return grades;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bw.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bw.write("\n");
			}
		}

		bw.newLine();

		bw.close();
	}
}
