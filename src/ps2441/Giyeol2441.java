package ps2441;

import java.util.Scanner;

public class Giyeol2441 {

	public static void main(String[] args) {

		System.out.print("숫자입력>");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		scan.close();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (int k = a;  k> i; k--) {
				System.out.print("*");
			}		
			
			System.out.println();
		}

	}
}
