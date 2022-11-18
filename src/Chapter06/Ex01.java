package Chapter06;

class Man {
	//필드
	String name = "홍길동" ;
	int age = 30 ;
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	
	//기본 생성자는 생략됨 : A () {}
	int i,j,t;
	int sum1=0;
	int sum2=0;
	int sum3=0;
	//메소드 : 
	void add1 () {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력
		System.out.println("1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력");
		int a = 0;
		for ( i = 1, a=0 ; i < 100 ; i++) {
			if( i%2==0) {
				sum1 +=i;
				System.out.print(i + " ");
			
			}
		}
		
	}
	
	void add2 () {
		// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값 출력
		System.out.println("1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값 출력");
		for ( j = 1; j < 500 ; j++) {
			if(j%3==0 || j%4==0) {
				sum2 +=j;
				System.out.print(j + " ");
				
			}
		}
			
	}
	
	
	void add3 () {
		// 1 ~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력
		System.out.println("1 ~ 1000 까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력");
		for (t = 1 ; t <1000 ; t++) {
			if(t%4==0) {
				continue;
			}
			sum3 +=t;
			System.out.print(t + " ");
			
		}

	}
	
	
	}
	
	
public class Ex01 {

	public static void main(String[] args) {
		// 객체생성은 반드시 메인메소드안에서.
		
		Man lg = new Man() ;
			
		lg.add1();
		lg.add2();
		lg.add3();
		
		System.out.println("\n");
		
		System.out.println(lg.name);
		System.out.println(lg.age);
		System.out.println(lg.phone);
		System.out.println(lg.addr);
		System.out.println(lg.weight);
		System.out.println("=======");
		System.out.println(lg.sum1);
		System.out.println(lg.sum2);
		System.out.println(lg.sum3);
		System.out.println("==--==");
		System.out.print(lg.i);
		System.out.print(lg.j);
		System.out.print(lg.t);
		
		
		
		
		
		
		
		
	}

}
