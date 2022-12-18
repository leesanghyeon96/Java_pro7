package BackJoon.PrintAndOperation;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		// (세 자리 수) × (세 자리 수) 곱셈식을 줄별로 출력해라.
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);

	}

}
