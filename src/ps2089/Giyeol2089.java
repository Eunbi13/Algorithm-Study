package ps2089;

import java.util.Scanner;

public class Giyeol2089 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int rest = 0;
		

		StringBuilder sb = new StringBuilder();
		if(a == 0) {
			System.out.println(0);
		}
		
		else {
			
		while(a != 1) {
			
			if(a%2 == 0) {
				a = a / -2;
				sb.append(0);
			} else {
				a = a - 1;
				a = a / -2;
				sb.append(1);
			}
		}
		sb.append(1);
		}
		
		
		System.out.println(sb.reverse());
	
	}
}
