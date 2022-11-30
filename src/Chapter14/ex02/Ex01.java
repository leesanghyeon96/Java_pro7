package Chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {

		// try ~ catch ~ finally 구문을 사용해서 예외 처리

		int[] arr = new int[] { 1, 2, 3, 4 };

		// 실행시 예외 발생 :

		try {
			System.out.println(arr[5]);
			System.out.println("try 블락의 코드");	

		} catch (ArrayIndexOutOfBoundsException e) { // e : 참조변수
			// try 블락에서 ArrayIndexOutOfBoundsException 발생이 되면 작동
			System.out.println("try 블락에서 오류가 났습니다.");
		} finally {
			// 무조건 작동 되는 블락
			System.out.println("finally 블락으로 try블락의 Exception에 상관없이 실행되는 블락");
		}

		// System.out.println(arr[5]);

		System.out.println("프로그램 종료");

	}

}
