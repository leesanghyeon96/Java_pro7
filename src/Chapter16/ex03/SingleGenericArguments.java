package Chapter16.ex03;


class Apple {String apple = "애플";}
class Pencil {String pencil = "연필";}
class Banana {String banana = "바나나";}

//제너릭 클래스 : 다양한 타입을 저장할 수 있는 클래스
	//클래스이름뒤 <T>
	//객체를 생성할때 <T> 들어오는 타입을 지정해서 객체를 생성함.
	 // <T>에 들어오는 타입은 객체형 타입만 들어와야 한다. , wrapper class를 사용해야 한다.
	 // wrapper class : 기본자료형을 객체형 자료형으로 만들것
	 	// boolean : Boolean , char : Charter
	 	// byte : Byte , short : Short , int : Integer , long : Long
		// float : Float , double : Double

class Myclass<T> {	//제너릭타입 T(한글자 아무거나) : 변수(타입)(여러개의 타입을 한꺼번에 받을 수 있다.)
	private T t;		//객체를 호출할때 지정  , 객체형 자료형을 넣어야한다.
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	
}


public class SingleGenericArguments {

	public static void main(String[] args) {
		//1. 제너릭 타입의 객체 생성하기
		Myclass<Apple> app1 = new Myclass<Apple>();		//<타입>꺽쇠 안에 타입을 던져줌
		
		//Apple 객체를 setter를 사용해서 주입 하고 값 가져오기
		app1.set(new Apple());
		System.out.println(app1.get().apple);	//get : 매모리의 값을 출력
		
		
		//Pencil 객체를 setter를 사용해서 주입하고 값 가져오기
		Myclass<Pencil> pen1 = new Myclass<>();		//뒤의<>의 안 내용은 생략가능
		
		//Pencil 객체를 setter를 사용해서 주입
		pen1.set(new Pencil());					//setter를 사용해서 Pencil 객체를 주입
		System.out.println(pen1.get().pencil);	//getter를 사용해서 Pencil 객체를 가져옴
		
		
		//Banana 객체를 setter로 주입하고 값가져오기
		Myclass<Banana> Ba1 = new Myclass<Banana>();
		Ba1.set(new Banana());
		System.out.println(Ba1.get().banana);
		//Ba1.get() : 넣은 Banana 객체
		//Ba1.get().banana : Banana 필드의 값
		
		
		//String 값을 넣고 출력하기
		Myclass<String> str1 = new Myclass<>();
		str1.set("안녕하세요");
		System.out.println(str1.get());		//객체를 넣지 않아서 바로 출력
		
		//int 값을 넣고 출력하기 : Integer(객체타입)
		Myclass<Integer> int1 = new Myclass<Integer>();
		int1.set(20221201);
		System.out.println(int1.get());
		
		//double 값을 넣고 출력하기 : Double(객체타입)
		Myclass<Double> double1 = new Myclass<>();
		double1.set(2022.1201);
		System.out.println(double1.get());
		
		
		
		
		
		
		
		
		
		
	}

}
