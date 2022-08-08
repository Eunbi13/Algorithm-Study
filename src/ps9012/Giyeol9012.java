package new_ex.week12;

import java.util.Scanner;

public class Giyeol9012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;

		StringBuilder sb = new StringBuilder();	
		
		for(int i =0; i<n; i++) {
			String vps = scan.next();
			int length = vps.length();
			for(int j = 0; j<length; j++) {
			char g = vps.charAt(j);
				
			if(g == '(') {
				sum--;
			} else {
				sum++;
			}
			
			if(sum>0) break;
			}
			
			if(sum == 0) {
				sb.append("YES");
				sb.append("\n");
			} else {
				sb.append("NO");
				sb.append("\n");
			}
			sum = 0;
		}
		System.out.println(sb);
		
		
		
	}
}
