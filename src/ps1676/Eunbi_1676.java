package ps1676;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Eunbi_1676 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(N>=5){
            cnt += N/5;
            N/=5;
        }

        System.out.println(cnt);
        
    }
    
}
