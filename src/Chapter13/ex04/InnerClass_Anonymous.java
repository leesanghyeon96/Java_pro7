package Chapter13.ex04;

/*
   익명 이너클래스(Anonymous Inner Class) : 메소드 내부에 선언된 클래스 <== 굉장히 많이 사용.
   	-- 메소드 내부의 필드를 이너클래스가 사용할 경우 final 키가 자동으로 할당 (컴파일러에서 자동으로 할당)
 */

class A {	//외부 클래스
	int a = 3;
	A(){}
	A(int a){						//생성자를 사용해서 필드의 값 할당
		this.a = a ;
	}
	public void setA (int a) {		//Setter를 사용해서 필드의 값 할당
		this.a = a ;
	}
	
	void abc() {	//외부클래스의 메소드
		//메소드 안의 필드
		int b = 5;
		//메소드 안의 클래스
		class B {	//지역 이너클래스 : 메소드 내부에 선언된 클래스
						//메소드를 호출할 때 작동이 되므로 메소드 내부에서 객체를 생성해야한다. 
						//(외부에서 지역이너클래스의 객체를 못만든다)
			void bcd () {
				System.out.println(a);
				System.out.println(b);
			}
		}//지역 이너클래스 끝
		//메소드 내부에서 객체 생성
		B bb = new B();
		//객체 생성후 메소드 호출
		bb.bcd();
	}//외부클래스의 메소드 끝
}//class A 끝

public class InnerClass_Anonymous {

	public static void main(String[] args) {
		// 1. 객체 생성후 메소드 호출
		A a = new A();
		a.abc();		//메소드 호출시 B class 가 객체 생성이 되고 B클래스의 메소드 bcd() 호출
		
		
		
		
		
		
		

	}

}
