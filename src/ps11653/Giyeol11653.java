package ps11653;

import java.util.Scanner;

public class Giyeol11653 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N == 1) {
			System.out.println();
		} else {
			if(sosu(N) == false) {
				System.out.println(N);
			} else {
				
				for(int i = 2; i<=N; i++) {
					while(N % i==0) {
						System.out.println(i);
						N = N/ i;
					}
				}
			}
		}
	}
	public static boolean sosu(int num) {
		
		boolean pan = false;
		if(num == 2) {
			pan = false;
		} 
		for(int i = 2; i <= Math.sqrt(num); i++) {
	        
			if(num % i == 0) {
				return pan = true;
			}
		}
		return pan ;
		
	}
	
}
