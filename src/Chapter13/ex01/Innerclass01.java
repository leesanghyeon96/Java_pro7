package Chapter13.ex01;

/*
   이너 클래스 (Inner class) : 클래스 내부의 클래스
   	 1. 인스턴스 이너클래스 : static 키가 붙지 않은 내부 클래스
   	 	- 외부 클래스의 객체를 먼저 생성후에 사용이 가능
   	 2. 정적(static) 이너클래스 : static 키가 들어있는 내부 클래스
   	 3. 지역 이너클래스 : 메소드 내부에 선언된 이너클래스
   	 
   	이너클래스 특징 : 1. Outer Class의 접근제어자의 제한 없이 모두(모든 필드와 메소드) 접근이 가능
   		2. 다른 객체를 생성하지 않고, 내부에 객체를 만들어서 빠르게 사용하기 위해서
   			- 클래스의 필드와 메소드는 객체화 해야 사용이 가능하다.
   			
 */

class A {	//Outer class : 필드, 메소드에 접근제어자가 붙어 있고, 
				//Inner class를 생성하면 Outer class의 접근 제어자 상관없이 접근
	public int a = 3;		//다른 패키지에서 접근가능, 같은 패키지에서도 접근가능
	protected int b = 4;	//다른 패키지에서 접근가능, 같은 패키지에서도 접근가능
	int c = 5;				//default, 다른 패키지에서 접근불가, 같은 패키지에서만 접근가능
	private int d = 6;		//다른패키지, 같은패키지에서도 접근불가, 같은 클래스내에서만 접근가능
	
	void abc () {
		System.out.println("A 클래스의 메소드 abc() 입니다.");
	}
	
	//이너 클래스 : 인스턴스 이너클래스, 1. 아우터 클래스의 접근제어자와 상관없이 접근, 
							  //2. 기능구현을 외부에 객체생성 없이 내부에서 바로 처리가 가능함
		//class B 내부에 outer class의 필드와 메소드를 활용해서 기능 구현을 함.
	class B {
		void bcd() {
			//1. Outer class의 필드접근 : 접근제어자와 상관없이 모든 필드 접근
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			//2. Outer class의 모든 메소드 접근 가능 : 접근 제어자 상관없이 접근
			abc();
		}
	}
}


public class Innerclass01 {

	public static void main(String[] args) {
		//1. 이너클래스를 사용하기 위해서는 outer 클래스의 객체를 먼저 샌성해야 한다.
		A a = new A();	//outer클래스의 객체 생성
		
		//2. 내부클래스의 객체 생성
		A.B b = a.new B();	//A.B : 외부클래스.내부클래스 : A.B : 내부클래스의 타입.
							//b : 참조변수
							//a.new B();	<== 외부인트턴스명.new 내부클래스 생성자호출;
		b.bcd();
		
	}
}
