package ps2751;

import java.util.Scanner;

public class Jeongwon_2571_5 {

	// Scanner + 삽입정렬, 시간초과
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			for (int j = i; j >= 1; j--) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				} else
					break;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
