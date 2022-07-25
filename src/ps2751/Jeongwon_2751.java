package ps2751;

import java.util.Arrays;
import java.util.Scanner;

public class Jeongwon_2751 {

	// Scanner + Arrays.sort, 시간 초과
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
