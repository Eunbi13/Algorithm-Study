package ps11718;

import java.util.ArrayList;
import java.util.Scanner;

public class Jeongwon_11718 {

	// 무한 반복
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int a = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		while (a < 100 && scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
//	}

	// 232ms
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<>();

		while (a < 100 && scanner.hasNextLine()) {
			String input = scanner.nextLine();
			if (input == null || input.isEmpty()) {
				break;
			}
			inputs.add(input);
			a++;
		}
		scanner.close();

		for (int i = 0; i < inputs.size(); i++) {
			System.out.println(inputs.get(i));
		}
	}

}
