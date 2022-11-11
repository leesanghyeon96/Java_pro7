package Chapter04.ex02;

public class Switch_Control_Statement {

	public static void main(String[] args) {
		// Switch 문
		//		-- if 문은 참일경우 실행블락을 실행후 break; 가 자동으로 작동
		//		-- Switch 문은 실행후 해당 블럭을 빠져나오지 않는다. 강제로 빠져나오도록 break;를 넣어야한다.
		
		//1. Switch문에서 break를 사용하지 않는 경우
		int value1 = 2;
		
		switch (value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		case 4:
			System.out.println("D");
		default :							
			System.out.println("F");
		}
		//스위치에 변수값이 들어오고 그 변수값에 맞는 case의 숫자에 들어가 실행(점프후찍고 아래 다 실행시키고 빠져나옴)
		System.out.println("====switch 문으로 출력======================");
		//2. Switch 문에서 break를 포함해서 출력 <== 기본적으로 사용
		int value2 = 4;
		
		switch (value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default :							//if문의 else와 같다. <<case 에 존재하지 않는 모든것>>
			System.out.println("F");
			break;
		}
		
		//3. Switch 문은 if... else if .. else if .. else ...문으로 변환
		System.out.println("======if 문으로 변환==============");
		if (value2 == 1) {
			System.out.println("A");
		}else if (value2 == 2) {
			System.out.println("B");
		}else if (value2 == 3) {
			System.out.println("C");
		}else if (value2 == 4) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
