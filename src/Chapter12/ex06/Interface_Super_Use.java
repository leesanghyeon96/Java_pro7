package Chapter12.ex06;

interface A2 {
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능이 추가되면 오류가 발생됨
	//그래서 나온 것이 default메소드이다.
	//2022 년에 새로운 기능 추가.
	//default 메소드 : 인터페ㅔ이스 내에서 구현부가 있는 메소드
		//모든 자식 클래스에서 상속 되어 내려감. 새로운 기능을 추가할때 자식 클래스에서 오류없이 기능 추가
	default void cde() {		//인터페이스에 들어가는 모든 메소드는 public이 생략되어있다.
		System.out.println("블루투스 기능 추가");
	};	//default 메소드는 자식 클래스에게 상속되어 내려간다.
	
	//추상 메소드 : public abstract 가 생략되어있다.	<==실행부가 없는 메소드{}
		//자식 클래스에서는 선언만 된 메소드를 구현해야될 의무를 가지고 있따.
	void abc();	//2000 년에 구현된 메소드
	void bcd();	//2005 년에 구현된 메소드
	
}

class B implements A2 {	//class B 다음에 extends Object가 생략되어 있다.
	@Override
	public void abc() {
		System.out.println("와이파이 기능 1");
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 2");
	}
	public void def() {		//자식 클래스에서 인터페이스의 메소드 호출 : A.super.메소드명
		//인터페이스의 메소드를 호출시 : 
		A2.super.cde();		// 인터페이스 A의 cde() 메소드 호출
		//super.cde();		// Object 클래스의 cde() 메소드 호출
	}
}


public class Interface_Super_Use {

	public static void main(String[] args) {
		// 자식 클래스에서 인터페이스에 구현된 default 메소드 호출시 : 

		//1. 객체 생성
		A2 a1 = new B();
		a1.abc();	//A 인터페이스에 존재하는 메소드		//B() 에서 오버라이딩
		a1.bcd();	//A 인터페이스에 존재하는 메소드		//B() 에서 오버라이딩
		a1.cde();	//A 인터페이스에 존재하는 메소드		//default 메소드
		
		//a1을 B 타입으로 다운캐스팅해야 def() 메소드를 호출할 수 있다.
		System.out.println("=============================");
		B b1 = (B) a1;
		b1.def();
		
		
		
		
	}

}
