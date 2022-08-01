package ps11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jeongwon_11004 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Integer[] arr = new Integer[n];

		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {

			arr[i] = Integer.parseInt(st2.nextToken());

		}

		Arrays.sort(arr);

		System.out.println(arr[m - 1]);
	}

}
