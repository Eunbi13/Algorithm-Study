package ps1676;

import java.util.Scanner;

public class Jeongwon_1676 {
    public static void main(String[] args) {
        //32부터 값이 이상하게 나옴 *타입 수정 필요할듯
        Scanner sc = new Scanner(System.in);

        int n;
        int a = 1;
        int c = 0;
        
        n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            a = a * i;
        }

        String s = String.valueOf(a);
        char[] charArr = s.toCharArray();
        System.out.println(charArr);

        for (int i = charArr.length-1; i >= 0; i--) {
            int b = charArr[i] - '0';
            if ( b == 0) {
                // System.out.println(b);
                c += 1;
            } else {
                break;
            }      
        }
        System.out.println(c);
    } 
}
