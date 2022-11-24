package Chapter10.ex05;
// static field 의 오버라이딩 가능성
class Aa {
	static int m = 3;
}
class Bb extends Aa {
	static int m= 4;
}

public class Override_Static_Field {

	public static void main(String[] args) {
		// 정적 필드 (static field) : 오버라이딩 되지 않는다. 별도의 공간에 값이 존재함
			// 메모리의 클래스 영역에 값이 존재함
			//객체a과 객체b의 m은 heap영역에 있어 클래스의 m값을 가르킨다.
		//1. 객체 생성 없이 클래스 이름으로 바로 출력
		System.out.println(Aa.m);	//3
		System.out.println(Bb.m);	//4
		System.out.println("================");
		
		//2. 객체화 해서 정적 필드 내용을 출력
		Aa aa = new Aa();
		Bb bb = new Bb();
		Aa ab = new Bb();
		
		System.out.println(aa.m);	//3
		System.out.println(bb.m);	//4
		System.out.println(ab.m);	//3 -> 오버라이딩이 되었다면 4가 출력되었어야함
		
	}

}
