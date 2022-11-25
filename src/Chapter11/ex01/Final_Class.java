package Chapter11.ex01;

class Aaa{
	int m ;
	final int n ;		//final은 반드시 초기값이 할당되어 있어야 한다.
	
	Aaa(){
		n = 10;		//final 이라 int값을 넣어줘야 한다.
	}
	
	Aaa(int n){
		this.n = n;
	}
	
	void run () {
		System.out.println("Aaa 클래스의 run() 입니다.");
	}
	
}

final class Bbb extends Aaa{		//상속이 불가한 클래스(클래스앞에 final이 있으면)
	
}

//	상속 불가 : 부모 클래스 이름에 final 키가 할당됨
//	class Ccc extends Bbb{}		


public class Final_Class {

	public static void main(String[] args) {
		//

	}

}
