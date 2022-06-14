package ps2439;

import java.util.Scanner;

public class Giyeol_2439 {

	public static void main(String[] args) {
		
		
		System.out.print("수를 입력하세요>");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
	
		for(int i = 1; i<=a; i++) {
			for(int j = 1; j<=a-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
