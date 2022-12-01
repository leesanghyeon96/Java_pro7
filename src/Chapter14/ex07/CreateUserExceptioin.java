package Chapter14.ex07;

//1. 사용자정의 일반예외 (checked Exception)
class MyException extends Exception{	//Exception 하위 클래스 : 일반예외
	//사용자정의 예외는 Exception 클래스를 상속해서 만들어야 한다.
	// 2개의 생성자 정의
	public MyException() {	//기본생성자
		super();			//Exception 객체의 기본 생성자 호출
	}
	public MyException(String message) {
		super(message);
	}
}

//2. 사용자정의 실행예외 (Unchecked Exception, RunTime Exception)
	//RunTimeException을 상속해서 실행예외를 만듬

class MyRTException extends RuntimeException{
	public MyRTException () {	//기본생성자
		super();
	}
	
	public MyRTException (String message) {
		super(message);
	}
}

//사용자정의 예외를 테스트 하는 클래스
class A {
	//1. 사용자 정의 예외 객체 생성
	MyException me1 = new MyException() ;	//MyException : 데이터타입
	MyException me2 = new MyException("예외 메제지 : MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");
	
	//2. 예외 던지기 (Throw) : 던진 시점에서 예외발생
			// throws : 예외를 전가.
			// throw  : 예외를 발생시킴.
	// 예외를 내가 직접 처리 : try ~ catch
	
	void abc_1(int num) {
		try {
			if (num >=70) {
				System.out.println("정상작동");
			}else {
				//throw me1;	//예외를 강제로 발생시킴 => catch블락으로 넘어감
				throw me2;		//생성자를 통해 메세지를 넣어놓음
			}
		} catch (MyException e) {
			System.out.println("사용자 정의 예외가 처리됨");
			System.out.println(e.getMessage());
			e.getMessage();		//Exception 클래스의 메소드(me2의 경우) , 리턴값이 있으므로 출력시 syso에 넣는다.
		}
	}
	void bce_1() {
		abc_1(65);	
	}
	
	//2. 예외 전가
	void abc_2(int num) throws MyException{
		if (num>=70) {
			System.out.println("정상작동");
		}else {
			//throw me1;		//예외를 강제로 발생시킴
			throw me2;			//생성자를 통해 메세지를 넣어놓음
		}
	}
	void bcd_2() {
		
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("사용자정의 예외2 발생됨");
			System.out.println(e.getMessage());	//Exception 클래스의 메소드(me2의 경우)
			//e.printStackTrace();
		}
		
	}
}



public class CreateUserExceptioin {

	public static void main(String[] args) {
		// 사용자 정의 Exception : 자신이 직접 생성한 예외. 예) 점수가 70이하면 예외 발생 시켜라.
			// Exception 을 상속해서 자신의 예외를 생성할 수 있다.
		
		//객체 생성후 사용자 정의 예외가 잘 처리되는지 확인
		
		A a = new A();
		a.bce_1();
		System.out.println("=================");
		a.bcd_2();
		
		
		
		
	}

}
