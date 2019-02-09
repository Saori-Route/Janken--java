package hallo.java;
import java.util.Scanner;

public class Java2 {
	public static void main(String[]args) {
		java.util.Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 1 && b == 2 )
			System.out.println("xの勝ち");
		else if(a == 1 && b== 3 )
			System.out.println("yの勝ち");
		else if(a == 1 && b == 1)
			System.out.println("xとyはあいこ");
		else if(a == 2 && b == 1)
			System.out.println("yの勝ち");
		else if(a == 2 && b == 3)
			System.out.println("xの勝ち");
		else if(a == 2 && b == 2)
			System.out.println("xとyはあいこ");
		else if(a == 3 && b == 1)
			System.out.println("xの勝ち");
		else if(a == 3 && b == 2)
			System.out.println("yの勝ち");
		else if(a == 3 && b == 3)
			System.out.println("xとyはあいこ");
		else
			System.out.println("じゃんけんしましょう");

		

	}
}
