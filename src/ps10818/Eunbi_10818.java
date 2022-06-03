package ps10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Eunbi_10818 {

  public static void main(String[] args) throws Exception{

  }
  // Integer.MIN_VALUE;
  public static void one()throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer(br.readLine());
    StringTokenizer st = new StringTokenizer(sb.toString());
    int [] array = new int [n];
    for(int i =0; i<n; i++) {
      array[i] = Integer.parseInt(st.nextToken());
    }
    int min = array[0],max = array[0];
    for(int j = 1; j<n; j++) {
      if(array[j]>max) {
        max = array[j];
      }
      if(array[j]<min) {
        min = array[j];
      }

    }

    sb.delete(0,sb.length());
    sb.append(min).append(" ").append(max);
    System.out.println(sb);    
  }
  
  public static void two() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer(br.readLine());
    StringTokenizer st = new StringTokenizer(sb.toString());
    
long a = System.nanoTime();
    int min =  Integer.parseInt(st.nextToken());
    int max = min;
    for(int j = 1; j<n; j++) {
      int temp = Integer.parseInt(st.nextToken());
      if(temp>max) {
        max = temp;
      }
      if(temp<min) {
        min = temp;
      }

    }
    sb.delete(0,sb.length());
    sb.append(min).append(" ").append(max);
    System.out.println(sb);    
long b = System.nanoTime();
System.out.println(b-a);    
  }

}
