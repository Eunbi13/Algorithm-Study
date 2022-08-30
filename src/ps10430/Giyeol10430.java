package week15.ps10430;

import java.util.Scanner;

public class Giyeol10430 {

	 public static void main(String[] args) {
		 
		 // 증명
		 // https://st-lab.tistory.com/19
		 
	      Scanner scan = new Scanner(System.in);
	      
	      int A = scan.nextInt();
	      int B = scan.nextInt();
	      int C = scan.nextInt();
	      
	      StringBuilder sb = new StringBuilder();
	      sb.append((A+B)%C).append("\n");
	      sb.append( ((A%C) + (B%C))%C).append("\n");
	      sb.append((A*B)%C).append("\n");
	      sb.append(((A%C) * (B%C))%C).append("\n");
	      System.out.println(sb);
	      
	   }

}
