package ps10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jeongwon_10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[26];

		String s = br.readLine();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (arr[ch - 97] == -1) {
				arr[ch - 97] = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}

		System.out.println(sb);
	}

}
