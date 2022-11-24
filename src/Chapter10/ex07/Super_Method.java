package Chapter10.ex07;

class A {
	A(){System.out.println("A 생성자");}
}
class B extends A {
	B(){				//자식클래스의 모슨 생성자에는 super();가 생략되어있다.
		super();		//생략되어있다. 컴파일러가 자동으로 추가해줌
		System.out.println("B 생성자");
	}
}
class C {
	C(int a){
		System.out.println("C 생성자");
	}
}
class D extends C{
	
	D(){
		super(3);		//기본생성자가 없어도 안에 값을 넣어주면 오류가 나지 않음 , C 생성자 출력
		System.out.println("D 생성자");	//D 생성자 출력
	}
}

public class Super_Method {

	public static void main(String[] args) {
		// Super Method : 부모클래스의 생성자 호출
		// 		- 자식 클래스 생성자는 기본적으로 super() , 부모클래스의 기본생성자 호출
		
		//1. A 객체 생성
		A aa = new A();		//A생성자
		System.out.println("===============");
		
		//2. B 객체 생성
		B bb = new B();
		System.out.println("=================");
		
		//3. D 객체 생성
		D dd = new D();
		
		
		
	}

}
