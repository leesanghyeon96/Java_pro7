package Chapter16.ex07;

//제너릭 클래스로 들어오는 타입을 제한을 할 수 있다. , extends 키를 사용해서 제한
	// extends 키를 사용해서 제너릭 타입에 들어오는 타입의 제한을 둘 수 있다.

class A {}
class B extends A {}
class C extends B {}
//c는B를상속, B는A를상속

class D <T extends B> {		//T에 들어오는 타입을 제한을 둘 수 있다. (B로만 제한한다.)
	private T t;			//T에 들어올 수 있는 타입은 B,C 타입만 들어올 수 있다.

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}


public class BoundedTypeOfGenericClass {

	public static void main(String[] args) {
		
	//	D<A> d1 = new D<>();	//오류 발생 , A 타입은 T에 들어갈 수 없다.	(class D 에서 제한했기때문에)
		D<B> d2 = new D<>();	// T : B 타입은 들어감.
		D<C> d3 = new D<>();	// T : C 타입도 들어감.
		
		D d4 = new D();		//(타입생략) == D<B> d4 = new D<>();	
							//타입을 생략해서 호출하면 제한된 타입이 기본적으로 들어감.
		
		//setter 를 사용해서 타입에 값 입력
		d2.setT(new B());		//d2는 B타입으로 정의해서 객체를 생성, setter 주입시 B타입의 객체를 주입
		d3.setT(new C());		//d3는 C타입을 정의해서 생성, setter 주입시 C타입의 객체를 주입
		
		//
	//	d3.setT(new B());		//d3는 C타입으로 정의되어 있다.
								//(B를 객체화해 C타입으로 정의할 수 없다.)
								//B를 객체화하면, A,B를 내포하고 있고 C객체가 내포되어있지 않다.
		d3.setT(new C());		//
		d2.setT(new C());		//d2는 B타입으로 가능 (C객체가 B타입으로 업캐스팅됨)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
