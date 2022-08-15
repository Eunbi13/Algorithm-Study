package ps10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jeongwon_10808 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] count = new int[26];

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			count[(int) s.charAt(i) - 97] += 1;
		}

		for (int i = 0; i < count.length; i++) {
			sb.append(count[i]).append(" ");
		}

		System.out.println(sb);
	}

}
