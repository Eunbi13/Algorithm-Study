package week14.ps11656;

import java.util.Arrays;
import java.util.Scanner;

public class Giyeol11656 {
	
	      
	public static void main(String[] args) {
		
	
	      Scanner scan = new Scanner(System.in);
	      
	      String word = scan.next();
	      int n = word.length();
	      int a = 0;
	      char[] arr = new char[n];
	      String[] arr1 = new String[n];
	      String word1 = "";
	      
	      for(int j = 0 ; j<n; j++) {
	      for(int i = a; i<n; i++) {
	         word1 += String.valueOf(word.charAt(i));
	      }
	      arr1[j] = word1;
	      word1 = "";
	      a++;
	      }
	      
	      
	      Arrays.sort(arr1);
	      StringBuilder sb = new StringBuilder();
	      for(String b : arr1) {
	         sb.append(b).append("\n");
	      }
	      System.out.println(sb);
	      
	      
	      
	   }

	
}
