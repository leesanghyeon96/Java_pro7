package Chapter10.ex03;

class A {		//부모 클래스 ( super class )
	
	void print () {		//인스턴스 메소드 : 메소드 오버라이딩 이 가능하다 (static 메소드는 불가)
		System.out.println("A클래스의 pring()");
	}
}
class B extends A {		//자식클래스 ( child class )
	
	@Override		//@ : 어노테이션, @override : 부모의 메소드를 재정의시 오류를 방지하는 어노테이션
					//꼭 넣어야하는건 아니지만 오타같은걸 바로 알려준다.
	void print () {
		System.out.println("B 클래스의 print()"); //=>재정의
	}
}


public class Method_Overriding01 {

	public static void main(String[] args) {
		/*
		   	Method Overloading	: 동일한 이름의 메소드를 시그니쳐에 따라서 다르게 식별 (메소드, 생성자)
		  			시그니쳐 : 인풋 매개변수의 개수, 타입
		   	Method Overriding	: 부모 클래스의 메소드를 자식 클래스에서 재정의 해서 사용하는것
		   		<인스턴스 메소드>
		 */
		
		//1. A 타입  / A 생성자 호출
		A aa= new A();
		aa.print();					//A 클래스의 print()
		
		//2. B 타입	/ B 생성자 호출
		B bb = new B();
		bb.print();					//B 클래스의 print()
		
		//3. A 타입 / B 생성자 호출
		A ab = new B();				//b를 객체화해서 a타입으로하면 A클래스의 print()가 아닌
		ab.print();					//B 클래스의 print() 가 호출된다.
		//오버라이딩된 print가 호출됨
		//A의 메소드를 호출하면 B의 메소드가 오버라이딩되어 B의 메소드가 호출된다.
		//A클래스의 print를 출력하는데 B클래스의 print가 출력된다. -> 오버라이딩
		//A클래스가 먼저 만들어지기 때문에 B클래스가 A클래스의 print를 덮어씌워 오버라이딩이된다.

	}

}
