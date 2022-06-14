package ps2445;

import java.util.Scanner;

public class Giyeol2445 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			
			int a = scan.nextInt();
			
			scan.close();
			for (int i=1; i<=a; i++) {
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				for (int j=1; j<=2*(a-i); j++) {
					System.out.print(" ");
				}
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for (int i=a-1; i>=1; i--) {
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				for (int j=1; j<=2*(a-i); j++) {
					System.out.print(" ");
				}
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
