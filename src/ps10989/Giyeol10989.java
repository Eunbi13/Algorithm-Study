package week11.ps10989;

import java.util.Scanner;

public class Giyeol10989 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[10001];
		
		for(int i = 0; i<n; i++) {
			int a = scan.nextInt();
			arr[a] ++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<10000; i++) {
			for(int j = 0; j<arr[i]; j++) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
	}
}
