package Chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		// 두 배열의 각 방의 내용을 더해서 출력 하는 메소드 생성
		
		// 배열 a : 4의 배수를 1 ~ 300까지 저장
		System.out.println("=====4의 배수 저장=====");
		int[] a = new int[300/4];
		for(int i = 0,j = 4 ; i < a.length; i++,j+=4) {
			a[i]=j;
		}
		
		//a 배열의 값 출력
		System.out.println(a.length);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		
		// 배열 b : 5의 배수를 1 ~ 300까지 저장
		System.out.println("=====5의 배수 저장=====");
		int[] b = new int[300/5];
		
		for(int i = 0, j =5; i < b.length ; i++, j+=5) {
			if(i <300/4) {
				b[i] = j;
			}
		}
		
		System.out.println(b.length);
		for(int i = 0 ; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		
		
		System.out.println("===index 59 번째 방의 내용 출력 ");
		System.out.println(a[59]);
		System.out.println(b[59]);
												//
		// 두 배열의 각 방의 값을 더해서 출력 
		System.out.println("==arraySum 메소드 호출==");
		arraySum(a, b); 
		
		
		
		
	/*	
		// 두 배열의 각 방의 값을 더해서 출력
		System.out.println("=====두 배열의 각 방의 값을 더해서 출력=====");
		for (int i = 0 ; i < b.length; i++) {
			a[i] = a[i] + b[i];
			System.out.print(a[i] + " ");
		}
	*/	
		
		
		
	}
			//두개의 배열을 인풋 받아서 각 방의 값을 더해서 출력
	// addArray(int[] a, int[] b){
	
	// }
	
	public static void arraySum(int[] a, int[] b){
		int[] c = new int [75];			//c : 두 배열을 인풋받고 같은 방 번호일때 더한 값을 저장하는 변수
		for (int i = 0 ; i < a.length ; i++) {
			for (int j = 0 ; j < b.length ; j++) {
				if ( i >59) {
					c[i] = a[i] ;
				}
				if (i==j) {		//두 방의 index (방번호가 같을때)
					c[i] = a[i] + b[i];
				}
			}
		}										//
	
	
		System.out.println(Arrays.toString(c));	//
	
	
	
/*	
	public static void addArray(int[] a, int[] b){
		for ( int i = 0 ; i<b.length ; i++) {
		
			System.out.print(a[i] + b[i] + " ");
		}
	}
*/	
	
	
	
	
	
	}
}
