package Chapter13.ex03;

/*
   static Inner Class : 외부클래스에서 인스턴스필드, 인스턴스 메소드는 static Inner Class 블락에 올 수 없다.
   		- 외부 클래스의 정적 필드, 정적 메소드만 static Inner Class 블락에 올 수 있다.
   		
   		인스턴스 필드, 인스턴스 메소드는 객체 생성후 사용가능
   		
   		
 */

class A {	// Outer Class
	//외부 클래스에서 필드 선언
	int a = 3;	//인스턴스 필드
	static int b = 4;	//정적(static) 필드
	
	//외부 클래스에서 메소드 선언 
	void method1() {		//인스턴스메소드
		System.out.println("A 클래스의 인스턴스 메소드");
	}
	static void method2 () {	//정적(static) 메소드
		System.out.println("A 클래스의 정적(static) 메소드");
	}
	
	//Inner Class
	static class B {	//static 이너 클래스 : static 필드나 static 메소드만 포함할 수 있다.
		void bcd() {
			//1. 외부 클래스의 인스턴스 핃드, 메소드 : 접근 불가
			//System.out.println(a);	//인스턴스 필드 
			System.out.println(b);	//정적 필드
			
			//method1();	//인스턴스 메소드 : 접근불가
			method2();	//정적 메소드
		}
	}
}


public class InnerClass_static {

	public static void main(String[] args) {
		// static 이너클래스의 객체 생성 : 외부 클래스를 생성하지 않고 바로 객체 생성이 가능
		// ==> 그냥 클래스와 static이너클래스의 객체생성하는 방법이 다르다.
		
		//1. static 이너 클래스의 객체 생성
		A.B b = new A.B();
		b.bcd();
		
		
		
		
		
	}

}
