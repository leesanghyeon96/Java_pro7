package Chapter04.ex02;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// <문제> switch 문을 사용하여 프로그램 하세요.
		// 		스캐너로 정수 1을 인풋받으면 "금메달입니다."를 출력
		//		스캐너로 정수 2을 인풋받으면 "은메달입니다."를 출력
		//		스캐너로 정수 3을 인풋받으면 "동메달입니다."를 출력
		//		그 외를 인풋받으면 "메달이 없습니다."를 출력
		
		int medal;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("숫자를 넣어 메달을 확인하세요.");
		medal = sc.nextInt();
		
		switch (medal) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		
		}
		
		
		System.out.println("===========================");
		
		//<문제> Switch 문을 사용하여 프로그램 하세요.
		// 		스캐너로 문자열 gold 를 인풋받으면 "금메달입니다."를 출력
		//		스캐너로 문자열 silver 를 인풋받으면 "은메달입니다."를 출력
		//		스캐너로 문자열 bronze 를 인풋받으면 "동메달입니다."를 출력
		//		그 외를 인풋받으면 "메달이 없습니다."를 출력
		
		String medal2;
		
		System.out.println("gold, silver, bronze를 넣어 메달을 확인하세요.");
		medal2 = sc.next();
		
		
		switch (medal2) {
		case "gold" : case "Gold": case "GOLD" :
			System.out.println("금메달입니다.");
			break;
		case "silver" :
			System.out.println("은메달입니다.");
			break;
		case "bronze" :
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;  //마지막은 안넣어도 상관없다.
			
		}
		
		
		sc.close();		//끝나면 스캐너를 닫아준다.
	}

}
