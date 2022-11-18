package Chapter07;

class Calc{
	//사칙 연산을 처리 하는 메소드
	
	//두 정수의 값을 받아서 더해서 값을 던져줌
	int add (int a, int b) {
		return a+b;
	}
	
	// 빼기 (diff)
	int diff (int c, int d) {
		return c - d;
	}
	
	// 곱하기 (mul)
	int mul ( int e, int f) {
		return e * f;
	}
	
	// 나누기 (div) : double
	double div(double g, double h) {
		return g/h;
	}
	
	// 면적 (Rec) (가로 : x , 세로 : y)
	double Rec(int x , double y) {
		return x*y;
	}
	
	
}






public class Ex01 {

	public static void main(String[] args) {
		
		Calc a = new Calc(); 		//Calc calc = new Calc(); 로 해도 됨 대소문자구분
		
		int p = a.add(5, 10);
		int o = a.diff(80, 60);
		int u = a.mul(70, 2);
		double y = a.div(65.8, 7.5);
		double t = a.Rec(37, 7.4);
		
		System.out.println(" 두 정수의 합 : " + p);
		System.out.println(" 두 정수의 차 : " + o);
		System.out.println(" 두 정수의 곱 : " + u);
		System.out.println(" 두 정수의 나누기 : " + y);
		System.out.println(" 가로 세로 길이에 따른 면적의 넓이 : " + t);
		
		System.out.println("=============================");
		
		System.out.println(a.add(5, 10));
		System.out.println(a.diff(80, 60));
		System.out.println(a.mul(70, 2));
		System.out.println(a.div(65.8, 7.5));
		System.out.println(a.Rec(37, 7.4));
		
		
		
		

	}

}
