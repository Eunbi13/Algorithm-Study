package ps1406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Eunbi_1406 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception{
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		for(String str : br.readLine().split("")) {
			left.push(str.charAt(0));
		}
		int row = Integer.parseInt(br.readLine());
		for(int i =0; i<row; i++) {
			String str = br.readLine();
			char c = str.charAt(0);
			switch (c) {	
			case 'L' :
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
				break;
			case 'D' :
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
				break;
			case 'B' : 
				if(!left.isEmpty()) {
					left.pop();
				}
				break;
			case 'P' : 
				left.push(str.charAt(2));
				break;
			}
		}
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			sb.append(right.pop());
		}
		System.out.println(sb);
	}
	
//	//시간 초과
//	static void one() throws Exception{
//		ArrayList<Character> arr = new ArrayList();
//		for(String str : br.readLine().split("")) {
//			arr.add(str.charAt(0));
//		}
//
//		int row = Integer.parseInt(br.readLine());
//		int col = arr.size();
//		for(int i =0; i<row; i++) {
//			String str = br.readLine();
//			char c = str.charAt(0);
//			switch (c) {	
//			case 'L' :
//				if(col>0) {
//					col--;
//				}
//				break;
//			case 'D' :
//				if(col<arr.size()) {
//					col++;
//				}
//				break;
//			case 'B' : 
//				if(col>0) {
//					arr.remove(--col);
//				}
//				break;
//			case 'P' : 
//					arr.add(col, str.charAt(2));
//					col++;
//				break;
//			}
//		}
//		for(char str : arr) {
//			sb.append(str);
//		}
//		System.out.println(sb);
//	}

}
