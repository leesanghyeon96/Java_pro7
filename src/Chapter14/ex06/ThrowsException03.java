package Chapter14.ex06;

class Aaaa {
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		//해당 클래스에 클래스가 존재하지 않는다. 일반예외
		Class cls2 = Class.forName("java.lang.Object2");
	}
}


public class ThrowsException03 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Aaaa a1 = new Aaaa();
		
		a1.abc();
		
		System.out.println("프로그램 종료 ");
		
	}

}

/*
 * public class ThrowsException03 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 메인메소드까지 throws로 전가하면 오류가 발생할 수도 안할수도 있다.
		
		Class cls = Class.forName("java.lang.Object");	//패키지내에 클래스가 존재하므로
			//오류가 발생되지 않음.
		
		Class cls2 = Class.forName("java.lang.Object2");	//존재하지 않는 클래스
		
		
		
		System.out.println("프로그램 종료 ");
		
	}

}
 */
















