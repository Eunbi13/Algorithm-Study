package ps1676;

import java.util.Scanner;

public class Giyeol1676 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int dec = 0;
		
//		int pack = 1;
//		
//		if(a<5) {
//			System.out.println(0);
//		} else {
//			for(int i = 2; i<=a; i++) {
//				pack = pack * i;
//			}
//			while(pack % 10 ==0) {
//				pack = pack / 10;
//				dec ++;
//			}
//			System.out.println(dec);
//		}
		


//		dec = a / 5;
//		System.out.println(dec);
		
//		if(a<5) {
//			System.out.println(0);
//		} else {
//		while(a % 5 == 0) {
//			a = a / 5;
//			dec += a;
//			}
//		System.out.println(dec);
//		}
		
		while(a>=5) {
			a = a / 5;
			dec += a;
		}
		System.out.println(dec);
	}
}
