package Chapter09.ex01;

public class A {
	
	//필드 이름 앞에 접근 제어자
	public int a=1;			//public :    외부 패키지에서 접근이 가능 
	protected int b = 2;	//protected : 외부 패키지에서 접근이 가능 ( 상속관계일때만 가능 )
	int c = 3;				//default :   같은 패키지 내에서만 접근 가능
	private int d = 4;		//private :   동일한 파일에서만 접근이 가능
	
	public A ( ) {}		//public이 없으면 class의 접근제어자가 생성자로 내려옴(public, dafault)ㅇ
	
	public void abc() {					//public : 다른 패키지에서 접근가능
		System.out.println("public");
	}
	protected void bcd() {				//protected : 다른 패키지에서 접근가능(단, 상속관계일때만)
		System.out.println("protected");
	}
	void cde() {						//default : 같은 패키지에서만 접근 가능
		System.out.println("default");
	}
	private void def() {				//private : 같은 파일 내에서마 접근 가능
		System.out.println(" private");
	}
	
	
	
	
	
}
