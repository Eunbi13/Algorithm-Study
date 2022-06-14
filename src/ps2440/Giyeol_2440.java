package ps2440;

import java.util.Scanner;

public class Giyeol_2440 {

	public static void main(String[] args) {
		System.out.print("수를입력하세요>");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		scan.close();
		
		for(int i = 1; i<=a; i++) {
			for(int j =i; j<=a; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

