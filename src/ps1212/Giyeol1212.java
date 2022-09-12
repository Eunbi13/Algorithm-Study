package ps1212;

import java.util.Scanner;

public class Giyeol1212 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String eight = scan.next();
		StringBuilder sb= new StringBuilder();
		int a = 0;
		
		for(int i = 0; i<eight.length(); i++) {
			a = eight.charAt(i) - 48;
			sb.append(a/4);
			a = a % 4;
			sb.append(a/2);
			a = a % 2;
			sb.append(a);
		}
		if(sb.charAt(0) == '0') {	
			sb.delete(0,1);
		}
		
		if(sb.charAt(0) == '0') {	
			sb.delete(0,1);
		}
		
		System.out.println(sb);
		
	}
}
