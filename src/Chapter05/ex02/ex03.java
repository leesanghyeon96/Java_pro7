package Chapter05.ex02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방의 갯수를 인풋 받습니다.
		// 배열 변수 : arr1, 2의 배수를 저장 후 출력 , enhanced for 문을 사용해서 출력
		// 배열 변수 : arr2, 3의 배수를 인풋 받아서 출력 , for 문을 사용해서 출력
		// 	arr1.length	
		
		
		Scanner sc = new Scanner(System.in);
		
		int idx;
		
		
		System.out.println("두번째 방의 갯수를 입력해주세요.");
		idx = sc.nextInt();
		
		
		int[] arr1 = new int[idx];	//2의배수
		int[] arr2 = new int[idx];	//3의배수
		
		for(int i = 0, j =1; i < arr1.length; i++,j++ ) {
			if( j%2!=0) {
				continue;
				
			}
			arr1[i] = j;
		}
		
		for(int i= 0 ; i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
		
		
		
		
		
		
		
		
	/*	
		
		//아래 최종
		int [] arr1 = new int[5];
		
			for ( int i = 0 ; i < arr1.length ; i++ ) {
				arr1[i] = (i + 1) * 2;
			}
		
			for ( int t: arr1) {
				System.out.print(t + " ");
			}
		
		System.out.print("\n");
		
		
		int [] arr2 = new int[b];
		
			for (int i = 0 ; i < arr2.length ; i++) {
				arr2[i] = (i + 1) * 3;
			}
		
			for (int i = 0 ; i < arr2.length ; i++) {
				System.out.print(arr2[i] + " ");
			}
		
	*/	
			
			
			
		
		//강사님	
	/*	int idx;       //방의 갯수를 지정받는 변수
		
		System.out.println("방의 갯수를 넣어주세요>>>>");
		idx = sc.nextInt();
		
		int [] arr1 = new int[idx];		//2의 배수 저장
		int [] arr2 = new int[idx];		//3의 배수 저장
		
			//arr1 (2의 배수), arr2 (3의 배수)	배열 변수에 값 저장
		for (int i = 0 , j = 2 ; i < arr1.length ; i++ , j+= 2) {
			arr1[i] = j;
		}
		for (int i = 0 , j = 3 ; i < arr2.length ; i++ , j+= 3) {
			arr2[i] = j;
		}
		
		System.out.println("==enhanced for 문을 사용해서 2의 배수 출력 : arr1==");
		
		for ( int k : arr1) {
			System.out.print(k + " ");
		}
		
		
		System.out.println();
	*/	
	/*	
		System.out.println("==for 문을 사용해서 3의 배수 출력 : arr2==");
		for (int p = 0 ; )
	*/	
		
		
	/*	
		
		
		int a;
		int b;
		
		System.out.println("첫번째 방의 갯수를 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 방의 갯수를 입력해주세요.");
		b = sc.nextInt();
		
		int [] arr1 = new int[a];
			for (int i = 0 ; i < arr1.length ; i++) {
				arr1 [i] = (i + 1)*2;
			}
		
			for (int p : arr1) {
				System.out.print(p + " ");
			}
		
		int [] arr2 = new int[b];
			for (int i = 0 ; i < arr2.length ; i++) {
				arr2[i] = (i + 1) * 3;
			}
		
			for (int t : arr2) {
				System.out.print(t + " ");
			}
		
	*/	
		
		
		
		
		
		

	}

}
