package Chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 스캐너로 1월 ~ 12월까지 월을 인풋 받아서 해당 월의 일수를 출력해 주면 됩니다.
		//	출력 : 1 월은 31일 입니다.
		//	출력 : 2 월은 28일 입니다.
		//  출력 : 4 월은 30일 입니다.
		//	switch문으로 작성
		//		month 월은 day 일 입니다.
		int month ;
		int day = 30 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("해당 월의 일수를 알려드립니다.");
		month = sc.nextInt();
		
		
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("해당 월의 일수는 " + ++day + "일 입니다.");
			break;
		case 2:
			System.out.println("해당 월의 일수는 28일 입니다.");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("해당 월의 일수는 " + day + "일 입니다.");
			break;
		default :
			System.out.println("해당 월은 없습니다.");
			
		}
		
		
		
	/*	Scanner sc = new Scanner(System.in);
	 * int month ;
	 * int day = 30 ;
	 * System.out.println("해당 월의 일수를 알려드립니다.");
	 * month = sc.nextInt();
	 * 
	 * switch (month) {
	 *  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	 *  	day += 1;
	 *  	break;
	 *  case 2:
	 *  	day -= 2;
	 *  	break;
	 *  default;
	 *  //case 4: case 6: case 9: case 11: 
	 *  }
	 *  System.out.println(month + " 워릉 " + day + "일 입니다.");

	 */ 
		

		
	}

}
