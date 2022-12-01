package Chapter14.ex06;
// 예외 처리 : 1. try ~ catch 를 사용해서 내가 직접 처리하는 경우, 2. throws : 예외를 전가
	//예외를 무한히 전가하는 경우 : main 메서드에서 예외가 발생되면 멈춘다.

class Aaa{
	void abc() throws InterruptedException {
		bcd();
	}
	void bcd() throws InterruptedException {	//예외 전가
		cde();
	}
	void cde() throws InterruptedException {	//cde메소드를 호출하는 곳에서 예외를 처리하도록 전가
		Thread.sleep(1000); 
	}	//일반예외 : 반드시 예외처리가 되어야함
}


public class ThrowsException02 {

	public static void main(String[] args) {
		// 
		
		//객체 생성후 abc() 메소드 호출
		Aaa a1 = new Aaa();
		try {
			a1.abc();
		} catch (InterruptedException e) {
			
		}
		
		
		//=>main까지 전가시키면 오류발생
		
		

	}

}
