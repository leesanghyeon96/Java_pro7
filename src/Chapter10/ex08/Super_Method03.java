package Chapter10.ex08;

class A {
	A(){
		this(3);	//자신 객체의 정수 1개인 생성자 호출
		System.out.println("A 생성자 1");
	}
	A (int a){
		System.out.println("A 생성자 2");
	}
}
class B extends A {		//자식 클래스는 생성자 첫 라인에 super()[생략], this()가 반드시 와야한다.
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a){
		//super(); 가 생략되어있다.
		System.out.println("B 생성자 2");
	}
}



public class Super_Method03 {

	public static void main(String[] args) {
		// 
		
		//1. 객체 생성후 출력 (A의 기본생성자 호출)
		A aa1 = new A();	//A 생성자 2 , A 생성자 1 차례로 출력
		System.out.println("==========================");
		
		//2.
		A aa2 = new A(3);	//A생성자 2 호출
		System.out.println("=======================");
		
		//3. B 생성자 호출
		B bb1 = new B();
		// B의 기본생성자 호출 - B의 매개변수1개인 생성자가면 super때문에 A 의 기본생성자로 가는데
		// this(3) 으로 인해 결국 출력 순서는 1.(A 생성자 2) 2.(A 생성자 1) 3.(B 생성자 2)
		// 4.(B 생성자 1) 순서로 출력됨   * 호출의 역순으로 출력됨
		//	A 생성자 2
		//	A 생성자 1
		//	B 생성자 2
		//	B 생성자 1
		System.out.println("=======================");
		
		B bb2 = new B(3);	//	A 생성자 2
							//	A 생성자 1
							//	B 생성자 2	순서로 출력됨
		
		
		
		
		
		
		
		
		
	}

}
