package Chapter05.ex06;

import java.util.Arrays;

public class ex01 {

	public static void main(String[] args) {
		// 
		
		int[][] arr1 = new int[][] { {10,20,30,40,50} , {11,12,13,14,15} , {111,112,113,114,115} };
		
		// 1. 2중 for문을 사용해서 2차원 배열의 값을 출력
		System.out.println("==For 문을 사용해서 출력==");
			for ( int i = 0 ; i < arr1.length ; i++ ) {	//i : 행의 방번호, arr1.length : 행의 갯수
				for (int j = 0 ; j < arr1[i].length ; j++) {	//j : 열의 방번호, arr1[i].length : 열의 갯수
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			}
		
		
		
		
		
		// 2. 향상된 For 문을 사용해서 출력 *
		System.out.println("==향상된 For 문을 사용해서 출력==");
			for( int[] arr2 : arr1) {	//arr1 = 2차원 배열 
				//-> 2차원 배열의 첫행을 arr2에 담고 arr2는 1차원 배열이므로 그 행의 열을 k로 각각 넣고 엔터 후 다음 행으로 넘어감
				//밖의 for문은 배열 행 자체를 가져옴
				for ( int k : arr2) {
					System.out.print( k + " ");
				}
				System.out.println();
			}
		
		
		
		
		
		// 3. Arrays.toString()을 사용해서 출력 : 1차원 배열의 값을 출력
		System.out.println("==Arrays.toString() 문을 사용해서 출력==");
			for ( int[] arr3 : arr1 ) {	//행 자체를 가져옴 , arr3 는 임의로 넣어줘도 된다.
				System.out.println(Arrays.toString(arr3));	//1차원 행의 값을 출력
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
