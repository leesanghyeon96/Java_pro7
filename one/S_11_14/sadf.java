package S_11_14;

import java.util.Scanner;

public class sadf {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		
		// 스캐너로 인풋 받은 값을 선택시 해당 내용을 이중 for문을 사용해서 출력하세요.
		// 4. 프로그램 종료시까지 무한 루프를  돌려서 작동시키세요.
		// 1~4번 외의 내용을 선택시 " 잘못된 입력입니다. 1~4까지만 넣어주세요"
		int a;
		
		
		
		do {
			
			System.out.println("==============================================================");
			System.out.println("1. 구구단출력 | 2. 19단출력 | 3. 19단중 7의 배수단만 출력 | 4. 프로그램 종료");
			System.out.println("===============================================================");
			System.out.println(" 위 번호를 선택하세요 >>>");
			a = sc.nextInt();
			
			if (a ==1) {
				System.out.println("1. 구구단 출력");
				for (int b = 1 ; b <10 ; b++) {
					System.out.println(b + " 단");
					for(int c = 1 ; c <10 ; c++) {
						System.out.println(b + " * " + c + " = " + b * c);
					}
					System.out.println();
				}
				
			}else if (a == 2) {
				System.out.println("2. 19단 출력");
				for (int d = 1 ; d < 20 ; d++) {
					System.out.println(d + " 단");
					for (int e = 1 ; e <20 ; e++) {
						System.out.printf("%d * %d = %d ", d, e, d*e);
					}
					System.out.println();
				}
			}else if ( a == 3) {
				System.out.println("3. 19단중 7의 배수단만 출력");
				for (int f = 7 ; f<20 ; f+=7) {
					System.out.println(f + " 단");
					for (int g = 1 ; g <20 ; g++) {
						System.out.printf("%d * %d = %d \t", f , g, f*g);
					}
					System.out.println();
				}
			}else if ( a== 4 ) {
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 1~4까지만 넣어주세요");
			}
			
		}while (true);
		System.out.println("프로그램을 종료합니다. (do while문 종료)");
		
		
		
		
	}
}

