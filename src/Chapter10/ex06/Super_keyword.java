package Chapter10.ex06;

class Aa {
	void abc () {
		System.out.println("Aa 클래스의 abc()");
	}
	void ab() {
		System.out.println("Aa 클래스의 ab()");
	}
}

class Bb extends Aa {
	@Override
	void abc() {
		System.out.println("Bb 클래스의 abc()");
	}
	void bcd() {
		abc();		//this.abc() : 자기 자신  클래스의 abc()
	}				//super.abc 는 부모의 abc호출 //this.abc() 는 자기 자신 abc호출
	void cde() {
		super.abc();	//부모 클래스의 abc()
	}					//Aa클래스의 abc가 아닌 오버라이딩된 자신의abc가 호출됨
	void def() {
		super.ab();		//부모 클래스의 ab()
	}
}

public class Super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 객체 생성
		//bb : Aa, Bb 가 내포 되어 있고, 타입을 Bb 타입으로 지정
		Bb bb = new Bb();
		
		//2. 메소드 호출
		bb.bcd();	//Bb 클래스의 abc()
		bb.cde();	//Aa 클래스의 abc()
		bb.def();	//Aa 클래스의 ab()
		
		
		
		
		
		
	}

}
