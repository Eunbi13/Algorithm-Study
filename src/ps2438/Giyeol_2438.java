package ps2438;

import java.util.Scanner;

public class Giyeol_2438 {
	public static void main(String[] args) {
		System.out.print("층 수를 입력해주세요>");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
		for(int i = 1; i<=a; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
