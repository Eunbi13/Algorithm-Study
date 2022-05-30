package ps2742;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Hyojeong_2742 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(n-i);
		}
		sc.close();
	}
	
	

/////찾아본 코드
	public static void test2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>=1; i--) {
			sb.append(i).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
