package Chapter12.ex01;
//모든 클래스는 오브젝트 클래스를 상속받고 있다.
abstract class Animal {		//추상클래스, 추상메소드가 1개라도 포함이 되면 
	String name ;
	int age ;
	
	Animal(){}
	
	

	//추상 메소드 : {}, 실행 블락이 없고 , 선언만된 메소드
		//하위 클래스에서 추상 메소드를 반드시 구현해야 한다.
		//오버라이딩해서 쓸거라 구지 실행블락이 있을 필요가 없다.
	abstract void cry();	//인풋만 선언되고, {} 실행부가 없는
	abstract void run();
	
	//to String 메소드 재정의 : 상위 클래스에서 정의해 좋으면 자식 클래스에게 상속 되어 내려감.
	//	Object 클래스의 메소드 : 객체를 출력했을때 객체의 Heap의 참조주소를 출력하지 않고 필드의 값을 출력
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
}

//class Cat extends Animal {} //오류가 남. 콘크리트 클래스, 추상클래스가 되어야한다.
class Cat extends Animal {
	//생성자를 통해서 필드의 값 입력
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}@Override
	void run() {
		System.out.println("고양이가 뜁니다.");
		
	}
}

class Dog extends Animal {
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("멍멍");
		
	}@Override
	void run() {
		System.out.println("개는 달립니다.");
		
	}
}

public class Abstract_Class01 {

	public static void main(String[] args) {
		// 객체 생성후 값입력
		
		Animal a1 = new Cat("고양이" , 10);	//업캐스팅되어 객체생성됨
		Animal a2 = new Dog("개", 20);		// ..
		
		//객체를 배열에 저장
		Animal [] arr = new Animal[] {a1, a2};
		
		//for 문을 사용해서 객체의 정보를 출력
		for ( int i = 0 ; i <arr.length ; i++) {
			//객체 자체를 출력 : toString() : 객체의 메로리의 정보를 출력
			System.out.println(arr[i]);
			
			arr[i].cry();
			arr[i].run();
		}
		
		
	}

}
