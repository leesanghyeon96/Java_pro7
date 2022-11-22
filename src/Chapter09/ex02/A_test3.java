package Chapter09.ex02;

import Chapter09.ex01.A;

//외부 클래스, 상속 관계가 설정된 클래스
public class A_test3 extends A{		//A : 부모클래스

	int k = a;	//a : public 접근지정자 등록
	int l = b;	//b : protected
//	int m = c;	//c : default	//외부 패키지에서 접근 불가
//	int n = d;	//d : private	//외부 패키지에서 접근 불가
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_test3 a1 = new A_test3();		//부모클래스가 아닌 현 클래스를 객체화 해야한다.
		System.out.println(a1.a);	//public
		System.out.println(a1.b);	//protected
	//	System.out.println(a1.c);	//default
	//	System.out.println(a1.d);	//private
		
		a1.abc();	//public
		a1.bcd();	//protected
	//	a1.cde();	//default
	//	a1.def();	//private
		
		
		
	}

}
