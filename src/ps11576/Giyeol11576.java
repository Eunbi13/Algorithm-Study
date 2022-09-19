package ps11576;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giyeol11576 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int asu = scan.nextInt();
		int dec = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<asu; i++) {
			
			int agap = scan.nextInt();
			dec += agap * Math.pow(a, asu -i -1);
		}
		
		while(dec>0) {
			
			int rest = dec % b;
			dec = dec / b;
			list.add(rest);
		}
		
		for(int i = list.size()-1; i>=0; i--) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
	}
}
