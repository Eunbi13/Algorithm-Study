package ps10430;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eunbi_10430 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args)  throws Exception{
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int one = (a+b)%c;
		int two = (a*b)%c;
		sb.append(one).append("\n");
		sb.append(one%c).append("\n");
		sb.append(two).append("\n");
		sb.append(two%c).append("\n");
		System.out.println(sb);
		

	}

}
