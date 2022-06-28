package ps11054;

import java.util.Scanner;

public class Hyojeong_11054 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			arr[i] = sc.nextInt();
		}

		int[] dpLR = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			dpLR[i] = 1;
			for (int j = 1; j < i; j++) {
				if (arr[i] > arr[j]) {
					dpLR[i] = Math.max(dpLR[j] + 1, dpLR[i]);
				}
			}
		}

		int[] dpRL = new int[num + 1];
		for (int i = num; i > 0; i--) {
			dpRL[i] = 1;
			for (int j = num; j > i; j--) {
				if (arr[i] > arr[j]) {
					dpRL[i] = Math.max(dpRL[j] + 1, dpRL[i]);
				}
			}
		}

		int max = 0;
		for (int i = 1; i <= num; i++) {
			max = Math.max(max, dpLR[i] + dpRL[i]);
		}

		System.out.println(max - 1);
		sc.close();
	}
}
