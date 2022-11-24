package Chapter10.ex04;

class Animal {
	//Animal 클래스에서 생성된 필드
	String name;
	int age;
	
	//기본생성자가 생략되어 있다. Animal ()	{}
/*	Animal() {} //부모클래스에선 기본생성자를 만들어두자
	
	Animal(String name, int Age){
		this.name=name;
		this.age=age;
	}
*/	
	
	//Animal 클래스에서 선언된 메소드
	void cry() {
		System.out.println("Animal 클래스의 cry()");
	}
}

class Tiger extends Animal{	//기본생성자없이 생성자를 만들고 상속하면 오류가 난다.
	//자식 클래스의 생성자에는 기본적으로 super()가 생략되어 있다.
	
	//기본생성자가 생략되어있다.
/*	Tiger(){
		super(); //=>부모클래스의 생성자를 뜻한다. (호출한다.)
	}
*/	
	int tigerNo;	//Tiger 생성된 필드
	void tigerMethod() {
		System.out.println("Tiger 클래스의 메소드");
	}
	@Override
	void cry() {
		System.out.println("어흥");
	}
}

class Eagle extends Animal{
	int eagleNo;
	void eagleMethod() {
		System.out.println("Eagle 클래스의 메소드");
	}
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class TigerChild extends Tiger {
	int tigerChildNo;
	void tigerChild () {
		System.out.println("TigerChild 클래스의 메소드");
	}
	@Override
	void cry () {
		System.out.println("응애~");
	}
}

public class MethodOverriding_test {

	public static void main(String[] args) {
		// 메소드 오버라이딩 : 상속 관계에서 부모클래스의 메소드를 자식 클래스에서 재정의
		
		//1. 객체의 타입
		//a1 : Animal 를 내포하고 있고 Animal의 필드와 메소드 접근
		Animal a1 = new Animal();	//
		a1.name = "동물이름";
		a1.age = 10;
		a1.cry();
		//부모객체를 만들고 자식클래스로 지정하면 오류가 발생함
		System.out.println("========================");
		//2. Tiger 객체를 생성하면서 Tiger 타입으로 지정
		//t1은 Animal, Tiger를 내포하고있고, Tiger 타입으로 지정(Anima,Tiger의 필드,메소드 접근)
		Tiger t1 = new Tiger();
		//부모의 필드와 메소드 호출
		t1.name = "호랑이1";
		t1.age = 5;
		t1.cry(); 
		
		//Tiger의 필드 메소드 호출
		t1.tigerNo = 10;
		t1.tigerMethod();
		t1.cry();
		System.out.println("=======================");
		
		//3. Tiger 객체를 생성하면서 Animal 타입으로 지정(Animal 의 필드와 메소드만 접근)
		// a2 : Animal, Tiger내포 	Animal의 필드와 메소드만 접근가능
		Animal a2 = new Tiger();
		//Animal 의 필드와 메소드만 접근
		a2.name = "호랑이2";
		a2.age = 4;
		a2.cry();	//부모의 객체를 호출하더라도 자식의 객체로 만들어서 자식의 객체가 출력됨
		//오버라이딩된 Tiger 의 cry() 가 호출됨
		
		//다운캐스팅 : a2 :Animal, Tiger를 내포하고 있고 Animal타입으로 되어있다.
		
		Tiger t2 = (Tiger) a2; //다운캐스팅할 경우 반드시 instanceof 를 사용해야한다.
		
		if ( a2 instanceof TigerChild) {
			TigerChild t3 = (TigerChild) a2;
		}else {
			System.out.println("a2 에는 TigerChild를 내포하고 있지 않습니다.");
		}
		
		// TigerChild 객체를 생성하면서 animal 타입으로 지정
		// a4 : Anima, Tiger, TigerCHild를 내포하고 있다.
		Animal a4 = new TigerChild();
		a4.cry();	//응애~
		
		//다운 캐스팅 : 타임을 명시해야함
		Tiger t10 = (Tiger) a4;
		t10.cry();	//어흥x 응애~ o
		
		//다운 캐스팅 : 타입을 명시해야함
		TigerChild tc10 = (TigerChild) t10;
		tc10.cry();	//응애~
		
		//업캐스팅
		Animal a20 = tc10 ;
		
		System.out.println("=========================");
		//배열에 객체를 저장하고 값을 출력 하기 위한 객체 생성 , Animal 타입으로 지정
		Animal a29 = new Animal();		//a29 : Animal
		Animal a30 = new Tiger();		//a30 : Animal, Tiger
		Animal a31 = new Eagle();		//a31 : Animal, Eagle
		Animal a32 = new TigerChild();	//a32 : Animal, Tiger, TigerChild
		
		// 배열에 Animal 타입의 객체 저장
		Animal[] arr = new Animal[] { a29, a30, a31, a32};
		
		// 배열의 값을 출력 : 향상된 for 문을 사용해서 출력
		for (Animal k : arr) {
			k.cry();
		}
		
		System.out.println("=====For 문을 사용해서 객체 정보 출력===========");
		
		// 배열의 값 출력 : for 문을 사용해서 출력, 배열의 값을 Animal 변수에 할당하고 출력
		for(int i =0 ; i <arr.length ; i++) {
			Animal aa = arr[i];
			aa.cry();
		}
		
		System.out.println("======================");
		for ( int i = 0 ; i < arr.length ; i++) {
			arr[i].cry();
		}
		
		System.out.println("========================");
		//객체변수를 블락 밖에서 선언후 출력
		Animal aaa = null;	//Animal 긱체형 변수 , 초기화 할때 null을 사용
		for(int i = 0 ; i <arr.length ; i++) {
			aaa = arr[i];
			aaa.cry();
		}
		
		
	}

}
