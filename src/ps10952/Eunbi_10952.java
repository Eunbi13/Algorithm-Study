package ps10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Eunbi_10952 {
  public static void main(String[] args) throws Exception{
    
  }
  
  //runtime 128ms 
  //전에 꺼 생각하면서 비교연산자 썼는데 == != 는 주소값 비교 연산자 이므로 문자열 비교에는 적합하지 않다
 
  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer list = new StringBuffer();
    StringTokenizer st;
    String str = "";
    while(!(str = br.readLine()).equals("0 0")) {
      st = new StringTokenizer(str, " ");
      list.append( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) );
      list.append("\n");
    }
    
    System.out.println(list);
    br.close();
  }
  
  //bufferedWriter, runtime 144ms
  //문자열 클래스이기 때문에 int는 출력 될 때 아스키 코드가 출력된다. 
  //write(): 출력할 내용 담음
  //flush(): 버퍼 클린, 콘솔 출력
  public static void two() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st ;
    while(true) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if(a == 0 && b == 0) {
        break;
      }else {
        bw.write((a+b)+"\n");
      }
    }
      bw.flush();
      bw.close();
      br.close();

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    StringTokenizer st ;
//    String str = "";
//    while(!(str = br.readLine()).equals("0 0")) {
//      st = new StringTokenizer(str, " ");
//      bw.write( (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n" );
//    }
//    bw.flush();
//    bw.close();
//    br.close();
  }
  
  
  //stringBuilder: 동기화 미보장
  //stringBuffer: 동기화 보장
  //속도 면에서 Builder 가 조금 더 우수하나 동기화여부 생각해서 사용
  
  //runtime 124ms
  public static void four() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer list = new StringBuffer();
    StringTokenizer st;
    
    while(true) {
      st = new StringTokenizer(br.readLine()," ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      
      if(a==0 && b==0) {
          break;
      }
      list.append((a+b)).append('\n');
    }
    System.out.println(list);
  }
  
//  ReferenceType 자료형 보다 기본형 자료형을 선호하는 이유
//  산술 연산이 가능하다
//  매개변수로 객체가 요구되지 않을때
//  기본값을 주어져서 저장할때
//  객체간의 비교가 없을때
//  성능상의 이점이 있을때
//  접근 속도
  //기본 자료형은 스택 메모리에 값이 존재하고 래퍼 클래스는 스택 메모리에 참조 값이 있다. 
  //실제 값은 heap 에 존재하게 된다. 
  //값을 필요할 때마다 unboxing 과정을 거쳐야 하기 때문에 Primitive Type과 비교할때 접근 속도가 느려지게 된다.
}
