package BackJoon.ConditionalStatement;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다. 
		// 요리에 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int H,M,N;
		H =sc.nextInt();
		M =sc.nextInt();
		N =sc.nextInt();
		
		if(M+N <= 59) {
			System.out.println(H + " " + (M+N));
		}if(M+N > 59) {
			System.out.println(((H*60 + M + N)/60)%24 + " " + (H*60 + M + N)%60);
		}

		
	}

}
