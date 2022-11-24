package Chapter10.ex05;
//static 메소드의 override 가능성
class Aaa {
	static void print() {
		System.out.println("Aaa 클래스의 static 메소드");
	}
}
class Bbb extends Aaa {
	static void print() {
		System.out.println("Bbb 클래스의 static 메소드");
	}
}

public class Override_Static_Method {

	public static void main(String[] args) {
		// static method : 오버라이딩 되지 않는다.
			// 클래스 영역에 메소드가 별도로 저장되어 있다.	객체의 Heap 주소(위치값만) 가진다.
		
		//1. 객체 생성 없이 클래스이름으로 접근
		Aaa.print();	//Aaa 클래스의 static 메소드
		Bbb.print();	//Bbb 클래스의 static 메소드
		System.out.println("=====================");
		
		//2. 객체 생성 후 출력
		Aaa a = new Aaa();
		Bbb b = new Bbb();
		Aaa ab = new Bbb();
		
		a.print();	//Aaa 클래스의 static 메소드
		b.print();	//bbb 클래스의 static 메소드
		ab.print();	//Aaa 클래스의 static 메소드 ->오버라이딩이 되었으면 Bbb 클래스의 static 메소드 가 출력되었어야한다.
		
		
		
		
		
		
	}

}
