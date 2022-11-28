package Chapter12.ex01;

abstract class Calc2{
	abstract void add (int a , int b);
	abstract void diff (int a , int b);
	abstract void mul (int a , int b);
	abstract void div (int a , int b);
}

class Calc_Impl2 extends Calc2{
	@Override
	void add(int a, int b) {
		System.out.println(a + b);
		
	}
	@Override
	void diff(int a, int b) {
		System.out.println(a - b);
		
	}
	@Override
	void mul(int a, int b) {
		System.out.println(a * b);
		
	}
	@Override
	void div(int a, int b) {
		double c = (double)a/b;
		System.out.println(c);
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("구현 클래스의 메소드 호출후 출력");
		// 1. 구현 클래스의 메소드 호출후 출력
		Calc2 c1 = new Calc_Impl2();
		c1.add(5, 8);
		c1.diff(8, 4);
		c1.mul(5, 7);
		c1.div(7, 6);
		
		System.out.println();
		System.out.println("익명 클래스로 메소드 호출후 출력");
		// 2. 익명 클래스로 메소드 호출후 출력
		Calc2 c2 = new Calc2() {
			@Override
			void add(int a, int b) {
				System.out.println(a + b);
				
			}
			@Override
			void diff(int a, int b) {
				System.out.println(a - b);
				
			}
			@Override
			void mul(int a, int b) {
				System.out.println(a * b);
				
			}
			@Override
			void div(int a, int b) {
				double c = (double)a/b;
				System.out.println(c);
				
			}
		};
		c2.add(88, 2);
		c2.diff(65, 7);
		c2.mul(11, 28);
		c2.div(42, 11);
		
	}

}
