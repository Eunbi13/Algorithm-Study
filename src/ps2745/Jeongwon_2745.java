package ps2745;

import java.util.Scanner;

public class Jeongwon_2745 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		String s = sc.next();
		int b = sc.nextInt();
		for (int i = 0; i < s.length(); i++) {
			if ('0' <= s.charAt(i) && '9' >= s.charAt(i))
				ans = ans * b + (s.charAt(i) - '0');
			else
				ans = ans * b + (s.charAt(i) - 'A' + 10);
		}
		System.out.println(ans);
	}
}
