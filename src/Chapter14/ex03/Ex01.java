package Chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3개의 예외를 하나의 try ~ catch 블락에 넣고,
		// 1. 각각에 대해서 catch 블락
		// 2. 3개의 예외를 한꺼번에 처리
		/*
		 * System.out.println( 3/0 ); //실행 예외 : ArithmeticException
		 * 
		 * int[] arr = new int[] {1,2,3}; 
		 * System.out.println(arr[5]); //실행 예외 :ArrayIndexOutOfBoundsException
		 * 
		 * 
		 * int num = Integer.parseInt("20A"); //실행 예외 : NumberFormatException
		 */

		// 1. 각각에 대해서 catch 블락
		System.out.println("=====1. 모든 예외를 하나의 try 블락에 넣고 예외를 각각 다르게 처리함.=====");
		try {
			System.out.println(3 / 0);

			int[] arr = new int[] { 1, 2, 3 };
			System.out.println(arr[5]);

			int num = Integer.parseInt("20A");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누어지지 않습니다. 오류를 확인해주세요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 방의 개수가 맞지 않습니다. 오류를 확인해주세요.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다. 오류를 확인해주세요.");
		} finally {
			System.out.println("1. 프로그램을 종료합니다.");
		}
		System.out.println();

		// 2. 3개의 예외를 한꺼번에 처리
		System.out.println("=====2. 모든 Exception을 한꺼번에 처리=====");
		try {
			System.out.println(3 / 0);

			int[] arr = new int[] { 1, 2, 3 };
			System.out.println(arr[5]);

			int num = Integer.parseInt("20A");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// 코드없어도됨
			System.out.println("모든 예외를 하나의 블락에서 처리");
			
			System.out.println(e.getMessage());
			// e.getMessage() <== Exception의 간단한 정보를 출력(리턴으로 돌아옴)
			e.printStackTrace(); // <== 예외의 세부적인 정보를 출력(어떤 Exception로 떨어졌는지)
			
			// System.out.println("0으로 나누어지지 않습니다. 오류를 확인해주세요.");
			// System.out.println("배열의 방의 개수가 맞지 않습니다. 오류를 확인해주세요.");
			// System.out.println("숫자로 변환할 수 없습니다. 오류를 확인해주세요.");
		}
		System.out.println("2. 프로그램을 종료합니다.");
		
		//3. 각각의 try 블락에서 처리
		System.out.println("=====3. 각각의 try 블락에서 처리");
		try {
			System.out.println(3 / 0); // 실행 예외 : ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("3. 0으로 나눌 수 없습니다.");
		}
		try {
			int[] arr = new int[] { 1, 2, 3 };
			System.out.println(arr[5]); // 실행 예외 : ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3. 배열의 방을 넘겼습니다.");
		}
		try {
			int num = Integer.parseInt("20A"); // 실행 예외 : NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println("3. 숫자를 변경할 수 없습니다.");
		}

		System.out.println("3. 프로그램을 종료합니다.");

	}

}
