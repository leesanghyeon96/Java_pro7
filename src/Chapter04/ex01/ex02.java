package Chapter04.ex01;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// <<스캐너에서 번호를 입력 받아서 아래 내용을 작동시키는 프로그램을 작성 해 주세요.>>
		// IF 문을 사용
		int select;		//프로그램을 선택
		
		int kor;
		int eng;
		int math;
		
		int a;
		
		String aName;
		String bName;
		
		
		System.out.println("===========================================");
		System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름식별");
		System.out.println("===========================================");
		System.out.println("위의 번호를 선택하세요.>>>");
		
		
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		
		
		
		if (select == 1) {
			System.out.println("국어점수를 입력해 주세요.>>>");
			kor = sc.nextInt();
			System.out.println("영어점수를 입력해 주세요.>>>");
			eng = sc.nextInt();
			System.out.println("수학점수를 입력해 주세요.>>>");
			math = sc.nextInt();
			
			int sum;
				sum = kor + eng + math;
			double avg;
				avg = sum/3.0;
			System.out.println("학점의 합계는 " + sum + "이며 학점의 평균은 "+ avg + "입니다.");
		}else if (select == 2) {
			System.out.println("숫자를 넣어주세요");
			a = sc.nextInt();
			System.out.println( a % 2 < 1  ? "짝수" : "홀수" );
		}else if (select == 3) {
			System.out.println("첫번째 이름을 넣어 주세요.>>>");
			aName = sc.next();
			System.out.println("두번째 이름을 넣어 주세요.>>>");
			bName = sc.next();
			
			System.out.println(aName.equals(bName));
		}
	}
}
		
		
	/*	
	   int select;		//프로그램을 선택
	  
		
		int kor;
		int eng;
		int math;
		
		int a;
		
		String aName;
		String bName;
		
		
		System.out.println("===========================================");
		System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름식별");
		System.out.println("===========================================");
		System.out.println("위의 번호를 선택하세요.>>>");
	
		select = sc.nextInt();
		
		if ( Select == 1 ) {
			System.out.println("1번선택");
			System.out.println("국어 영어 수학을 공백을 이용해 넣으세요.>>>");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			int sum = kor + eng + math;
			double avg = sum / 3.0;
			System.out.println("합계는 : " + sum + " , 평균은 : " + avg);
			
		}else if (select == 2) {		<<if문이나 3항연산자를 쓸 수 있다.>>
			System.out.println("2번선택");
			System.out.println("정수를 하나 입력하세요.>>>");
			a = sc.nextInt();
			System.out.println(a%2==0 ? "짝수":"홀수");
			
		}else if (select == 3) {		<<if문이나 3항연산자를 쓸 수 있다.>>
			System.out.println("3번선택");
			System.out.println("이름 2개를 공백으로 구분해서 넣으세요>>>>");
			aName = sc.next();
			bName = sc.next();
			if (aName.equals(bName)){   <<참조변수 이프로 euqls() 를 사용해서 값비교>>
				System.out.println("두 값은 동일합니다.");
			}else {
				System.out.println("두 값은 다릅니다.");
		}
		}
	*/	
	//if문이나 3항연산자를 쓸 수 있다.


