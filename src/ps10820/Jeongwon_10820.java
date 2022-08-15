package ps10820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jeongwon_10820 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// a ~ z : 97 ~ 122
		// A ~ Z : 65 ~ 90
		// 0 ~ 9 : 48 ~ 57
		// '' : 32

		String s = br.readLine();
		int lower = 0, upper = 0, number = 0, space = 0;

		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			if (97 <= ch && ch <= 122) {
				lower += 1;
			} else if (65 <= ch && ch <= 90) {
				upper += 1;
			} else if (48 <= ch && ch <= 57) {
				number += 1;
			} else if (ch == 32) {
				space += 1;
			}
		}
		sb.append(lower + " " + upper + " " + number + " " + space);

		System.out.println(sb);
	}

}
