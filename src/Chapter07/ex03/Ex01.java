package Chapter07.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
		   		values[0] : 값이 정수 1 ~ 9 가  들어올때 "파워레벨 1 ~ 9 입니다" 출력
		   		values[1] : 값이 정수 1 ~ 9 가 들어올때 "스피드레벨 1 ~ 9 입니다" 출력
		   		
		 */
		arrayFlexble (7,5);
		
		
		
		
	}
	
	public static void arrayFlexble (int...values) {
		if (values[0] > 0 && values[0] < 10) {
			System.out.printf("파워레벨 %d 입니다." , values[0]);
		}else {
			System.out.println("잘못된 입력입니다. 1 ~ 9 사이의 값만 넣으세요");
		}if (values[1] > 0 && values[1] < 10) {
			System.out.printf("스피드레벨 %d 입니다." , values[1]);
		}else {
			System.out.println("잘못된 입력입니다. 1 ~ 9 사이의 값만 넣으세요");
		}
		
		
		
		
		
/*		int[][] values11 = new int[1][2];
		for (int i = 0 ; i < 10; i++) {
			for (int j = 0 ; j < 10; j++) {
				System.out.println("파워레벨 " + i + "입니다" + "스피드레벨" + j + "입니다");
			}
		}
		
*/		
	}
	
	
	

}
