package BackJoon.PrintAndOperation;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
		// 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
		// 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
		// 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e,f;
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 d=sc.nextInt();
		 e=sc.nextInt();
		 f=sc.nextInt();
		 
		 int a1=1-a;
		 int b1=1-b;
		 int c1=2-c;
		 int d1=2-d;
		 int e1=2-e;
		 int f1=8-f;
		 System.out.print("" + a1 + " " + b1 + " " + c1 + " " + d1 + " " + e1 + " " + f1);
		
	}

}
