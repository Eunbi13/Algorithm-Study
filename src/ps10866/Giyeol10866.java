
package week13.ps10866;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Giyeol10866 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();

      Deque<Integer> deq = new ArrayDeque<Integer>();       
      StringBuilder sb = new StringBuilder();


      for (int i = 0; i < n; i++) {
         String order = scan.next();

         switch (order) {
         
         case "push_front":
            deq.addFirst(Integer.parseInt(scan.next()));
            
            break;
            
         case "push_back":
            deq.addLast(Integer.parseInt(scan.next()));
            
            break;

         case "pop_front":
            if(deq.size() == 0) {
               sb.append(-1).append("\n");
            } else {
               sb.append(deq.getFirst()).append("\n");
               deq.removeFirst();
            }
            
            break;

         case "pop_back":
            if(deq.size() == 0) {
               sb.append(-1).append("\n");
            } else {
               sb.append(deq.getLast()).append("\n");
               deq.removeLast();
            }
            break;

         case "size":
            sb.append(deq.size()).append("\n");
            break;

         case "empty":
            if(deq.size() == 0) {
               sb.append(1).append("\n");
            }else sb.append(0).append("\n");
            
            break;

         case "front":
            
            if(deq.size() == 0) {
               sb.append(-1).append("\n");
            } else {
               sb.append(deq.getFirst()).append("\n");
            }
            break;

         case "back":
            if(deq.size() == 0) {
               sb.append(-1).append("\n");
            } else {
               sb.append(deq.getLast()).append("\n");
            }
            break;

         default:
            break;
         }

      }
      System.out.println(sb);

   }
}
