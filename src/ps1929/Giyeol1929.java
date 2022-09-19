package ps1929;

import java.util.Scanner;

public class Giyeol1929 {

   public static void main(String[] args)  {
      
      Scanner scan = new Scanner(System.in);
      int M = scan.nextInt();
      int N = scan.nextInt();
      StringBuilder sb = new StringBuilder();
      
      
      if(M == 1) {
         M = 2;
      }
      for(int i = M; i<=N; i++) {
         
         boolean pan = true;
         
         
         
         for(int j = 2; j<=Math.sqrt(i); j++) {
            if(i%j == 0) {
               pan = false;
               break;
            }
         }
         if(pan == true) {
            sb.append(i).append("\n");
         }
      }
      System.out.println(sb);
      
   }
}