package Chapter14.ex02;

public class TryCatchFinally {

	public static void main(String[] args) {
		/*
		 * 예외를 처리하는 방법 1. 자신이 직접 예외를 저리 : try catch finally 를 사용해서 처리 2. 예외를 자신이 직접 처리하지
		 * 않고 전가 : throws , 메소드 뒤에 throws 예외객체 //메소드를 호출하는 곳에서 예외를 처리
		 * 
		 * throw : 예외를 발생시키는 키워드
		 * 
		 */

		System.out.println("=====try ~ catch==========");
		// 1. try ~ catch
		// try + ctrl + spacebar
		try {
			// try 블락에서 예외가 발생되면 catch 블락의 코드를 실행
			// try 블락에서 예외가 발생되지 않으면 catch 블락은 실행되지 않는다.
			System.out.println(3 / 0); // 실행예외 : (ArithmeticException)

		} catch (ArithmeticException e) {
			// try 블락에서 ArithmethicException 이 발생했을때 작동
			// try 블락에서 ArithmethicException 이 발생이 되지 않았을때는 작동 되지 않는다.
			System.out.println("try 블락에서 오류가 발생되면 처리됨.");
			// catch 블락에 내용이 없더라도 문제없다.
		}

		System.out.println("=====try ~ catch ~ finally=========");

		// 2. try ~ catch ~ finally
			//finally 블락은 오류와 상관없이 실행되는 블락
		
		// try + ctrl + spacebar
		try {
			System.out.println(3 / 0);
			System.out.println("try 블락에 생성된 구문"); // 오류발생시 실행 x

		} catch (ArithmeticException e) { // try에서 발생되는 Exception
			// try블락에서 Exception이 발생이 되었을때 실행
			System.out.println("숫자 0으로는 나눌 수가 없습니다.");

		} finally {
			// try 블락에서 Exception발생 유무와 상관 없이 반드시 실행되는 블락
			System.out.println("finally 블락 : 반드시 실행되는 블락");

		}

		System.out.println("프로그램의 마지막 입니다.");
		// 오류가 발생되었지만 프로그램이 종료되지 않고 진행되어 출력됨

		
		
		//e.getMessage() <== Exception의 간단한 정보를 출력(리턴으로 돌아옴)
		//e.printStackTrace(); //<== 예외의 세부적인 정보를 출력(어떤 Exception로 떨어졌는지)
		
	}

}
