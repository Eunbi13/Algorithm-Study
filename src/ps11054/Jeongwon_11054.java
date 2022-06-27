package ps11054;

import java.util.Scanner;

public class Jeongwon_11054 {

	// 352ms
	// https://cocoon1787.tistory.com/702
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int result = 0;
		// 수열 크기 입력
		int t = sc.nextInt();
		// 수열을 이루고있는 원소 값 배열
		int[] arr = new int[t];
		// 상승 부분 수열의 길이 값 배열
		int[] up = new int[t];
		// 하강 수열의 길이 값 배열
		int[] down = new int[t];

		// 수열을 이루고있는 값 입력
		for (int i = 0; i < t; i++) {
			arr[i] = sc.nextInt();
		}

		// 상승
		for (int i = 0; i < t; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					max = Math.max(max, up[j]);
				}
			}
			up[i] = max + 1;
		}

		// 하강
		for (int i = t - 1; i >= 0; i--) {
			int max = 0;
			for (int j = t - 1; j > i; j--) {
				if (arr[j] < arr[i]) {
					max = Math.max(max, down[j]);
				}
			}
			down[i] = max + 1;
		}

		for (int i = 0; i < t; i++) {
			result = Math.max(result, up[i] + down[i]);
		}

		System.out.println(result - 1);
	}

}
