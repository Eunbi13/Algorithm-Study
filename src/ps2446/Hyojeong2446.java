package ps2446;

import java.util.Scanner;

public class Hyojeong2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "*";

		for (int i = 0; i < 2 * num - 1; i++) {
			
			if (i < num) { // 위쪽
				for (int j = 0; j < i; j++)
					System.out.print(" ");
				for (int j = 0; j < (num - i) * 2 - 1; j++)
					System.out.print(star);
				System.out.println();
			} else {
				for (int j = 0; j < 2 * (num - 1) - i; j++) // 아래쪽
					System.out.print(" ");
				for (int j = 0; j < (i + 1 - num) * 2 + 1; j++)
					System.out.print(star);
				System.out.println();
			}
		}

	}
}
