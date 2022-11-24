package Chapter10.ex07;

class Aa {
	Aa() {
		System.out.println("Aa 의 생성자");
	}
}

class Bb extends Aa {
	Bb(){
		//super(); 생략됨
		System.out.println("Bb 의 생성자");
	}
}
class Cc extends Bb {
	Cc(){
		//super(); 생략됨
		System.out.println("Cc의 생성자");
	} 
}


public class Super_Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생생후 생성자 작동 확인
		Cc cc = new Cc();
		//=>Bb의 기본 생성자 호출 후 Aa의 기본 생성자 호출 후 출력 후 Bb의 기본 생성자 출력 후 Cc의 기본 생성자 출력
		
		
		
		
	}

}
