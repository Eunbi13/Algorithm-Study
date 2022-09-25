package ps10872;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Eunbi_10872 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 2; i<=N; i++){
            result *=i;
        }

        // result = factorial(N);
        System.out.println(result);
    }

    static int factorial(int N){
        if(N==0){
            return 1;
        }
        return N*factorial(N-1);
    }
}
