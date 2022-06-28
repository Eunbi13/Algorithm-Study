package ps11053;

import java.util.Scanner;

public class Hyojeong_11053 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = 0;
		int[] d = new int[num + 1];
		int[] a = new int[num + 1];

		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			d[i] = 1;
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				if (a[j] < a[i] && d[j] >= d[i]) {
					d[i] = d[j] + 1;
				}
			}
		}

		for (int i = 0; i < num; i++) {
			if (d[i] > max)
				max = d[i];
		}

		System.out.println(max);
		sc.close();
	}
}
