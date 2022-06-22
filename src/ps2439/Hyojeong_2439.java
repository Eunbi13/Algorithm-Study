package ps2439;

import java.util.Scanner;

public class Hyojeong_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "*";

		for(int i = 0; i < num; i++) {
			for(int j = num; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
		sc.close();
	}
}
