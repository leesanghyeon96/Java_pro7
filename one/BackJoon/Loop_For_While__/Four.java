package BackJoon.Loop_For_While__;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 첫째 줄에는 영수증에 적힌 총 금액이 주어진다.
		// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수가 주어진다.
		//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt(); // 물건의 총 가격
		int n = sc.nextInt(); //물건 종류의 수
		int sum = 0;
		
		for(int i = 0 ; i < n ; i ++) {
			int price = sc.nextInt();
			int amount = sc.nextInt();
			sum += price * amount;
		}
		
		if(max == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
