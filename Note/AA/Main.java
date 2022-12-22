package AA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int o = sc.nextInt();
		
		t=(o%10)*10;	//십의 자리수
		
		sc.close();		
		int sum = 0;
			
		int one = sc.nextInt();
		int two = sc.nextInt();
		sum = one + two;						
		System.out.println(sum);		

	}

}
