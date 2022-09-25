package ps2004;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Eunbi_2004 {    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws Exception{
        // 3==n 2==m ₃c₂= 3!/(3-2)!2!
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long five = five_squared(n)-five_squared(n-m)-five_squared(m);
        long two = two_squared(n)-two_squared(n-m)-two_squared(m);

        System.out.println(Math.min(five, two));


    }//https://st-lab.tistory.com/166

    static long five_squared(long n){
        long cnt =0;
        while(n>=5){
            cnt += n/5;
            n/=5;
        }
        return cnt;
    }

    static long two_squared(long n){
        long cnt =0;
        while(n>=2){
            cnt += n/2;
            n/=2;
        }
        return cnt;
    }
}
