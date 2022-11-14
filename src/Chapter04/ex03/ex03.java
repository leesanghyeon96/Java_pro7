package Chapter04.ex03;

public class ex03 {

	public static void main(String[] args) {
		// <문제> : 2중 for 문을 사용해서 1단 ~ 9단 출력 print \t
		//	1단
		//	1 * 1 = 1	1 * 2 = 2	...
		//	2단
		// 	2 * 1 = 2	2 * 2 = 4	...
		//	9단까지 출력
		
		// print ()	\t : 탭으로 구분
		System.out.println("=====print()====================");
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println(i + " 단");
			for (int j = 1 ; j < 10 ; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t" ) ;
			}
			System.out.println();	//이것과 아래 둘 다 엔터
			System.out.print("\n");
		}
		
		//printf() 를 사용해서 출력 부분을 간결하게 처리
		System.out.println("=====printf()====================");
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println(i + " 단");
			for (int j = 1 ; j < 10 ; j++) {
				System.out.printf("%d * %d = %d \t" , i , j , i*j) ;
			}
			System.out.println();	//이것과 아래 둘 다 엔터
			System.out.print("\n");
		}
		
		
		
		
		
		
		
	}

}
