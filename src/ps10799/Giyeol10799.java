package new_ex.week12;

import java.util.Scanner;
import java.util.Stack;

public class Giyeol10799 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack<>();
		
		String vps = scan.next();
		int sum = 0;
		
		for(int i = 0; i<vps.length(); i++) {
			char g = vps.charAt(i);
			
			if(g == '(') {
				stack.push("(");
			} else {
				if(vps.charAt(i-1) == '(') {
					stack.pop();
					sum += stack.size();
				} else {
					stack.pop();
					sum +=1;
				}
			}
			
			
		}
		System.out.println(sum);
	}
}
