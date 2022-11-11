package Chapter03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제 EX02> 스캐너로 3, 6, 9 의 배수이면 "3, 6, 9의 배수입니다" 그렇지 
		//않으면 "3, 6, 9의 배수가 아닙니다를 출력
		
		int value1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 넣어 주세요.>>>");
		value1 = sc.nextInt();
		
		System.out.println(value1%3==0 ? "369배수입니다" : " 369배수가 아닙니다");
		
		

	}

}
