package ps11653;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Eunbi_11653 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        int i=2;
        while(N!=1){
            if(N%i == 0){
                sb.append(i).append("\n");
                N /=i;
            }else{
                i++;
            }
        }
        System.out.println(sb);
    }
}
