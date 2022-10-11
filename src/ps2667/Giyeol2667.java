package ps2667;

import java.util.ArrayList;
import java.util.Scanner;

public class Giyeol2667 {
	static int N, cnt=0;
	static int visited[][], mat[][];
	
	public static void main(String [] args) {
		String str;
		ArrayList<Integer> answer= new ArrayList<>(); //정답을 담을 리스트
		
		Scanner scan= new Scanner(System.in);
		
		N= scan.nextInt();
		visited= new int[N][N];
		mat= new int[N][N];
		
		for(int i=0; i<N; i++) {  //문자열로 입력받고 char 하나씩 배열로
			str= scan.next();
			for(int j=0; j<N; j++) {
				mat[i][j]= Integer.parseInt(str.charAt(j)+"");
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j]==1&&visited[i][j]!=1) { //matrix 값이 1인데, 방문한적 없으면
					cnt=0;
					dfs(i, j);
					answer.add(cnt);
				}
			}
		}//end
		
		System.out.println(answer.size());
		answer.sort(null);
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
	
	static int[] dx= {-1, 1, 0, 0}; //x값에 대한 증감
	static int[] dy= {0, 0, -1, 1}; //y값에 대한 증감
	public static void dfs(int x, int y) {
		int nowx, nowy;
		visited[x][y]=1;
		cnt++;
		
		for(int i=0; i<4; i++) { //상하좌우의 값들을 확인하기 위해
			nowx= x+dx[i];
			nowy= y+dy[i];
			if(nowx>=0&&nowx<N&&nowy>=0&&nowy<N) { //0<=nowx<N && 0<=nowy<N
				if(mat[nowx][nowy]==1&&visited[nowx][nowy]!=1) {
					dfs(nowx, nowy);
				}
			}
		}
	}//dfs
	// https://arinnh.tistory.com/12
	
}
