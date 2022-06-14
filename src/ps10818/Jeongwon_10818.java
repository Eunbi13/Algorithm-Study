package ps10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Jeongwon_10818 {

	public static void main(String[] args) throws IOException {

		// 2656ms
		// one();
		// 540ms
		// two();

	}

	public static void one() throws IOException {

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		// 배열 선언
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();

		}

		// Arrays.sort 기본값 오름차순 정렬
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n - 1]);

	}

	// 배열사용 X
	public static void two() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int max = -1000001;
		int min = 1000001;

		for (int i = 0; i < n; i++) {

			int val = Integer.parseInt(st.nextToken());

			if (val > max) {

				max = val;

			}

			if (val < min) {

				min = val;

			}

		}

		System.out.println(min + " " + max);

	}

}
