package ps10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Jeongwon_10989 {
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (Integer pos : arr) {
			bw.write(pos + "\n");
		}
		bw.flush();

		bw.close();
		br.close();
	}
}
