package ps2089;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_2089 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());

        //0에 대해서도 생각해야함
        if(N ==0){
            sb.append(0);
        }
        while(N !=0){
            int r = N % -2;
            N /=-2;
            if(r == -1){
                r = 1;
                N++;
            }
            sb.append(r);
        }
        System.out.println(sb.reverse().toString());
    }
}

// while (n!=1){
//     //기존 2진수 구하는 방법
// //                sb.append(n%2);
// //                n /= 2;
//     //-2진수 구하는 방법
//     sb.append(Math.abs(n%-2));
//     n = (int)Math.ceil((double)n/(-2));
// }
