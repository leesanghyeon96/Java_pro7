package Chapter04.ex01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// If 문을 사용해서 , if .. else if... else if... else
		// 스캐너를 사용해서 가지고 있는 돈을 입금 받습니다.
		// 0 ~ 3000 : 걸어서 다닙니다.
		// 3000 ~ 30000 : 지하철을 타고 다닙니다.
		// 30000 ~ 100000 : 택시를 타고 다닙니다.
		// 1000000 ~ : 비행기를 타고 다닙니다.
		
		int money;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("얼마의 돈을 가지고 있습니까?");
		money = sc.nextInt();
		
		if (money <3000) {
			System.out.println("걸어서 다닙니다.");
		}else if (money >= 3000 && money < 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		}else if (money >= 30000 && money <100000) {
			System.out.println("택시를 타고 다닙니다.");
		}else if (money >= 1000000) {
			System.out.println("비행기를 타고 다닙니다.");
		}
		
		
		
		
		
		
		
	}

}
