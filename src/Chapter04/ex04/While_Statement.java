package Chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		// While 문 : 반복문 , 조건이 true 동알 반복, 조건이 false 이면 실행블락을 빠져나온다.
		// for 문과 while문은 서로 바꿀 수 있다.
		/*
		   for (초기식; 조건; 증감식) {
		   		실행블락;
		   	}
		 */
		
		/*
			초기값
			while (조건) {
				실행블락;
				증감식;
			}
			
			
		 */
		//1. While 문의 기본 문법 구조 (증감식을 처리하지 않으면 무한루프에 걸림)
		System.out.println("======while 문으로 출력======");
		int a = 0;
		while (a < 10 ) {
			System.out.print(a + " ");
			a++;
		}
		
		//2. for 문으로 변환
		System.out.println("=======for 문으로 출력======");
		for (a = 0 ; a<10;a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("=====================");
		
		//while 문	vs for 문으로 처리	; 100 부터 1까지 2씩 감소해서 출력
		int b = 100;
		while (b>0) {
			System.out.print(b + " ");
			b-=2;
		}
		System.out.println();
		
		System.out.println("=====for문으로 출력======");
		for (b = 100; b>0 ; b-=2) {
			System.out.print(b + " ");

		}
		System.out.println();
		System.out.println("=======while 에서 무한 루트=========");
		
		boolean ab =true;
		int d = 0;				//기본 자료형은 반드시 초기값이 설정되어 있어야 한다.
		while ( ab ) {
			System.out.println("무한루프" + d);
		
			if ( d > 100 ) {
				break;			//break는 if문과 자주씀
			}
			d++;
		System.out.println(" while 문 빠져나옴");
		
		
		
		
		}
		
	}

}
