package Chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제 EX01> 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수이면 "홀수" 라고 출력하고
		//		인풋받은 값이 짝수이면 "짝수" 라고 출력
		
		int value1;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("정수값을 넣어 주세요.>>>");
		value1 = sc.nextInt();
		
		System.out.println((value1%2 < 1) ? "짝수" : "홀수"); 		
		

	}

}
