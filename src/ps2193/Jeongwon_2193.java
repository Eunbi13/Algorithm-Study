package ps2193;

import java.util.Scanner;

public class Jeongwon_2193 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

        int[] arr = new int[n];
        if (n == 1) {
            arr[0] = 1;
        } else if (n == 2) {
            arr[1] = 1;
        } else {
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        System.out.println(arr[n-1]);
    }
    
}
