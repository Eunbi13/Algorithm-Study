package ps9613;

import java.util.Scanner;

public class Jeongwon_9613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int arr[] = new int[a];
			for (int j = 0; j < a; j++) {
				arr[j] = sc.nextInt();
			}
			long sum = 0;
			for (int j = 0; j < a; j++) {
				for (int k = j; k < a; k++) {
					if (j != k) {
						sum += gcd(arr[j], arr[k]);
					}
				}
			}
			System.out.println(sum);
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
