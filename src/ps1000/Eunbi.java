package ps1000;

import java.util.Scanner;

public class Eunbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc = new Scanner(System.in);
	  String nums = sc.nextLine();
	  String [] numArray = nums.split(" ");
	  int a = Integer.parseInt(numArray[0]);
	  int b = Integer.parseInt(numArray[1]);
	  if(a>0 && b<10) {
	    System.out.println(a+b);
	  }
	}

}
