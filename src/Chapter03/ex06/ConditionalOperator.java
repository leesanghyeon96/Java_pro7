package Chapter03.ex06;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자		: if ~ else 구문을 축약해서 사용할때 자주 사용하는 구문
			// (조건) ? 참:거짓		(조건)이 참일때 ? 뒤의 <<참>>을 실행, (조건)이 거짓일때 ? <<거짓>>을 실행
		
		int value1 = ( 3 > 5 ) ? 6 : 9;	// (조건) 이 false 이므로 9가 value1에 들어감
		//(3>5)가 거짓이기때문에 9가 실행된다. 참이면 6이 실행된다.
		
		System.out.println(value1);		//9
		
		int value2 = ( 3 < 5 ) ? 6 : 9;		//조건이 true 이므로 6이 value2에 들어감
		System.out.println(value2);		//6

		
		// <문제> 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수이면 "홀수" 라고 출력하고
		//		인풋받은 값이 짝수이면 "짝수" 라고 출력
		
		/*	int a ;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("넣은 숫자가 홀수인지 짝수인지 확인하세요");
			a = sc.nextInt();
			
			System.out.println(a%2 == 0 ? "짝수" : "홀수");
		*/
	}

}
