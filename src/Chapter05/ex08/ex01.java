package Chapter05.ex08;

public class ex01 {

	public static void main(String[] args) {
		// <문제>
		//	args : 	합계 40 77 99 100 200
		
		// 합계 : <정수를 더한 값을 출력>
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		String t = args[5];
		
		
		int g = Integer.parseInt(b);
		int h = Integer.parseInt(c);
		int	i = Integer.parseInt(d);
		int j = Integer.parseInt(e);
		int p = Integer.parseInt(t);
		
		int sum =   g + h + i + j + p;
		
		System.out.println("<정수를 더한 값을 출력>" + sum);
		System.out.println(a + sum);
		
	/*	
		강사님
		String s = args[0];
		int sum = 0;
		for (int i = 1 ; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.print(s + " : ");
		System.out.println(sum);
	*/	
		System.out.println("==============");
		
		System.out.println("합계" + 1 + 2 + 3 );		//합계123
		System.out.println(1 + 2 + 3 + "합계");		//6합계
		
		
		
		
		
		
		
		
		
		
	}

}
