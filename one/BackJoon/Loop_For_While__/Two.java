package BackJoon.Loop_For_While__;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for (int i = 0 ; i < a ; i +=1) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr[i] = b + c;
		}
		
		for(int k : arr) {
			System.out.println(k);
		}
		
	}

}
