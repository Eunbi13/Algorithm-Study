package ps2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jeongwon_2571_6 {

	// BufferedReader + Collections.sort, 성공
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(arr);

		for (int i = 0; i < arr.size(); i++) {
			st.append(arr.get(i)).append('\n');
		}

		System.out.println(st);

	}

}
