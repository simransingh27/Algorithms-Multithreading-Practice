package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 *Scenario
 *The factorial of the integer , written , is defined as:

Calculate and print the factorial of a given integer.

For example, if n = 10, we calculate  and get 10*9*8*7...*1	.
 **/
public class ExtraFactorial {
	static void extraLongFactorials(int n) {

        BigInteger value  =    new BigInteger("1");
        for(int i = 2; i<=n;i++)
        {
            value = value.multiply(BigInteger.valueOf(i)); 
        }
        
        System.out.println(value);
            

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
