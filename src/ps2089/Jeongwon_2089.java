package ps2089;

import java.util.Scanner;
import java.util.Stack;

public class Jeongwon_2089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> list = new Stack<>();

        if(n == 0) {
            System.out.println("0");
            return;
        }

        while(n != 0) {
            int r = n % -2;
            if (r == -1) {
                n = (n/-2) + 1;
                r = 1;
                list.push(r);
            } else {
                list.push(r);
                n /= -2;
            }
        }

        while(!list.empty()) {
            System.out.print(list.pop());
        }
    }
}
