package ps2331;

import java.util.ArrayList;
import java.util.Scanner;

public class Jeongwon_2331 {
    static boolean[] v;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
        v = new boolean[10001];
        ArrayList<Integer> arrNum = new ArrayList<>();
        ArrayList<Integer> arrNum2 = new ArrayList<>();
        arrNum2.add(n);
        int result = 0;
        boolean c = false;

        // while(!v[n]) {
        while(!v[n]) {
            v[n] = true;
            arrNum.clear();

            while(n > 0) {
                arrNum.add(n % 10);
                n /= 10;
            }

            for(int i = 0; i < arrNum.size(); i++) {
                a += Math.pow(arrNum.get(i), m);
            }

            arrNum2.add(a);

            n = a;
            a = 0;

        }

        for(int i = 0; i < arrNum2.size(); i++) {
            for(int j = i+1; j < arrNum2.size(); j++) {
                if(arrNum2.get(i) == arrNum2.get(j)) {
                    System.out.println("여기");
                    c = true;
                    break;
                }
            }
            System.out.println(arrNum2.get(i));
            if (c == false) {
                result += 1;    
            }
        }

        System.out.println(result);
        
    }
}
