package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * Scenario
 *Steve has a string of lowercase characters in range ascii[‘a’..’z’]. He wants to reduce the string to its shortest length by 
 *doing a series of operations. In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. 
 *For instance, the string aab could be shortened to b in one operation.
 *Steve’s task is to delete as many characters as possible using this method and print the resulting string. 
 *If the final string is empty, print Empty String
 *
 * Sample Input : aaabccddd
 * Sample Output : abd
 * aaabccddd → abccddd → abddd → abd
 */

	
	public class SuperReducedString { 

	    // Complete the superReducedString function below.
	    static String superReducedString(String s) {
	       char[] tArray =  new  char[s.length()];
	        tArray = s.toCharArray();
//	       int z = 0 ;
	        char b = ' ';
	        char a = ' ';
	    	
	        for(int z = 1; z < s.length() ; z++)
	        {
	         a = s.charAt(z);
	         b = s.charAt(z-1);
	        	if(a == b)
	        	{
	        		s = s.substring(0,z-1) + s.substring(z+1); 
	        		z = 0;
	        	}
	        }
	        
	        if(s.length() == 0)
	        {
	        	return "Empty String";
	        }
	        else {
	        	return s;
	        }

	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        String result = superReducedString(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}


