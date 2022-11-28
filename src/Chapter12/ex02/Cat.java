package Chapter12.ex02;

//Cat 클래스는 Animal 인터페이스의 메소드를 구현한 클래스
public class Cat implements Animal {	//public 은 파일 하나에 한곳만 올 수 있다.

	@Override
	public void cry() {
		System.out.println("야옹");
		
	}
	@Override
	public void run() {
		System.out.println("고양이는 달린다.");
		
	}
	
	
	
}
