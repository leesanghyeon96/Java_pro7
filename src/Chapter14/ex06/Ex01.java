package Chapter14.ex06;

//1. 예외 발생할때 각 메소드 내부에서 예외를 직접 처리함.
class Aa {
	void abc() {	//bcd() 메소드 호출
		bcd();
	}
	void bcd() {	//메소드 블락내에서 직접 예외 처리
		try {
			System.out.println(3/0);
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			Thread.sleep(1000);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | InterruptedException e) {
			System.out.println("class Aa 의 bcd() 메소드 호출");
		}
	}
}
//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class Bb {
	void abc() throws Exception {
		//bcd() 메소드 호출 : <예외 처리>
		bcd();
	}
	void bcd() throws Exception{	//예외를 미루는것 : throws
		
		System.out.println(3/0);
		int[] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//1. 예외 발생할때 각 메소드 내부에서 예외를 직접 처리함. 의 출력
		System.out.println("=====메소드 내부에서 예외를 직접 처리해서 class Aa 의 메소드 출력=====");
		Aa a1 = new Aa();
		a1.abc();
		a1.bcd();
		System.out.println();
		
		//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws. 의 출력
		System.out.println("=====예외를 전가 해서 class Bb 의 메소드 출력=====");
		Bb b1 = new Bb();
		try {
			b1.abc();
		} catch (Exception e) {
			System.out.println("1. class Bb 의 abc() 메소드를 통해 출력됨");
			e.printStackTrace();
		}
		System.out.println();
		try {
			b1.bcd();
		} catch (Exception e) {
			System.out.println("2. class Bb 의 bcd() 메소드를 통해 출력됨");
			e.printStackTrace();
		}
		
	}

}
