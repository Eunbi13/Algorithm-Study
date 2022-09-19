package ps1978;

import java.util.Scanner;

public class Jeongwon_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0;

        for (int i = 1; i <= n; i++) {
             
            int a = sc.nextInt();
            boolean b = true;

            if(a == 1) {
                b = false;
            }
            
            for (int j = 2; j < a; j++) {
                
                if (a % j == 0) {
                    b = false;
                    break;
                }

            }
            if ( b == true) {
                c++;
            }
        }

        System.out.println(c);
    }
}
