package BackJoon.ConditionalStatement;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		// 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		if (a>0 && b>0) {
			System.out.println(1);
		}else if(a>0 && b<0) {
			System.out.println(4);
		}else if(a<0 && b>0){
			System.out.println(2);
		}else if(a<0 && b<0) {
			System.out.println(3);
		}
		
	}

}
