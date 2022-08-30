package ps1168;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Jeongwon_1168 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken())-1;
        int index=0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("i : " + i);
            index += K;
            System.out.println("index1 : " + index);
            System.out.println("list.size() : " + list.size());
            index %= list.size();
            System.out.println("index2 : " + index);
            int tmp=list.get(index);
            answer.add(tmp);
            list.remove(index);
        }
 
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < answer.size()-1; i++) {
            sb.append(answer.get(i)+", ");
        }
        sb.append(answer.get(answer.size()-1)+">");
        System.out.println(sb.toString());
    }
}

