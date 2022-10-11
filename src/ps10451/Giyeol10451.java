package ps10451;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giyeol10451 {

	static int t, n;
	static int[] arr; //배열
	static boolean[] checked; //방문 여부
	static int cnt; //사이클 갯수
	
	//백준 10451번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		t=sc.nextInt(); //테스트 케이스 숫자 받기
		//t--; t > 0; 
		while(t-->0) {
			n=sc.nextInt(); //순열 갯수 받을 것
			cnt=0;
			
			//배열들 크기 지정
			arr = new int[n+1];
			checked=new boolean[n+1];
			
			//그래프에 입력받음
			for(int i=1; i<=n; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=1; i<=n; i++) {
				if(checked[i]==false) {
					dfs(i);
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	
	static void dfs(int index) {
		checked[index] = true;
		
		if(checked[arr[index]]==false) {
			dfs(arr[index]);
		}else return;
	}
	
	
}