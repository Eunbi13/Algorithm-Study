package ps11655;

import java.util.Scanner;

public class Jeongwon_11655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();

		char[] ch = st.toCharArray();

		for (char c : ch) {
			if (c >= 'A' && c <= 'Z') {
				c += 13;
				if (c > 'Z') {
					c -= 26;
				}
			} else if (c >= 'a' && c <= 'z') {
				c += 13;
				if (c > 'z') {
					c -= 26;
				}
			}
			System.out.print(c);
		}

	}

}
