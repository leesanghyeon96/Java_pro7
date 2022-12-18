package AA;

public class Mathmax {

	public static void main(String[] args) {
		// Math.Max(a,b)
		// 숫자들 중에 가장 큰 값을 출력함
		
		int a = 4;
		int b = 80;
		int c = -40;
		
		System.out.println(Math.max(a, b));	//80
		System.out.println(Math.max(b, c));	//80
		System.out.println(Math.max(c, a));	//4
		
		int d = 1;
		
		// 여러 값들 중에 가장 큰 숫자
		System.out.println(Math.max(Math.max(a, b), Math.max(d, c))); //80
		System.out.println(Math.max(a, Math.max(c, d)));	//4
	}

}
