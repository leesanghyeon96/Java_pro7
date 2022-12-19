package AA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= a ; i++) {
			int one = sc.nextInt();
			int two = sc.nextInt();
			sum = one + two;
			System.out.println("Case #" + i + ": " + sum);
		}
	
		sc.close();
	}

}
