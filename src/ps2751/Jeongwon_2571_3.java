package ps2751;

import java.util.Scanner;

public class Jeongwon_2571_3 {

	// Scanner + 버블정렬, 시간초과
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		int arr[] = new int[n + 1];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + 1);
		}
	}

}
