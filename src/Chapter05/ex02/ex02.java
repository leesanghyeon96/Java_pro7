package Chapter05.ex02;

import java.util.Arrays;

public class ex02 {
	public static void main(String[] args) {
		// <문제> 배열 변수 : arr1, 배열의 방의 갯수 : 500개
		// 배열방에 3의 배수 와 5의 배수를 저장
		// 출력 : 1. for, 2. Enhanced for, 3. Arrays.toString()을 사용해서 출력
	/*	
		int[] arr1 = new int[500];
		
		
		int a=0;
		for (int i = 0 ; ; i++) {
			if (i%3==0 || i%5==0) {
				arr1[a] = i;
					a++;
			}
			if (a==arr1.length-1)
				break;
		}
	*/	
		
		//강사님
		int i = 0;
		int[] arr1 = new int[500];
		
		for ( int a = 1 ; a < 3000 ; a++ ) {		//a : 3의배수, 5의배수를 저장하는 변수
			if ( a % 3 == 0 || a % 5 ==0) {
				arr1[i] = a;
				i++;
			}
			if ( i > 499) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("=====1. for을 사용해서 출력=====");
		for (int i1 = 0 ; i1 < 500 ; i1++) {
			System.out.print(arr1[i1] + " ");
		}
		
		System.out.println();
		
		System.out.println("=====2. Enhanced for을 사용해서 출력======");
		for (int p : arr1)
			System.out.print(p + " ");
		System.out.println();
		
		System.out.println("=====3. Arrays.toString()을 사용해서 출력======");
		System.out.println(Arrays.toString(arr1));
		
	}

}
