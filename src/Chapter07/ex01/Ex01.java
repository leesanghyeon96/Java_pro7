package Chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		//<완료시간 11 : 40분까지> , p.jangwoo@gmail.com
		
		//객체 생성 , 메소드 호출 : main method 에서 호출
		
		// sum1 ,sum2 객체 생성 없이 바로 호출 : static 메소드
		
		
		int h = sum1(8, 6, 10);
		System.out.println(h);
		//System.out.println(sum1(8, 6, 10));
		System.out.println("========================");
		
		double j = sum2(8.5, 9.5, 4.2);
		System.out.println(j);
		//System.out.println(sum2(8.5, 9.5, 4.2));
		System.out.println("=========================");
		
		//fac : 인스턴스 메소드 : static 키가 붙어있지 않는 메소드 , 객체화 해야 호출이 가능
		//String c = fac("제품이름", "제품가격", "제품수량"); => 오류발생, 객체화 해야 호출
		
		//객체화
		Ex01 p1 = new Ex01();	//(); 기본 생성자 호출 -> 생략됨
		String yu = p1.fac("제품이름 : 텀블러 \n", "제품 수량 : 50 \n", "제품 가격 : 8000");
		System.out.println(yu);
		//System.out.println(p1.fac("제품이름 : 텀블러 \n", "제품 수량 : 50 \n", "제품 가격 : 8000"));
		

	}

	//정수값 3개를 인풋 받아 더한값을 정수로 리턴하는 메소드(static)
	public static int sum1(int a , int b, int c) {
		return a+ b+c;
	}
		
	//실수 3개를 인풋 받아 더한 값을 실수로 리턴하는 메소드 (static)
	public static double sum2(double d, double e, double f) {
		return d + e + f;
	}
	
	//문자열을 연결해서 출력 하는 메소드 (인스턴스 메소드 : static 을 사용하지 않는 메소드)
		//"제품이름" , "제품수량" , "제품가격"
		//객체를 생성해서 
	public String fac(String q, String w, String e) {
		return q + w + e;
		//return a + " " + b + " " + c ; => 강사님
	}
	
}
