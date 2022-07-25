package week10.ps10814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Giyeol10814 {
	  public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);

	      int n = scan.nextInt();

	      String arr[][] = new String[n][2]; 

	      for (int i = 0; i < arr.length; i++) {
	          arr[i][0] = scan.next();
	            arr[i][1] = scan.next();

	      }

	      Arrays.sort(arr, new Comparator<String[]>() { 
	         @Override
	         public int compare(String[] o1, String[] o2) {

	            return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));

	         }

	      });

	      for (int i = 0; i < arr.length; i++) {

	         System.out.println(arr[i][0] + " " + arr[i][1]);

	      }
	   }

}
