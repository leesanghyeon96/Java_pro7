package Chapter05.ex08;

public class ex02 {

	public static void main(String[] args) {
		// main metod 의 배열변수 args 로 실수 값 넣어서 계산 하기
		//	args  : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		//		for 문을 사용해서 처리
		//			합계 : <실수를 더한 합계>
		
		double d = Double.parseDouble(args[1]); 		//<=문자형 실수를 실수형으로 바꾸는 것
		
		String b = args[0];
		double sum = 0;			//0인 이유는 아래의 sum에서 더할 값이기 때문에 초기값을 0으로 맞춰준다.
		
		for ( int i = 1 ; i < args.length ; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.println("<실수를 더한 합계>" + sum);
		System.out.println(b + " : " + sum);
		

	/*	강사님
		String a = args[0];
		double sum = 0;
		
		for ( int i = 1 ; i < args.length ; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.println(sum);
		System.out.printf(a + " : %4.3f ", sum);
	*/	
		
		
		
		
		
		
	}

}
