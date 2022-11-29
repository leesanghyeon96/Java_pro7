package Chapter12.ex05;

interface A {
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능이 추가되면 오류가 발생됨
	//그래서 나온 것이 default메소드이다.
	//2022 년에 새로운 기능 추가.
	default void cde() {		//인터페이스에 들어가는 모든 메소드는 public이 생략되어있다.
		System.out.println("블루투스 기능 추가");
	};	//default 메소드는 자식 클래스에게 상속되어 내려간다.
	
	void abc();	//2000 년에 구현된 메소드
	void bcd();	//2005 년에 구현된 메소드
	//void cde();	//2010 년에 구현된 메소드
}

//가정 : interface A 를 구현한 클래스가 1000개 존재한다.

class Aa implements A{
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현1");
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현2");
	}
}
class Aaa implements A {
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현3");
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현4");
	}
}
class Aaaa implements A {
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현5");
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현6");
	}
	//deault 메소드도 오버라이딩이 가능하다.
	@Override
	public void cde() {
		System.out.println("A 인터페이스의 default 메소드 오버라이딩");
	}
}



public class Default_Interface {

	public static void main(String[] args) {
		// Interface : 인터페이스의 모든 필드와 메소드는 public이 생략되어있다.
				// 구현한 클래스에서 메소드를 오버라이딩할 반드시 public 키가 들어가 있어야한다.
		// 모든 필드는 : public static final
		// 모든 메소드는 추상메소드 이어야 한다. : public abstract
			// 예외 : 1.8 버젼 부터 새로운 기능이 추가, default, static 메소드가 추가
				//인터페이스에서 구현부가 있는 메소드. default, static
		//default : 인터페이스에서 구현부가 있는 메소드
					//인터페이스를 구현한 모든 클래스에 상속되어 적용.
					//오버라이딩도 가능하다.
					//새로운 기능을 추가할때 하위에 구현된 클래스에 오류없이 적용 가능하도록 한다.
			//인터페이스는 객체화를 할 수 없다.
		
		// 인터페이스를 구현한 클래스를 객체화해서 타입으로 저장함.
		A a1 = new Aa();
		A a2 = new Aaa();
		A a3 = new Aaaa();
		
		//2. 인터페이스의 메소드 호출 ===> 오버라이딩된 메소드가 호출
		a1.abc();
		a1.bcd();		//
		a1.cde();		//default 메소드
		
		System.out.println("=======================");
		a2.abc();
		a2.bcd();
		a2.cde();		//default 메소드,
		
		System.out.println("========================");
		a3.abc();
		a3.bcd();
		a3.cde();		//default 메소드 오버라이딩
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
