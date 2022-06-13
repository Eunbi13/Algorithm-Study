package ps10992;

import java.util.Scanner;

public class Giyeol10992 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		scan.close();
	
		for (int i = 0; i < a; i++) {
			for (int j = 1; j < 2 * a; j++) {
				if (j > a + i)
					break;
				if (i == a - 1) {
					System.out.print("*");
					continue;
				}
				if (j == a - i || j == a + i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();

		}

	}
}
