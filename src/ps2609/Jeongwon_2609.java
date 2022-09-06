package ps2609;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jeongwon_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> bList = new ArrayList<Integer>();
        List<Integer> cList = new ArrayList<Integer>();

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (a%i == 0) {
                aList.add(i);
            }
        }

        for (int i = 1; i <= b; i++) {
            if (b%i == 0) {
                bList.add(i);
            }
        }
        for (int i = 0; i < aList.size(); i++) {
            for(int j = 0; j < bList.size(); j++) {
                // aList.get(i) == bList.get(j)로 조건문을 비교했을때 "틀렸습니다" 가 나온 이유
                // https://www.acmicpc.net/board/view/99192#post
                if (aList.get(i).equals(bList.get(j))) {
                    cList.add(aList.get(i));
                }
            }
        }

        int max = Collections.max(cList);
        int aa = a / max;
        int bb = b / max;

        System.out.println(max);
        System.out.println(max*aa*bb);
        
    }
}
