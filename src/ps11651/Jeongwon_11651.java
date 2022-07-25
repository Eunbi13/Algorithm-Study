package ps11651;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Jeongwon_11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Integer[][] arr = new Integer[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<Integer[]>() {
			public int compare(Integer[] o1, Integer[] o2) {
				if (o1[1].equals(o2[1])) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (Integer[] pos : arr) {
			bw.write(pos[0] + " " + pos[1] + "\n");
		}
		bw.flush();

		bw.close();
		br.close();

	}

}
