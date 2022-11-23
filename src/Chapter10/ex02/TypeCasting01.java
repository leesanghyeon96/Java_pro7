package Chapter10.ex02;

class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal {
	String tigersound;
	void tigerEat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}

class TigerChild extends Tiger {
	String tigerChildsound;
	void tigerChildEat() {
		System.out.println("새끼호랑이는 젖을 먹습니다.");
	}
}


public class TypeCasting01 {

	public static void main(String[] args) {
		// Type Casting (형 변환)
		
		//1. 업캐스팅 : Tiger (자식) 객체 ==> Animal (부모)
		//업캐스팅 : 자식 객체를 생성해서 부모 타입으로 정의 , 자동으로 일어남 = new 앞에 (Animal)안해도됨
		// a1 : Tiger 필드, 메소드 + Animal 필드와 메소드도 포함.
		//	Animal의 필드와 메소드만 사용가능
		Animal a1 =new Tiger();	//Tiger 객체를 생성해서 Animal 타입으로 지정
		//Tiger의 기본생성자 호출하면서 Animal의 필드와 메소드만 사용한다.
		//a1 이라는 객체를 Animal타입으로 
		
		//a1 은 Animal 타입의 필드와 메소드만 사용가능
		a1.name = "호랑이";
		a1.age = 10;
		System.out.println(a1.name);
		System.out.println(a1.age);
		
		a1.eat();
		
		System.out.println("=====다운 캐스팅==========");
		//2. 다운캐스팅 : Animal (부모 타입) --> Tiger (자식 타입) , 수동으로 명시(반드시)
			//a1 : Tiger 필드, 메소드 + Animal 필드와 메소드도 포함.
			//a1 : Animal 타입 --> t2 (Tiger) 타입으로 다운캐스팅
		Tiger t2 = (Tiger) a1;	//a1 : Animal 타입을 가지고있다.
		// t2는 Animal, Tiger 의 필드와 메소드를 모두 접근 가능
		
		//Animal 의 필드와 메소드
		t2.name = "호랑이2";
		t2.age = 6;
		System.out.println(t2.name);
		System.out.println(t2.age);
		t2.eat();
		
		//Tiger의 필드와 메소드도 접근 가능
		t2.tigersound = "어흠";
		System.out.println(t2.tigersound);
		t2.tigerEat();
		System.out.println("==============================");
		
		//2. Tiger 타입으로 객체 생성 : Animal, Tiger의 필드와 메소드 모두 접근 
		// t3 : Animal, Tiger 모두 내포
		Tiger t3 = new Tiger();
		
		//
		//다운 캐스팅 : 실행시 오류가 발생함 , t3에는 TigerChild는 내포하지 있지 않기 때문에 
			//다운캐스팅 실행시 오류발생
		System.out.println("====instanceof 출력====");
		System.out.println(t3 instanceof Animal); //내포하면 true, 아니면 false
		System.out.println(t3 instanceof Tiger);	//true
		System.out.println(t3 instanceof TigerChild);	//false
		
		
		// 다운캐스팅할때 반드시 instanceof 를 사용해야한다. 안그러면 계속 오류남
		if (t3 instanceof TigerChild) {		//객체를 다운캐스팅 할 경우 왼쪽을 반드시 해야한다.
			TigerChild t4 =(TigerChild) t3 ;
		}
		
		System.out.println("=======================");
		
		//1. 업캐스팅 : a3 : Animal, Tiger, TigerChild 내포
			//Animal 타입의 필드와 메소드만 접근 가능
		Animal a3 = new TigerChild();
		//Animal a3 = (Animal) new TigerChild(); (Animal) 생략
		System.out.println(a3 instanceof Animal);		//true
		System.out.println(a3 instanceof Tiger);		//true
		System.out.println(a3 instanceof TigerChild);	//true
		
		//a3 : Animal 의 필드와 메소드만 접근
		a3.name = "호랑이4";
		a3.age = 7;
		a3.eat();
		
		//a3를 Tiger 타입으로 다운 캐스팅
		Tiger t5 = null;		//블락 밖에서 캐스팅할 변수 선언 , 객체 초기화
		if (a3 instanceof Tiger) {
			t5 =(Tiger) a3;
		}
		
		//Animal
		t5.age = 10;
		System.out.println(t5.age);
		t5.name = "호랑이5";
		System.out.println(t5.name);
		
		//Tiger
		t5.tigersound = "어흥";	//Tiger
		
		//3. a3를 TigerChild 로 다운캐스팅
		Tiger t6 = null;	//블락 밖에서 변수 선언
		if(t3 instanceof TigerChild) {
			t6 = (TigerChild) t3;
		}
		
		//t6 : TigerChild 타임 (Animal, Tiger, TigerChild 의 필드와 메소드를 모두 접근가능)
		t6.age = 2;		//Animal
		t6.tigersound = "어흥어흥";	//Tiger
		t6.tigersound = "어흥";		//TigerChild
		
		//t6 (TigerChild) --> Animal
		//업캐스팅
		Animal t7 = t6;		//t7 : Animal, Tiger, TigerChild 내포하고 있고  	Animal타입
		Tiger t8 = t6;		//T8 : Animal, Tiger, TigerChild 내포하고 있고  	Tiger타입
		
		
		
		
		
	}

}
