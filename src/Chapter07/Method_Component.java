package Chapter07;

class Method{
	
	//필드는 생략
	//생성자 생략
	
	//1. 리턴타입 : void + 매개변수:없는 메소드
	void print() {		//매개변수 없음
		System.out.println("안녕");	//메소드 호출하면 실행
	}
	
	//2. 리턴타입 : int + 매개변수:없는 메소드	void가 아닌건 모두 리턴타입
		// 메소드 를 호출시 돌려주는 값
	int data() {	//int (리턴타입) : 호출시 정수를 돌려줌
		int a;
		a = 3;
		
		return a;		//반드시 return ; 을 해줘야함 return뒤에도 반드시 정수이어야함
						//return이 없어도 오류
	}
	
	//3. 리턴타입 : double + 매개변수가 2개인 메소드
	double sum (int a, double b) {	//sum에서 호출시 첫번째는 정수, 두번째는
		return a + b;	// 더해서 더블형으로 보내줌
	}
	
	//4. 리턴타입 : void + 내부에 리턴포함 ( 함수를 종료 한다는 의미 )
	void PrintMonth (int m) {
		if (m<0 || m>12) {	
			System.out.println("잘못된 입력입니다.");
			return;		//void로 선언된 메소드 내에서 return을 사용하면 메소드를 종료
		}
		System.out.println(m + " 월 입니다."); //0과 12사이에 있으면
	}
}


public class Method_Component {

	public static void main(String[] args) {
		
		/*
		 Method (메소드) : 실행블락에 프로그램 기능을 저장
			- 호출시 작동
			- 메소드 이름 앞에 리턴타입이 반드시 존재해야한다.
				void : 리턴타입이 존재하지 않을때.
				int : 정수 값을 리턴
				boolean : true, false 를 리턴
				... double, char,
				String : 문자열을 리턴
				참조자료형 모두
		*/
		
		
		//1. 객체 생성 : class ==> Object (Instance)객체
		Method m = new Method(); //Method라는 클래스를 가지고 m이라는 객체를 생성함
		
		//2. 메소드 호출 : m.메소드명   객체를 가지고 메소드를 호출
		m.print();
		
		int k = m.data();	//data()메소드를 호출하는 순간 정수 3값이 리턴되어 받아온다.
		System.out.println(k);	//정수면 int로 실수면 double로
		
		double l = m.sum(50, 60.6);	//정수와 실수로 던져줘야한다.
		System.out.println(l);
		
		m.PrintMonth(10);	//10 월입니다.
		
		m.PrintMonth(50);	//잘못된 입력입니다.
		
	}

}
