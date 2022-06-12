package ps2445;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Eunbi_2445 {

  public static void main(String[] args)throws Exception {
  }

  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i<=n; i++) {
      for(int j = 0; j<2*n;j++) {
        if(j<i || (2*n-i) <=j) {
          sb.append("*");
        }else {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }

    for(int i = n-1; i>0; i--) {
      for(int j = 0; j<2*n;j++) {
        if(j<i || (2*n-i) <=j) {
          sb.append("*");
        }else {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }


    System.out.println(sb);
  }

  public static void two() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine())*2;

    for(int i=0; i<n; i++) {
      sb.append(" ");
    }
    for(int i=0; i<n/2; i++) {
      sb.setCharAt(i, '*');
      sb.setCharAt(n-1-i, '*');
      bw.write(sb.toString());
      bw.newLine();
    }

    for(int i=n/2 -1; i>0; i--) {
      sb.setCharAt(i, ' ');
      sb.setCharAt(n-1-i, ' ');
      bw.write(sb.toString());
      bw.newLine();
    }

    bw.flush();
  }

  public static void three() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine())*2;
    int k = 1;
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        if(j<k || (n-j)<=k) {
          sb.append("*");
        }else {
          sb.append(" ");
        }
      }
      if(i<n/2-1) {
        k++;
      }else {
        k--;
      }
      sb.append("\n");
    }
    
    System.out.println(sb);
  }
  
}

