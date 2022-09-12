package ps2745;

import java.util.Scanner;

public class Giyeol2745 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		int B = scan.nextInt();
		int dec = 0;
		char[] arr =  N.toCharArray();
		
		for(int i = 0; i<arr.length; i++) {
			
			if(65 <= (int) arr[i] && (int) arr[i] <= 90) {
				
				dec += ((int)arr[i] - 55) * Math.pow(B, arr.length - i - 1);
			} else {
				dec += ((int)arr[i] - 48) * Math.pow(B, arr.length - i - 1);
			}

		}
		System.out.println(dec);
		
	}
}
