package Chapter10.ex02;

//클래스의 상속 관계에서 업캐스팅 및 다운 캐스팅
class A {}
class B extends A{}
class C extends B{}
class D extends B{}


public class Type_Casting02 {

	public static void main(String[] args) {
		// 1. 업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가 , 자식 클래스 객체 생성 ==> 타입을 부모
		
		//ac : A, B, C를 모두 내포하고 있고 A 타입으로 정의
		A ac = new C();	//ac 는 A,B,C클래스 모두 내포하고 있다. 여기서 A타입만 접근가능
		// A ac = (A) new C();		//ac는 B,C 로 다운캐스팅이 가능하다 
		
			//내포하고 있는지 정의
			System.out.println(ac instanceof A);	//true
			System.out.println(ac instanceof B);	//true
			System.out.println(ac instanceof C);	//true
			System.out.println(ac instanceof D);	//false
		System.out.println("=============================");
			
		//bc : A, B, C 를 모두 내포하고 있고 B 타입으로 정의, <<A, B접근>>
		B bc = new C();	//B클래스가 A클래스를 내포하고 있기에 A, B, C모두 접근 가능하다.
		
			//내포하고 있는지 정의
			System.out.println(bc instanceof A);	//true
			System.out.println(bc instanceof B);	//true
			System.out.println(bc instanceof C);	//true
			System.out.println(bc instanceof D);	//false
			
		//bc는 B 타입으로 정의 A 타입으로 업캐스팅
		A a = bc ; //c타입으로 다운캐스팅 가능
		
		
		//2. 다운 캐스팅 (수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않는다. 실행시 예외가 발생
		//aa는 A 만 내포하고 있다.
		A aa = new A ();	
		//A클래스를 new로 만들어서 A객체만 담고있다.
			System.out.println(aa instanceof A);	//true
			System.out.println(aa instanceof B);	//false
			System.out.println(aa instanceof C);	//false
			System.out.println(aa instanceof D);	//false
			
		if (aa instanceof B) {	
			B ba = (B) aa ;		//컴파일시 오류가 없다, 실행시 오류가 발생(A클래스만 내포하기때문에)
		} else {
			System.out.println("aa는 B를 내포하고 있지 않아서 다운캐스팅이 불가능합니다.");
		}
		if (aa instanceof C) {	
			C ca = (C) aa ;		//컴파일시 오류가 없다, 실행시 오류가 발생(A클래스만 내포하기때문에)
		} else {
			System.out.println("aa는 C를 내포하고 있지 않아서 다운캐스팅이 불가능합니다.");
		}
		System.out.println("==========================");
		
		// bd : A, B, D타입을 내포하고있다. B로 타입을 정의했기에 <<A와 B로만 접근할 수 있다.>>
		// A와 D로 업, 다운 캐스팅이 가능하다.
		B bd = new D();
			System.out.println(bd instanceof A);	//true
			System.out.println(bd instanceof B);	//true
			System.out.println(bd instanceof C);	//false
			System.out.println(bd instanceof D);	//true
		
		
		
	}

}
