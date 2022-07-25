package ps10814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Jeongwon_10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}

		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] o1, String[] o2) {

				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (String[] pos : arr) {
			bw.write(pos[0] + " " + pos[1] + "\n");
		}
		bw.flush();

		bw.close();
		br.close();
	}

}
