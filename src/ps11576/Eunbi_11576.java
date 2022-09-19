package ps11576;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
// import java.util.Stack;
import java.util.StringTokenizer;

public class Eunbi_11576 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception{
        //첫번째 줄
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        //두번째 줄
        int m =  Integer.parseInt(br.readLine());
        //세번째 줄
        st = new StringTokenizer(br.readLine());
        //10진법
        int decimal = 0;
        for(int i = m-1; i>=0; i--){
            decimal += (Math.pow(A, i))*Integer.parseInt(st.nextToken());
        }
       
        // 메모리 초과
        // Stack<Integer> stack = new Stack<>();
        // while(decimal != 0){
        //     stack.push(decimal % B);
        //     decimal/=B;
        // }
        // while(!stack.isEmpty()){
        //     if(stack.size() == 1){
        //         sb.append(stack.peek());
        //     }else{
        //         sb.append(stack.peek()).append(" ");
        //     }
        // }

        List<Integer> list = new ArrayList<>();//list쓰니까 통과함 차이 모르겠다 정말 
        //B진법
        // 0을 설정해야했다.
        if(decimal == 0){
            sb.append(0);
        }
        // while(decimal != 0){
        //     sb.append(decimal%B); 
        //     decimal/= B;
        //     if(decimal !=0){
        //         sb.append(" ");
        //     }
        // }
         // B진수로 변환
         while(decimal != 0){
            list.add(decimal % B);
            decimal/=B;
        }
        for (int i = list.size()-1; i >= 0; i--) {
            sb.append(list.get(i) + " ");
        }
        System.out.println(sb);
    }

}

// 예를 들어 
// 17진법을 8진법으로 바꿔야 하며 , 2자리의 수가 주어지는데 각 자리수가 2 16이라고 해보자. 
// 우선 17진법을 8진법으로 바꾸려면 17진법 ->10진법 ->8진법으로 바꿔야한다.
// 2 16이 처음에는 뭔가 했는데 알고보니 각각의 숫자가 아니라 하나의 숫자였다. 2가 1의 자리
// 16이 0의 자리 였다.
//  
// 그래서 17진법을 10진법으로 바꾸면
// 2*(17)^1 +16*(17)^0 =34+16=50
//  
// 10진법을 8진법으로 바꾸면
//  
// 50=(8*6)+2
// 6=(8*0)+6
// 출처: https://we1cometomeanings.tistory.com/144 [we1comeToMeaningS:티스토리]