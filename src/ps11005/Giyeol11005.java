package ps11005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giyeol11005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int B = scan.nextInt();
		List<Character> list = new ArrayList<Character>();
		
		
		while(N>0) {
		
			int rest = N % B;
			N = N / B;
			if(rest<10) {
				list.add((char)(rest + 48));
			} else {
				list.add((char)(rest + 55));
			}
		}
		for(int i = list.size()-1; i>=0; i--) {
			System.out.print(list.get(i));
		}
		
	}
}
