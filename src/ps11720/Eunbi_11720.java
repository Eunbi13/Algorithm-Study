package ps11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eunbi_11720 {

  public static void main(String[] args) throws Exception {
    
  }
  //charAt은 아스키 코드 반환
  // String '1' == 아스키 코드 int 49 

  //runtime 124ms
  public static void one() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N, sum = 0;
    N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    for(int i = 0; i<N; i++) {
      sum += str.charAt(i)-48;
    }
    System.out.println(sum);
    br.close();
  }
  
  //runtime 128ms
  public static void two() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N, sum = 0;
    N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    for(int i = 0; i<N; i++) {
      sum += Integer.parseInt( String.valueOf(str.charAt(i)));
    }
    System.out.println(sum);
    
    br.close();
  }
  //runtime 120ms
  public static void three() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N, sum = 0;
    N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    for(int i = 0; i<N; i++) {
      //sum += Integer.parseInt( String.valueOf(str.charAt(i)));
      byte [] value = str.getBytes();
      //byte 단위 :: 값이 0에서 255까지인 부호 없는 8비트(1-바이트) 정수입니다. (1byte == 8bit)
      //아스키 코드 :: 컴퓨터가 데이터를 0과 1로 저장할 때 규칙을 뜻함 8비트 데이터 사용 (에러탐지용 패리티 비트 포함, 사용하는 건 7비트)(별로 안중요함)
      //1Byte = 8Bit 라고 알고 있는 것처럼 기본 단위는 8비트이니 7비트의 ASCII 코드를 8비트에서도 판독이 가능하도록 조정하고 이후 모든 컴퓨터에서는 1바이트 단위로(즉, 한번에 8Bit씩) 처리될 수 있도록 표준화 한 것입니다.
      //즉, 7비트 ASCII 로 작성된 글을 하나의 문자씩(7비트씩) 읽어서 그 읽은 것에 0인 Bit 하나를 추가하면 8비트 단위의 ASCII 로 변환이 가능한 것입니다.
      //출처: https://hatsalmaroo.tistory.com/entry/ASCII-Code-와-바이트-단위 [HSMR]
      //즉, 아스키 코드는 byte 타입에서 판독이 가능하고 byte 1개는 8비트 임으로 아스키 코드 1자리 이다.
      sum += value[i]-'0';// value[i] == 아스키 코드 -'0'이나 -48로 우리가 아는 문자열로 변환  
    }
    System.out.println(sum);
    
    br.close();
  }
  //runtime 124ms
  public static void four()  throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    String N = br.readLine();
    for(byte value : br.readLine().getBytes()) {
      sum += value-'0';
    }
    System.out.println(sum);
    
    br.close();
  }
}
