package a;

import java.util.Scanner;

public class sadf {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);

		
		int a;
		int b;
		
		String aName;
		String bName;
		
		System.out.println("첫번째 숫자를 넣어 주세요>>>");
		a = sc.nextInt();
		System.out.println("두번째 숫자를 넣어 주세요>>>");
		b = sc.nextInt();
		System.out.println("첫번째 이름을 넣어 주세요>>>");
		aName = sc.next();
		System.out.println("두번째 이름을 넣어 주세요>>>");
		bName = sc.next();
		
		System.out.println( a != b );
		System.out.println(aName.equals(bName));
		
		
		
		
	}

}
