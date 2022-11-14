package Chapter04.ex06;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// 스캐너로 인풋 받은 값을 선택시 해당 내용을 이중 for문을 사용해서 출력하세요.
		// 4. 프로그램 종료시까지 무한 루프를  돌려서 작동시키세요.
		// 1~4번 외의 내용을 선택시 " 잘못된 입력입니다. 1~4까지만 넣어주세요"
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		
	
		
		do {
			
			System.out.println("==============================================================");
			System.out.println("1. 구구단출력 | 2. 19단출력 | 3. 19단중 7의 배수단만 출력 | 4. 프로그램 종료");
			System.out.println("===============================================================");
			System.out.println(" 위 번호를 선택하세요 >>>");
			a = sc.nextInt();
			
			
			
			
			
			
			if (a==1) {
		//		System.out.println("1. 구구단 출력");
				for (int q = 1; q<10 ; q++) {
					System.out.println( q + "단");
					for (int j = 1 ; j <10 ; j++) {
						System.out.println(q + " * " + j + " = " + q * j); //(printf써도 됨)
					}
		//			Ststem.out.println();
				}
						
			}else if (a == 2 ) {
		//		System.out.println("2. 19단 출력");
				for  (int t = 1; t <20; t++) {
					System.out.println(t + "단");
					for (int p = 1; p <20 ; p++) {
						System.out.println(t + " * " + p + " = " + t * p);
					}
		//			Ststem.out.println();
				}
			}else if (a == 3) {
		//			System.out.println("2. 19단 중 7의 배수단 출력");
					for (int z =7 ; z<20 ; z+=7) {
						System.out.println(z + "단");
						for (int k = 1; k<20 ; k++) {
							System.out.println(z + " * " + k + " = " + k * z);
						}
		//		Ststem.out.println();
					}
			}else if (a == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 1~4까지만 넣어주세요");
			}
				
				
		}while (true);
	//	System.out.println("프로그램을 종료합니다. (do while문 종료");
			
		sc.close();
			
			
		
		
		
		
		
		
	/*	else if (a == 3)
			System.out.println("2. 19단 중 7배수단 출력");
		for (int i = 1 ; i< 20 ; i++){
			if ( i % 7 ==0 ) {
				System.out.println(i + " 단 출력");
			}
			for (int j = 1 ; j < 20; j++) {
				if ( i % 7 == 0 ) {
					System.out.printf("%d * %d = %d \t" , i, j, i*j);
				}
			}
			if ( i % 7 == 0) {
				System.out.println();
			}
	*/	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


