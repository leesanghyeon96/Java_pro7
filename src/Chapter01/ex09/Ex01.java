package Chapter01.ex09;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록 하고
		// 어머님이름, 아버님 이름, 형제이름, 자신이름		sc.next();
		// 어머님나이, 아버님나이, 형제나이, 자신나이		sc.nextnt();
		
		//콘솔에서 인풋 받은 이름은 모두 출력
		//나이의 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		String mother;
		String father;
		String brother;
		String me;
		int motherY;
		int fatherY;
		int brotherY;
		int meY;
		
		System.out.println("어머님 이름>>>");
		mother = sc.next();
		System.out.println("아버님 이름>>>");
		father = sc.next();
		System.out.println("형제 이름>>>");
		brother = sc.next();
		System.out.println("나의 이름>>>");
		me = sc.next();
		System.out.println("어머님 나이>>>");
		motherY = sc.nextInt();	
		System.out.println("아버님 나이>>>");
		fatherY = sc.nextInt();	
		System.out.println("형제의 나이>>>");
		brotherY = sc.nextInt();	
		System.out.println("나의 나이>>>");
		meY = sc.nextInt();	
		
		int sum;
			sum = motherY + fatherY + brotherY + meY;
		double avg;
			avg = sum / 5.0 ;
		
	System.out.println("==============");
		System.out.println("어머님의 이름은" + mother + "이고");
		System.out.println("아버님의 이름은" + father + "이고");
		System.out.println("형제의 이름은" + brother + "이고");
		System.out.println("나의 이름은" + me + "입니다.");
		System.out.println("나이의 합계는"  + sum + "이고");
		System.out.println("나이의 평균은" + avg + "입니다.");
		
		
		
		
		
		
		
	}

}
