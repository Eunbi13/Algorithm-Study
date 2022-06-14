package ps10992;

import java.util.Scanner;

public class Hyojeong10992 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "*";

		for (int i = 1; i <= num; i++) {
			if (i == num) {
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(star);
				}
				System.out.println();
				break;
			}
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {			
				if (j == 1 || j == 2 * i - 1) {
					System.out.print(star);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
