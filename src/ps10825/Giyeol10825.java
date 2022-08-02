package week11.ps10825;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Giyeol10825 {

	 public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      String[][] arr = new String[n][4];
	      
	      for(int i = 0; i<n; i++) {
	         for(int j = 0; j<4; j++) {
	            arr[i][j] = scan.next();
	         }
	      }
	      
	      Arrays.sort(arr, new Comparator<String[]>() {

	         @Override
	         public int compare(String[] o1, String[] o2) {
	             if(o2[1].equals(o1[1])){
	                       if(o1[2].equals(o2[2])){
	                           if(o1[3].equals(o2[3])){
	                               return o1[0].compareTo(o2[0]);
	                           }
	                           return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
	                       }

	                       return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);

	                   }
	                   return Integer.parseInt(o2[1])- Integer.parseInt(o1[1]);
	         }
	         
	      });
	        for(int i=0;i<arr.length;i++){
	               System.out.println(arr[i][0]);
	           }
	      
	   }
	}
