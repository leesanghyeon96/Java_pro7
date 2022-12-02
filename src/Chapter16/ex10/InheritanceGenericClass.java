package Chapter16.ex10;

//제너릭 클래스의 상속 , 자식 클래스는 부모 클래스의 타입변수의 갯수가 같거나 많아야 한다.

class Parent<T> {
	T t;
	// getter, setter 생략
}
class Child1<T> extends Parent<T> {		//부모의 타입<T를 가지고 있어야한다.>
	
}

class Child2 <T ,V> extends Parent<T> {
	V v;
}


public class InheritanceGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
