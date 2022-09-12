package ps1373;

import java.util.Scanner;

public class Giyeol1373 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String two = scan.next();
		String eight = "";
		StringBuilder sb = new StringBuilder();
		
		if(two.length()%3 == 1) {
			two = "00" + two;
		} else if(two.length()%3 == 2) {
			two = "0" + two;
		}
		
//		char[] arr= two.toCharArray();
//		
//		for(int i = arr.length; i>0; i = i-3) {
//			eight = Integer.toString((arr[i-1] - 48) + (arr[i-2] - 48)*2 + (arr[i-3] - 48)*4) + eight;
//		}
//		System.out.println(eight);
//		
		
		 for(int i = two.length() % 3; i < two.length(); i+=3) {
	            sb.append((two.charAt(i) - 48) * 4 + (two.charAt(i+1) - 48) * 2
	                    + (two.charAt(i+2) - 48));
	        }
	        System.out.println(sb);
		

		
		
	}
}
