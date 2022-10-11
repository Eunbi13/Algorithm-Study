package ps2331;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeongwon_2331_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int P = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(A);

        while(true) {
            int temp = list.get(list.size() - 1);

            int result = 0;

            while (temp != 0) {
                result += Math.pow(temp % 10, P);
                temp /= 10;
            }

            if (list.contains(result)) {
                int ans = list.indexOf(result);
                System.out.println(ans);
                break;
            }

            list.add(result);
        }
    }
}
