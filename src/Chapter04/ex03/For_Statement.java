package Chapter04.ex03;

public class For_Statement {

	public static void main(String[] args) {
		// For 문 : 조건이 true 동안 실행블락을 반복해서 처리, 조건이 false이면 for문을 빠져나온다.
		/*
			for (초기값;조건:증감식) {
				실행블락 ;					//조건이 true일동안 반복, 조건이 false 이면 빠져나온다.
			}
		 */
		
		// 1. For 문의 기본 구조 ( println )
		int a;									//변수를 블락 밖에서 선언(전역변수)
		for (a=0; a < 3 ; a ++) {
			System.out.println(a);
		}				//0, 1, 2
		//초기값 -> 조건 -> 실행(true이면) -> 증감식실행 -> 조건대입 -> 실행(true)
		// -> 증감식실행 -> 조건대입 -> 조건이 false이면 빠져나옴
		System.out.println("=======================");
		
		
		for  (int b = 0 ; b < 100; b+=2) {		//변수 b : 지역변수 : for 블락내에서만 사용됨
			System.out.print( b + " "); 
		}
		System.out.println("========================");
		
		//int a;		전역변수이므로 위에서 선언했으므로 다시 선언 불가
		for (  a = 0; a < 20 ; a += 3 ) {
			System.out.print( a + " ");
		}
		System.out.println();
		System.out.println("=========================");
		for (int b = 0 ; b < 20; b += 4) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("=========================");
		// 초기값 100 부터 1 빼면서 조건 i > 0
		for (int i = 100 ; i > 0 ; i--) {
			System.out.print( i + " ");
		}
		System.out.println();
		System.out.println("=========================");
		
		for (int i = 1000 ; i > 0 ; i -= 3 ) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=========================");
		
		// 여러개의 변수를 초기식 및 증감식에서 처리 가능
		// 초기값, 증감식과는 다르게 조건은 하나만 와야한다.
		for ( int i = 0 , j = 0 ; i < 100 ; i++, j++) {
			System.out.println(i + ", " + j );
		}
		
		System.out.println();
		System.out.println("=========================");
		
		//<문제> : i * j = 1단 출력
		//		1 * 1 = 1
		//		1 * 9 = 9 까지 출력
		

	}
}
