package week15.ps1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Giyeol1158 {

	  public static void main(String[] args) {
	      
	      Scanner scan = new Scanner(System.in);
	      Queue<Integer> que = new LinkedList<Integer>();
	      int N = scan.nextInt();
	      int K = scan.nextInt();
	      
	      StringBuilder sb = new StringBuilder();
	      sb.append("<");
	      
	      for(int i = 1; i<=N; i++) {
	         que.add(i);
	      }
	      
	      for(int i = 0; i<N; i++) {
	         for(int j = 0; j<K-1; j++) {
	            que.add(que.poll());
	         }
	         sb.append(que.poll());
	         if(i != N-1) {
	            sb.append(", ");
	         } else {
	            sb.append(">");
	            
	         }
	      }
	      System.out.println(sb);
	      
	      
	   }

}
