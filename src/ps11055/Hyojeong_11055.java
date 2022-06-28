package ps11055;

import java.util.Scanner;

public class Hyojeong_11055 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = 0;
		int[] d = new int[num + 1];
		int[] a = new int[num + 1];

		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			d[i] = a[i];
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				if (a[j] < a[i] && d[j] + a[i] > d[i]) {
					d[i] = d[j] + a[i];
				}
			}
		}

		for (int i = 0; i < num; i++) {
			if (d[i] > max)
				max = d[i];
		}

		System.out.println(max);

	}
}
