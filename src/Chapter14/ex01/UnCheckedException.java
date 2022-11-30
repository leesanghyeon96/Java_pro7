package Chapter14.ex01;

class A1 {
} // 부모클래스

class B extends A1 {
} // 자식클래스

public class UnCheckedException {

	public static void main(String[] args) {
		// 실행 예외 : 컴파일 단계에서 체크하지 않는다. 실행시 오류가 발생됨
		// Unchecked Exception, RunTineException

		// 1. ArithmeticException : 정수를 0으로 나누었을때 발생하는 Exception
		// 모든 프로그램에서 숫자를 0으로 나누면 오류가 발생함
//		System.out.println(3/0);	// a/b(b가0이면 오류발생)

		// 2. ClassCastingException : 다운캐스팅시 타입이 존재하지 않는 경우 발생

		A1 a = new A1(); // 부모 클래스를 객체화함.
//		B b = (B) a;		//a 객체는 B타입을 포함하지 않는다. , 실행시 문제 발생

		// 3. ArrayIndexOutOfBoundException : 배열의 방번호를 넘겼을때 발생하는 예외
		int[] arr = new int[] { 1, 2, 3 };

//		System.out.println(arr[3]);		//배열의 방의 번호를 넘김

		// 4. NumberFormatException : 문자타입의 값을 정수(int), 실수(double) 변환예외
//		int num = Integer.parseInt("10!");
//		double num2 = Double.parseDouble("10.22");
//		System.out.println(num2);

		// 제일 많이 발생 되는 예외
		// 5. NullPointException : 참조주소의 값이 null 인데, 메소드 호출하는 경우
		String str = "안녕하세요!";
		System.out.println(str.charAt(2)); // 문자열이 저장된 경우 2번방의 문장을 출력

	}

}
