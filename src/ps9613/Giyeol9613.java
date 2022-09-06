package ps9613;

import java.util.Scanner;

public class Giyeol9613 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int round  = scan.nextInt();
		
		for(int i = 0; i<round; i++) {
			
			int smallround = scan.nextInt();
			int[] arr = new int[smallround];
			
			for(int j =0; j<smallround; j++) {
				
				arr[j] = (scan.nextInt());
			}
				long sum = 0;
				
				for(int k = 0; k<arr.length - 1; k++) {
					for(int l = k + 1; l<arr.length; l++) {
						sum += GCD(arr[k], arr[l]);
					}
				}
				sb.append(sum).append("\n");
			
			
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
