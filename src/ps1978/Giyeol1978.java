package ps1978;

import java.util.Scanner;

public class Giyeol1978 {

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int N = scan.nextInt();
      int a = 0;
      
      for(int i = 0; i<N; i++) {
         
         int pan = 0; 
         int su = scan.nextInt();
         
         if(su == 1) {
            pan = 1;
         }
         
         for(int j = 2; j< su; j++) {
            if(su % j == 0) {
               pan = pan + 1;
            }
         }
         if(pan == 0) {
            a++;
         }
      }
      System.out.println(a);
   }
}