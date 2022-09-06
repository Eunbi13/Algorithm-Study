package ps1934;

import java.util.Scanner;

public class Giyeol1934 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = scan.nextInt();
		
		for(int i = 0; i<a; i++) {
			int c = scan.nextInt();
			int d = scan.nextInt();
			
			int mul = c * d / GCD(c,d);
			sb.append(mul).append("\n");
		}
		System.out.println(sb);
	}
	
	
	public static int GCD(int a, int b) {

		while (b != 0) {
			int d = a % b;

			a = b;
			b = d;
		}
	return a;
}
}
