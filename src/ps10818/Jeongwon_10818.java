package ps10818;

import java.util.Arrays;
import java.util.Scanner;

public class Jeongwon_10818 {

	// 2656ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		// 배열 선언
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();

		}

		// Arrays.sort 기본값 오름차순 정렬
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n - 1]);

	}

}
