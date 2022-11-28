package Chapter12.ex02;

interface A {	// 인터페이스 이름 : 첫자는 반드시 영문대문자	//정식표현
	//모든 필드는 : public static final
		//static : 객체 생성없이 호출이 가능하다. A.a
		//final : 상수 (값을 수정 할 수 없다.)
	public static final int a = 3;	
		
	//모든 메소드는 : public abstract
	public abstract void abc();
}

//인터페이스의 구현되지 않는 메소드를 구현한 클래스
class Aa implements A {		//인터페이스를 구현한 클래스
	
	@Override
	public void abc() {		//부모의 인터페이스는public이지만 왼쪽은 default라서 안됨
							//그래서 오버라이딩할 경우 void앞에 public을 붙여줘야한다.
		System.out.println("A 인터페이스를 구현한 메소드");
	}
	
}


//일반적인 표현, 축약 표현	<== <주로 사용>
interface B {
	//public static final 생략됨
	int a = 5;
		
	//public abstract 생략됨	: 모든 메소드는 선언부만 있고 구현부가 없어야 한다. (예외, default, static)
	void abc ();
}

class Bb implements B{
	
	@Override
	public void abc() {
		System.out.println("B 인터페이스를 구현한 메소드");
		
	}
	//@Override
	 //void abc() {		//오류발생 : 부모의 인터페이스는public이지만 왼쪽은 default라서 안됨
							//그래서 오버라이딩할 경우 void앞에 public을 붙여줘야한다.
	//}
}


//추상 클래스 : 추상 메소드를 포함한 클래스, 추상 클래스내의 추상 메소드는 abstract키를 생략하면 안됨
abstract class C {
	//필드
	int m = 4;		//일반 인스턴스 필드 : 수정이 가능함
	
	void bcd() {	//일반 메소드 : 구현부가 있는 인스턴스 메소드
		System.out.println("추상메소드 C 클래스의 메소드");
	}	
	
	//추상 클래스 내의 추상 메소드는 abstract 키를 붙여야 한다.
	//추상 메소드가 있으면 객체를 만들 수 없다.
	abstract void abc ();	//default
	
}

class Cc extends C {
	@Override
	void abc() {
		System.out.println("추상 클래스 C를 구현한 메소드 : Cc 클래스의 오버라이딩된 메소드");
		
	}
}




public class Interface01 {

	public static void main(String[] args) {
		/*
		   인터페이스 (Interface) : 내부와 외부를 연결시켜주는 접점, 콘센트
		   		- 객체 생성이 불가, 타입으로 지정은 가능
		   		- 모든 필드는 public static final 이 생략됨
		   			: 값을 수정할 수 없다.
		   		- 모든 메소드는 public abstract 이 생략됨 (예외 : default, static 메소드 : 1.8 버젼)
		   			: 모든 메소드는 선언부만 있어야한다. 구현부가 있으면 안됨 : {}
		   			: 예외, default, static 메소드는 인터페이스에서 유일하게 구현부를 가지는 메소드
				- 하나의 클래스는 하나의 부모 클래스를 상속해야 한다. , 자바는 다중상속 불가
				- 하나의 클래스는 여러개의 인터페이스를 다중 상속이 가능하다.
		 */

		//1. 인터페이스는 객체화 할 수 없다. 구현되지 않는 메소드가 있기 때문에 
		//A a = new A();
		//B b = new B();
		
		//2. 타입 지정은 가능하다. <=== (중요함. 많이 사용)
		A a1 = new Aa();	// A : 인터페이스, Aa : 인터페이스를 구현한 클래스
		a1.abc();	//오버라이딩된 메소드 호출
		
		B b1 = new Bb();
		b1.abc();	//오버라이딩된 메소드 호출
		
		System.out.println("======================================");
		
		//3. 인터페이스의 필드는 public static final 생략
				// static : 객체생성할 필요 없이 바로 호출이 가능 : A.a
				// final : 값을 수정할 수 없다.
		
		System.out.println(A.a);	//인터페이스명.필드명
		System.out.println(B.a);	//인터페이스명.필드명
		
		//4. 필드의 값을 수정 할 수 없다.
		//A.a = 10;		//final 이 있으므로 값 수정이 불가
		//B.a = 20;		//final 이 있으므로 값 수정이 불가
		
		System.out.println("=====추상 클래스 (C)======================");
		
		//1. 추상 클래스 : 객체 생성 불가
		//C c1 = new C ();	//C : 추상 클래스
		
		//2. 추상 클래스 : 구현한 클래스를 객체화 해서 타입 지정을 가능
		C c2 = new Cc();	
		System.out.println(c2.m);	//인스턴스 필드 : 객체 생성 후 호출 가능
		//System.out.println(C.m );	//인스턴스 필드 : 
		
		c2.m = 44;
		System.out.println(c2.m);	//44 : 값 수정이 가능함.
		
		c2.bcd();		//C 클래스의 일반 메소드 (인스턴스 메소드)
		c2.abc();		//오버라이딩된 메소드 출력 , C 타입의 abc()를 호출, Cc 타입의 abc()
		
		
	}

}
