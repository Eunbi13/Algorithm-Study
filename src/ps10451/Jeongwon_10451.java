package ps10451;

import java.util.Scanner;

public class Jeongwon_10451 {
    static int[] arr;
    static boolean[] v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int cnt = 0;
            arr = new int[a+1];
            v = new boolean[a+1];

            for(int j = 1; j <= a; j++){
                arr[j] = sc.nextInt();    
            }
            for(int j = 1; j <= a; j++){
                if(!v[j]){
                    cnt += dfs(j);
                }
            }
            System.out.println(cnt);
        }
    }

    public static int dfs(int i) {
        // i == arr[i] 자기자신 순환 사이클
        // v[i] 순환 사이클이 다 돌고난 뒤 맨 처음 정점
        if(i == arr[i] || v[i]) {
            return 1;
        }
        v[i] = true;
        return dfs(arr[i]);
    }
}
