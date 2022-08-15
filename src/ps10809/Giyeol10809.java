package week13.ps10809;

import java.util.Scanner;

public class Giyeol10809 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String word = scan.next();
      StringBuilder sb = new StringBuilder();
      int[] arr = new int[26];
      
      for(int i = 0; i<26; i++) {
         arr[i] = -1;
      }
      
      for(int i = 0; i<word.length(); i++) {
         
         if(arr[(int) word.charAt(i) - 97] == -1) {
            arr[(int) word.charAt(i) - 97] = i;
         } 
      }
      for(int i = 0; i< 26; i++) {
         sb.append(arr[i]).append(" ");
      }
      System.out.println(sb);
   }
}