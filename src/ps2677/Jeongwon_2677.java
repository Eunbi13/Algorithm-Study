package ps2677;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jeongwon_2677 {
    //https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-2667%EB%B2%88-%EB%8B%A8%EC%A7%80%EB%B2%88%ED%98%B8%EB%B6%99%EC%9D%B4%EA%B8%B0-%EC%9E%90%EB%B0%94Java
    static int N;
    static int [][] Map;
    static int count;
    static int [] dr = {-1,1,0,0};
    static int [] dc = {0,0,-1,1};

    static ArrayList<Integer> result;

    static boolean [][] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        Map = new int[N][N];

        check = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String input = sc.next();
            for(int j=0; j < N; j++) {
                Map[i][j] = input.charAt(j)-'0';
            }
        }

        count = 0;

        result = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(Map[i][j] == 1 && !check[i][j]) {
                    count = 1;
                    Search(i,j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int c : result) System.out.println(c);
    }

    public static int Search(int x, int y) {
        check[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if(Map[nx][ny] == 1 && !check[nx][ny]) {
                    Search(nx, ny);
                    count++;
                }
            }
        }

        return count;
    }
}
