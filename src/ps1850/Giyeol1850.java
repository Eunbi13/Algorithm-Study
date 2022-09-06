package ps1850;

import java.util.Scanner;

public class Giyeol1850 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		

		long real = 0;
		
		long c = GCD(a, b);
		
		for(long i = 0; i<c; i++) {
			real = real + (long)Math.pow(10, i);
			
		}
//		System.out.println(real);	
		
		StringBuilder sb = new StringBuilder();
        for(int i=1; i <= c; i++) sb.append("1");
        
        System.out.println(sb.toString());

	}
	
	public static long GCD(long a, long b) {
		while (b != 0) {
			long d = a % b;

			a = b;
			b = d;
		}
	return a;
	}
}
