package ps2442;

import java.util.Scanner;

public class Giyeol2442 {

	public static void main(String[] args) {
		System.out.print("¼ö ÀÔ·Â>");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		
		for(int i = 1; i<=a; i++) {
			for(int j = 1; j<=a-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
