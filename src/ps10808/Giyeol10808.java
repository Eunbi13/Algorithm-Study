package week13.ps10808;

import java.util.Arrays;
import java.util.Scanner;

public class Giyeol10808 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] arr = new int[26];
      // 소문자 a : 아스키코드로 97
      StringBuilder sb = new StringBuilder();

      String word = scan.next();

      for (int i = 0; i < word.length(); i++) {
         arr[(int) word.charAt(i) - 97]++;
      }

      for (int i = 0; i < 26; i++) {
         sb.append(arr[i]).append(" ");
      }

      System.out.println(sb);

   }
}