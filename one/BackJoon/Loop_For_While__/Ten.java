package BackJoon.Loop_For_While__;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 입력의 마지막에는 0 두 개가 들어온다.
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1 ; ; i++) {
			int one = sc.nextInt();
			int two = sc.nextInt();
			sum = one + two;
			
			if(one == 0 && two == 0) {
				break;
			}
			System.out.println(sum);
		}
	}

}
