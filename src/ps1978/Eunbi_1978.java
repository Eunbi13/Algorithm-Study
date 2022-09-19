package ps1978;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Eunbi_1978 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        for(int i =0; i<N; i++){
            if(isPrime(Integer.parseInt(st.nextToken()))){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    //prime = 소수,, ㅎ
    static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i = 2; i*i<=num; i++){ //Math.sqrt(Number)
            if(num%i==0){
                return false;
            }
            
        }
        return true;
    }//https://st-lab.tistory.com/80

    // 1번 왜 틀린지 모르겠다,,
    // public static void main(String[] args) throws Exception{
    //     int N = Integer.parseInt(br.readLine());
    //     StringTokenizer st = new StringTokenizer(br.readLine());

    //     int cnt = 0;
    //     for(int i =0; i<N; i++){
    //         if(isPrime(Integer.parseInt(st.nextToken()))){
    //             cnt++;
    //         }
    //     }

    //     System.out.println(cnt);
    // }

    // //prime = 소수,, ㅎ
    // static boolean isPrime(int num){
    //     if(num == 1){
    //         return false;
    //     }
    //     for(int i = 2; i<num/2; i++){
    //         if(num%i==0){
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }

}
