package S_11_14;

import java.util.Scanner;

public class S_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.println("==========================");
			System.out.println("1. 평균출력 | 2. 합계출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("==============================");
			System.out.println(" 위 번호를 선택하세요 >>>");
			a = sc.nextInt();
			
			switch (a) {
			case 1:
				System.out.println("1. 평균 출력");
				break;
			case 2:
				System.out.println("2. 합계 출력");
				break;
			case 3:
				System.out.println("3. 이름 출력");
				break;
			case 4:
				System.out.println("4. 프로그램 종료");
				break;
			default:
				System.out.println("잘못된 번호입니다. 1~4번을 입력해 주세요.");
			}
			
		}while (true);
		
		//-> 프로그램 종료가 안되고 계속 이어지는게 궁금하다.
		
		
		
		
		
		
	}

}
