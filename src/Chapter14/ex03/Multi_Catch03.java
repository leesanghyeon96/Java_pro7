package Chapter14.ex03;

public class Multi_Catch03 {

	public static void main(String[] args) {
		// Exception : 모든 예외의 부모 클래스 , try 블락의 모든 예외를 처리
			//각 예외에 대한 세부적인 제어가 불가능하다
			//Exception을 받아 처리하면 그 아래에 코드를 작성하더라도 도달할 수 없어서 오류난다.
		
		/*
		
		try {
			System.out.println(3 / 0);	//실행 예외 : ArithmeticException
			
			int[] arr = new int[] { 1, 2, 3 };	//실행 예외 :ArrayIndexOutOfBoundsException
			System.out.println(arr[5]);
	
			int num = Integer.parseInt("20A");	//실행 예외 : NumberFormatException
		
		}catch(Exception e) {
			//이 블락은 모든 예외를 Exception에서 받아서 처리
			
			
		}catch(ArithmeticException e) {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(NumberFormatException e) {
			
		}
		
		*/
		
		
		try {
			System.out.println(3 / 0);	//실행 예외 : ArithmeticException
			
			int[] arr = new int[] { 1, 2, 3 };	//실행 예외 :ArrayIndexOutOfBoundsException
			System.out.println(arr[5]);
	
			int num = Integer.parseInt("20A");	//실행 예외 : NumberFormatException
		
		}catch(ArithmeticException e) {
			//1. try블락의 예외에 대한 세부 처리
		}catch(ArrayIndexOutOfBoundsException e) {
			//1. try블락의 예외에 대한 세부 처리
		}catch(NumberFormatException e) {
			//1. try블락의 예외에 대한 세부 처리
		}catch(Exception e) {
			//그 외의 모든 예외를 Exception에서 받아서 처리
			//세부적인 예외처리를 하려면 세부적인 예외처리 후
			//부모 Exception은 첫번째가 아닌 마지막에 와야한다.
			
		}
		
	}

}
