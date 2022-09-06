package ps9613;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_9613 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();

  public static void main(String[] args) throws Exception{
    int t = Integer.parseInt(br.readLine());
    StringTokenizer st;
    long [] arr ;
    for(int i =0; i<t;i++) {
      st = new StringTokenizer(br.readLine());
      arr = new long [Integer.parseInt(st.nextToken())];//맨 앞자리가 몇개 받는지 묻는 거였음,,
      
      for(int z = 0; z<arr.length; z++) {
        arr[z]=Long.parseLong(st.nextToken());
      }
      
      long sum = 0;
      for(int j = 0;j<arr.length-1;j++) {
//        for(int k = 1; k<arr.size(); k++) {
        for(int k = j+1; k<arr.length; k++) {
//          System.out.println("\n"+j+" (J) "+arr[j]+" "+k+" (K) "+arr[k]);
//          System.out.println("gcd: "+gcd(arr[j], arr[k]));
          sum += gcd(arr[j], arr[k]);
        }
      }
      sb.append(sum).append("\n");
    }
 
    System.out.println(sb); 
    
  }
  
  static long gcd(long a, long b) {
    if(b==0) {
      return a;
    }
    return gcd(b,a%b);
  }
}
