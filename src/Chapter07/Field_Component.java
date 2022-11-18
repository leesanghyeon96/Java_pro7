package Chapter07;

class A{	//A 클래스 : 객체를 생성하기위한 틀.  메인메소드에서 객체를 생성
	
	// 필드 : 객체 생성시 Heap 영역에 필드의 값이 저장됨
		// Heap 변수[필드]의 값이 비어있을 경우 강제 초기화
	int a;			//기본값 0
	boolean b;		//기본값 false
	double c;		//0.0
	String d;		//null
	
	//생성자(보통 필드 밑에 생성자를 만든다.) : A(){} : 기본 생성자 생략됨
	//매개변수값이 없는 생성자
	
	
	//필드의 기본 값을 출력 하는 메소드
	void defaultValue () {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class B{
	
	//1. 필드 선언 : Heap영역에 변수와 값이 저장됨
	int m = 3;
	int n = 4;
	
	//2. 기본생성자 생략됨 : B(){}
	
	//3. 메소드 선언
	void work1() {
		//실행블락
		int k = 5;		//메소드 내부에서 선언된 지역변수 : stack영역에 저장
		System.out.println(k);	//5
		work2(3);		//메소드호출 (work2 (3) )
	}
	
	void work2(int i) {  //정수를 받는다	work2를 호출하면서 3이 들어가야함
		int j = 4;		//지역변수
		
		System.out.println(i + j);	//7
	}
}


public class Field_Component {
	public static void main(String[] args) {
		// 클래스 내부 구성요소.
		// - Field : 필드
		// - Method : 메소드
		// -Constructor : 생성자
		
		//메소드 내부에서 선언된 변수의 값은 Stack 영역에 저장
		int e;		//메인 메소드 내부에서 선언된 변수는 Stack에 변수와 값이 저장됨.
		
		//1. 객체 생성
		A abc = new A();		// new : Heap영역에 , A() : 기본 생성자 호출
		// abc는 임의
		
		abc.defaultValue();		// 메소드 호출 -> 필드의 값들이 찍힘
								// 기본값없이 출력하면 0,false,0,0,null출력
		
		System.out.println("===============================");
		//여러 객체를 생성할 수 있다.
		A bcd = new A()	;
		bcd.defaultValue();
		
		System.out.println("===============================");
		B b = new B();
		b.work1();		
		
		//클래스 -필드-메소드-메인메소드,new해서- 메소드호출
		
	}

}
