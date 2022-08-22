package week14.ps10824;

import java.util.Scanner;

public class Giyeol10824 {

	public static void main(String[] args) {
		String[] arr = new String[4];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<4; i++) {
			arr[i] = scan.next();
		}
		int sum = Integer.parseInt(arr[0].concat(arr[1])) + Integer.parseInt(arr[2].concat(arr[3]));
		System.out.println(sum);
	}
}
