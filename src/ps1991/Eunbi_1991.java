package ps1991;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_1991 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuffer sb = new StringBuffer();


  
  
  public static void main(String[] args) throws Exception{
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    
    Tree tree = new Tree();
    for(int i = 0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      char data = st.nextToken().charAt(0);
      char left = st.nextToken().charAt(0);
      char right = st.nextToken().charAt(0);
      tree.Add(data, left, right);
    }
    
    tree.PreOrder(tree.Root);
    System.out.println(sb);
    sb.setLength(0);//버퍼 초기화
    tree.InOrder(tree.Root);
    System.out.println(sb);
    sb.setLength(0);//버퍼 초기화
    tree.PostOrder(tree.Root);
    System.out.println(sb);
  }
  //https://velog.io/@gandi0330/Java-%EB%B0%B1%EC%A4%80-%ED%8A%B8%EB%A6%AC-%EC%88%9C%ED%9A%8C-1991%EB%B2%88
//  위 링크로 하면 맞는데 
//아래 링크로 하니까 틀렸음  ,, 일단 쓴건 아래 꺼긴 한데 차이를 잘,, 
  static class Node{ //https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-1991%EB%B2%88-%ED%8A%B8%EB%A6%AC%EC%88%9C%ED%9A%8C-%EC%9E%90%EB%B0%94Java
    char Data;
    Node Left;
    Node Right;
    public Node(char Data) {
      this.Data = Data;
    }
  }
  
  static class Tree{
    Node Root;
    
    public void Add(char Data, char Left_Data, char Right_data) {
      if(Root==null) {
        if(Data !='.') Root = new Node(Data);
        if(Left_Data !='.') Root.Left = new Node(Left_Data);
        if(Right_data !='.') Root.Right = new Node(Right_data);
      }
      else {
        Search(Root, Data, Left_Data, Right_data);
      }
    }
    
    public void Search(Node Root, char Data, char Left_Data, char Right_data) {
      if(Root == null)  return;
      else if(Root.Data == Data) {
        if(Left_Data !='.') Root.Left = new Node(Left_Data);
        if(Right_data !='.') Root.Right = new Node(Right_data);
      }
      else {
        Search(Root.Left, Data, Left_Data, Right_data);
        Search(Root.Right, Data, Left_Data, Right_data);
      }
    }
    
    static void PreOrder(Node Root) {//전위순환
      sb.append(Root.Data);
      if(Root.Left != null) PreOrder(Root.Left);
      if(Root.Right != null) PreOrder(Root.Right);
    }
    
    static void InOrder(Node Root) {//중위순환
      if(Root.Left != null) PreOrder(Root.Left);
      sb.append(Root.Data);
      if(Root.Right != null) PreOrder(Root.Right);
    }

    static void PostOrder(Node Root) {//후위순환
      if(Root.Left != null) PreOrder(Root.Left);
      if(Root.Right != null) PreOrder(Root.Right);
      sb.append(Root.Data);      
    }
  }

}
