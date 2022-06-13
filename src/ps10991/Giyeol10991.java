package ps10991;

import java.util.Scanner;

public class Giyeol10991 {
	public static void main(String[] args) {
		
		int num = new Scanner(System.in).nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
				if (k != i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
