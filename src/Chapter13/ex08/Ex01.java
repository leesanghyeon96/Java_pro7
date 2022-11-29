package Chapter13.ex08;

interface Animal {
	void cry();
	void fly();
}

//인터페이스를 사용해서 4가지 형태로 출력
//1. Animal을 구현한 Inner 클래스를 생성후 메소드 출력
//2. Animal을 익명 클래스로 생성해서 출력
//3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성
//4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 없이 출력

//1. Animal을 구현한 Inner 클래스를 생성후 메소드 출력
class A {
	
	Animal a = new B();
	
	void mo() {
		a.cry();
		a.fly();
	}
	
	class B implements Animal{
		@Override
		public void cry() {
			System.out.println("Animal을 구현한 Inner 클래스를 생성후 메소드 출력 : 운다1");
		}
		@Override
		public void fly() {
			System.out.println("Animal을 구현한 Inner 클래스를 생성후 메소드 출력 : 난다1");
		}
	}
}

//2. Animal을 익명 클래스로 생성해서 출력
class Aa {
	Animal a1 = new Animal() {
		@Override
		public void cry() {
			System.out.println("Animal을 익명 클래스로 생성해서 출력 : 운다2");
		}
		@Override
		public void fly() {
			System.out.println("Animal을 익명 클래스로 생성해서 출력 : 난다2");
		}
	};
	
	void AnimalAa () {
		a1.cry();
		a1.fly();
	}
}

//3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성
class Aaa {
	void AnimalAnima (Animal a3) {
		a3.cry();
		a3.fly();
	}
}









public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("1. Animal을 구현한 Inner 클래스를 생성후 메소드 출력");
		A a = new A();
		a.mo();
		System.out.println();
		
		
		System.out.println("2. Animal을 익명 클래스로 생성해서 출력");
		Aa a2 = new Aa();
		a2.AnimalAa();
		System.out.println();
		
		
		System.out.println("3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성");
		Aaa a5 = new Aaa();
		
		//Animal 타입의 참조변수 생성
		Animal a4 = new Animal() {
			@Override
			public void cry() {
				System.out.println("객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성 : 운다3");
			}
			@Override
			public void fly() {
				System.out.println("객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성 : 난다3");
			}
		};
		
		//객체의 메소드 매개변수로 참조 타입을 넣어서 호출 
		a5.AnimalAnima(a4);
		System.out.println();
		
		
		System.out.println("4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 없이 출력");
		a5.AnimalAnima(new Animal() {
			@Override
			public void cry() {
				System.out.println("객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 없이 출력 : 운다4");
			}
			@Override
			public void fly() {
				System.out.println("객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 없이 출력 : 난다4");
			}
		});
		
		
		
		
		
	}

}
