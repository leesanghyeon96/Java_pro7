package BackJoon.Loop_For_While__;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		for(b = 1; b < 10 ; b += 1) {
			System.out.println(a + " * " + b + " = " + a*b);
		}
		
	}

}
