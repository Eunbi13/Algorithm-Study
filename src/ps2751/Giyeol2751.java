package week10.ps2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Giyeol2751 {
	 public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);
	      StringBuilder sb = new StringBuilder();

	      int n = scan.nextInt();
	      List<Integer> list = new ArrayList<>();

	      for (int i = 0; i < n; i++) {

	         list.add(scan.nextInt());

	      }
	      
	      Collections.sort(list);

//	      
//	      for(int i : list) {
//	         System.out.println(i);
//	      }
	      
	      for (int a : list) {
	         sb.append(a).append('\n');
	         
	      }
	      
	      System.out.println(sb);

	   }

}
