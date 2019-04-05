

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Practice0001 {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a, int b) {
    	int totalPrice = 0;
    	
    	List<Integer>  list = new ArrayList(Arrays.asList(a));
    	//list.sort(c);;
    	int count = 0;
    	Collections.sort(list, Collections.reverseOrder());
    	for (Integer i : list) {
			totalPrice += i; 
		if(totalPrice < b)
		{
			count++;
		}
    	}
    }
//    	}
//    	(int i as list)
//    		
//        int u = 0;
//        int count = 0 ;
//        int num =0;
//        for(int k = 0 ; k < a.length;k++)
//        {
//        for(int i = 0 ; i < a.length-1 ;i++)
//        {
//           if(a[i] > a[i+1])
//           {
//               u = a[i];
//               a[i] = a[i+1];
//               a[i+1]= u;
//           //     count += 1;
//           }
//           
//        }
//       
//        
//       // if(count > b)
//        //{
//        	//break;
//       // }else
//        //{
//        	
////        	 count = count + a[k];
////        	 if(count < b)
////        	 {num++;}
//        //}
//        
//       }
//        for (int l = 0; l <a.length ;l++)
//        {
//         System.out.println(a[l]);
//
//        }
//
//       //int z = a.length -1;
//      //  System.out.println("Array is sorted in "+count+" swaps.");
//       // System.out.println("First Element: "+a[0] );
//    
        

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = {1, 12, 5, 111, 200, 1000 ,10};
        int k = 50;

        countSwaps(a,k);

    }
}
