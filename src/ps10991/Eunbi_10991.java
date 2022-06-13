package ps10991;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_10991 {
  

  public static void main(String[] args)throws Exception {

  }

  public static void one() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    int k = 0;
    int t = n;
    for(int i =n; i>0; i--) {
      k=i;
      for(int j = 1; j<n*2; j++) {
        if(k==j && k <=t) {
          sb.append("*");          
          k+=2;
        }else if(j<=t){
          sb.append(" ");
        }
      }
      t++;
      sb.append("\n");
    }
    System.out.println(sb);
  }
  
  public static void two() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    for(int i =0; i<n; i++) {
      sb.append(" ".repeat(n-i-1)).append("* ".repeat(i+1)).append("\n");
    }
    System.out.println(sb);
  }
  
  public static void three() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    for(int i =1; i<n+1; i++) {
      for(int j = 0; j<n-i; j++) {
        sb.append(" ");
      }
      for(int j =1; j<=i*2-1; j++) {
        if(j%2==0) {
          sb.append(" ");
        }else {
          sb.append("*");
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
