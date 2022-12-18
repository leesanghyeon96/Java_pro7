package BackJoon.ConditionalStatement;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		if (a>b) {System.out.println(">");}
		if (a<b) {System.out.println("<");}
		if (a==b) {System.out.println("==");}
		
	}

}
