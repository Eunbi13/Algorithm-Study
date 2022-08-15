package week13.ps10820;

import java.util.Scanner;

public class Giyeol10820 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String sentence = scan.nextLine();
      StringBuilder sb = new StringBuilder();
      int bigWord = 0; // 65~90
      int smallWord = 0; // 97~122
      int space = 0; // 32
      int number = 0;

      for (int i = 0; i < sentence.length(); i++) {

         int cha = (int) sentence.charAt(i);

         if (cha == 32) {
            space++;
         } else if (65 <= cha && cha <= 90) {
            bigWord++;
         } else if (97 <= cha && cha <= 122) {
            smallWord++;
         } else
            number++;

      }
      
      sb.append(smallWord).append(" ").append(bigWord).append(" ").append(number).append(" ").append(space);
      System.out.println(sb);

   }
}