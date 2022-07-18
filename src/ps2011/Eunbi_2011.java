package ps2011;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_2011 {

    static Long dp[][];
 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());

        dp = new Long [2][sb.length()];
        dp[0][0]=1L;
       for(int i = 0; i<2; i++){
        for(int j=i+1; j<=sb.length(); j++){
            
            if( Integer.parseInt(sb.substring(j, j+2)) <= 26){
                dp[i][j] = dp[i][j-1]+1;
            }else{
                dp[i][j] = dp[i][j-1];
            }
        }
       }

       System.out.println(dp[2][sb.length()]);


    }
}
