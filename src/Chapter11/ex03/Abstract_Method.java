package Chapter11.ex03;

abstract class Animal {		//클래스 내부에 추상 메소드가 1개라도 존재하면, 추상클래스가 되어야 한다.
	
	int a ;
	int b ;
	
	void eat () {
		System.out.println("모든 동물은 먹습니다.");
	}
		//추상 메소드 : 실행블락이 존재하지 않는 메소드
			//반드시 자식 클래스에서 오버라이딩해서 구형부를 만들어야 한다.
			// 프로젝트 설계시 메소드이름을 다른 이름으로 사용하지 못하도록 할 수 있다.
			// 부모 클래스에서는 메소드 이름을 선언만 해주고, 자식 클래스에서 구형하도록 함.
			// 자식 클래스에서는 메소드 이름을 변경 할 수 없다.
	abstract void run() ; // 구현부가 없는 선언만된 메소드 : 추상메소드
	//{} 실행블락이 없음
	
	
	
}

class Cat extends Animal {	//콘크리트 클래스, 부모의 추상 메소드를 모두 구형한 클래스
	//추상메소드를 구현하지 않으면 오류가남
	//부모 클래스에서 추상메소드가 존재할 경우 자식에서는 추상메소드를 오버라이딩해서 구형해야된다.
	//부모의 클래스에 추상 메소드를 구현하지 않는 경우는 자식 자신도 추상 클래스가 되어야 한다.
	
	
	@Override
	void run() {
		System.out.println("고양이가 달립니다.");
	}
	
	
}

abstract class Dog extends Animal {		
	//클래스에 abstract를 하거나 ctrl+space를 눌러 오버라이딩을 하면 오류가 나지 않음
	
	@Override
	void run() {
		System.out.println("개도 달립니다.");
	}
	
}


public class Abstract_Method {

	public static void main(String[] args) {
		// 

	}

}
