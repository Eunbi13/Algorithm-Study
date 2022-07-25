package ps2751;

import java.util.Scanner;

public class Jeongwon_2751_2 {

	// Scanner + 선택정렬, 시간초과
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			// ex. n = 5, i = 0, j = 1, 2, 3, 4
			// arr[0] 과 arr[1], arr[2], arr[3], arr[4] 비교
			// 5 4 3 2 1
			for (int j = i + 1; j < n; j++) {
				// arr[0] > arr[1]
				// 5 4
				if (arr[i] > arr[j]) {
					// tmp = arr[0] = 5
					int tmp = arr[i];
					// arr[0] = arr[1]
					// 5 4
					arr[i] = arr[j];
					// arr[1] = 4
					arr[j] = tmp;
					// arr[0] 이 큼에 따라 arr[1]과 값을 스위칭
				}
			}

			System.out.println(arr[i]);
		}

	}

}
