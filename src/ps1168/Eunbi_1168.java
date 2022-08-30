package ps1168;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Eunbi_1168 {

	/*
	 * 시간 초과 해결 못함 
	 */
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb = new StringBuffer();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception{
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()) -1 ;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =1; i<=n; i++) {
			list.add(i);
		}
		int temp = 0;
		for(int i =0; i<n; i++) {
			temp += k;
			if(temp >= list.size()) {
				temp %= list.size();
			}
			sb.append(list.remove(temp));
			if(list.size()==0) {
				break;
			}
			sb.append(", ");
		}
		bw.write("<"+ sb+">");
		bw.flush();
		bw.close();
		br.close();
	}

}
