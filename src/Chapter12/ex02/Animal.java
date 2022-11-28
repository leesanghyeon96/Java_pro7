package Chapter12.ex02;

public interface Animal {
	
	//추상 메소드 : {}구현구가 없다.
	//public abstract 가 생략 되어 있다.
	void cry();
	void run();
	
	//void eat() {};	//인터페이스 내부에 구현부가 있는 메소드를 넣으면 오류발생
	
	
}

//Animal 의 메소드를 구현한 클래스
//Cat 클래스는 Animal 인터페이스의 구현되지 않은 메소드를 구현한 클래스








