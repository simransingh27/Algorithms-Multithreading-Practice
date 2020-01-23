import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//Super reduced String problem..
public class ReducedString {

    // Complete the superReducedString function below.
	static String superReducedString(String s) {
	       char[] tArray =  new  char[s.length()];
	        tArray = s.toCharArray();
	        char b = ' ';
	        char a = ' ';
	    	
	        for(int z = 1; z < s.length() ; z++)
	        {
	         a = s.charAt(z);
	         b = s.charAt(z-1);
	        	if(a == b)
	        	{
	        		String t = s.substring(0,z-1) ;
	        		String u = s.substring(z+1);
	        		s = t+u;
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

        String s = "aaabccddd";
        String result = superReducedString(s);
        System.out.println(result);
    }
}
