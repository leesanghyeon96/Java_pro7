package Chapter10.ex10;

//java.lang 패키지의 모든 클래스는 import 없이 사용이 가능하다.

class A5 extends Object { 	//extends Object가 생략되어있다. 
			// Object 클래스의 모든 메소드를 상속 받는다.
			// 자식 클래스는 하나의 부모만 상속 할 수 있다.
			// JAVA는 다중 상속이 불가함.
			// 인터페이스는 다중 Implements 가 가능하다.
	int m = 3;
	int n = 4;
	
	String name;

	//toString() : Object 클래스의 메소드, 
		//	객체를 출력시 toSting() 메소드가 작동이 되고, 기본적으로는 패키지이름.클래스이름@hashcode()
		//	객체 자체를 출력시 객체의 필드의 값을 출력하도록 재정의 해서 사용한다.
		//	오버라이딩을 하지 않으면 객체의 참조주소값이 나온다.
	@Override
	public String toString() {
		return "A5 [m=" + m + ", n=" + n + ", name=" + name + "]";
	}
	
}

public class Inheritance_Object {

	public static void main(String[] args) {
		// 
		A5 a = new A5 ();
		
		//객체 자체를 출력시 Object 클래스의 toString() 가 작동
		//	패키지이름.클래스이름@hashcode()	
		//	hashcode ==> 참조주소 : 객체에 저장된 Heap 메모리의 주소
		//	그래서 재정의를 해서 많이 쓴다.
		System.out.println(a);				//
		System.out.println(a.toString());
		
		
		// String 클래스는 toString() 가 재정의 되어져 있다.
		String s1 = new String("안녕");
		System.out.println(s1);
		
	}

}
