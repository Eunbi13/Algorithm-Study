package ps1934;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jeongwon_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int a, b;

        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> bList = new ArrayList<Integer>();
        List<Integer> cList = new ArrayList<Integer>();

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            aList.clear();
            bList.clear();
            cList.clear();

            for (int x = 1; x <= a; x++) {
                if (a%x == 0) {
                    aList.add(x);
                }
            }

            for (int y = 1; y <= b; y++) {
                if (b%y == 0) {
                    bList.add(y);
                }
            }

            for (int c = 0; c < aList.size(); c++) {
                for (int d = 0; d < bList.size(); d++) {
                    if (aList.get(c).equals(bList.get(d))) {
                        cList.add(aList.get(c));
                    }
                }
            }

            int max = Collections.max(cList);
            int aa = a / max;
            int bb = b / max;

            System.out.println(max*aa*bb);
            
        }
    }
}
