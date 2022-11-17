package Chapter05.ex06;

import java.net.MulticastSocket;
import java.util.Arrays;

public class ex02 {

	public static void main(String[] args) {
		// <문제>
		/*
			2차원 배열 변수 : arr1
			arr1[0]		<== 2의 배수만 저장
			arr1[1]		<== 5의 배수만 저장
			arr1[2]		<== 3의 배수와 8의 배수를 저장
			arr1[3]		<== 1부터 1씩 증가하는데 7의 배수는 저장하지 않도록 저장
			
			행의 갯수 : 4
			열의 갯수 : 100 
			
			1. for 문으로 출력, 2. Enhanced For, 3. Arrays.toString()
			
		 */
		
		
		int [][] arr1 = new int[4][100];
		
		for (int i = 0 ; i < arr1.length ; i++ ) {
			if (i == 0) {
				for ( int j = 0 , a = 1; j < arr1[i].length ; a++) {
					if ( a % 2 == 0 ) {
						arr1[i][j] = a;
						j++;
					}
				}
				
				
			}else if (i == 1) {
				for (int j = 0 ,a = 1 ; j < arr1[i].length ; a++) {
					if ( a % 5 ==0) {
						arr1[i][j] = a;
						j++;
					}
				}
				
				
			}else if (i == 2) {
				for (int j=0 ,a = 1 ; j < arr1[i].length ; a++) {
					if (a%3==0 || a%8==0) {
						arr1[i][j] = a;
						j++;
					}
				}
				
				
			}else if (i == 3) {
				for ( int j = 0, a = 1 ;j< arr1[i].length ; a++) {
					if (a%7==0) {
						continue;
					}
					arr1[i][j] =a;
					j++;
				}
				
				
			}
			
			
			
		}
		for ( int i = 0 ; i < arr1.length; i++){
			for ( int j = 0 ; j < arr1[i].length; j++) {
			System.out.print(arr1[i][j] + " ");
		}
		
		for ( int[] a : arr1) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for ( int i =0 ; i < 4 ; i++ ) {
//			
//			if( i == 0 ) {
//				
//				for (int j = 0 ; j < arr1[i].length ; j++) {
//					if ( j % 2 ==0)
//						arr1[i][j] = j ;
//					
//					
//				}
//				System.out.print(arr1[i] + " ");
//				System.out.println();
//				
//			}else if ( i == 1 ) {
//				for ( int p = 0 ; p < arr1[i].length ; p++) {
//					for (int z = 5 ; z < arr1[i].length ; z+=5) {
//						arr1[i][p] = z;
//					}
//					
//				}
//				System.out.print(arr1[i] + " ");
//				System.out.println();
//				
//			}else if ( i == 2 ) {
////				int z =0;
////				for ( int q = 0 ; q < arr1[i].length ; q++) {
////					
////					if (q % 3 == 0 || q % 8 == 0) {
////						
////						arr1[i][z] = q;
////						z++;
////					
////				}
////				System.out.print(arr1[i][q] + " ");
////				System.out.println();
////				
////				}
//			}else  {
////				for ( int t = 0 ; t < arr1[i].length ; t++) {
//////					if (t % 7 != 0) {
//////						arr1[i][t] =t; 
//////					}
////				}
////				System.out.println(arr1[i] + " ");
////				
//			}
//			
//		}
			
			
			
//			강사님
//		for (int i = 0 ; i < arr1.length; i++) {
		
//			if ( i==0) {
//				for ( int j = 0, a = 1; j < arr1[i].length; a++) {
//					if (a %2==0) {
//						arr1[i][j] = a;
//						j++;
//					}
//				}
//			}else if(i ==1){
//				for ( int j = 0, a = 1; j < arr1[i].length; a++) {
//					if (a %5==0) {
//						arr1[i][j] = a;
//						j++;
//					}
//				}
//			}else if(i==2) {
//				for ( int j = 0, a = 1; j < arr1[i].length; a++) {
//					if (a %2==0 || a%8==0) {
//						arr1[i][j] = a;
//						j++;
//					}
//				}
//			}else if(i==3) {
//				for ( int j = 0, a = 1; j < arr1[i].length; a++) {
//					if (a %7==0) {
//						continue ;
//					}
//					arr1[i][j] = a;
//					j++;
//				}
//			
//				
//			}
//			
//			
//			
//			
//		}
//		
//		System.out.println("==for=======");
//		for ( int i = 0 ; i < arr1.length; i++){
//			for ( int j = 0 ; j < arr1[i].length; j++) {
//			System.out.print(arr1[i][j] + " ");
//		}
//	System.out.println();
//		}
//	System.out.println("==Enhanced=======");
//	for ( int[] a : arr1) {
//		for (int b : a) {
//			System.out.print(b + " ");
//		}
//		System.out.println();
//	}
//	
//	System.out.println("=Arrays========");
//	for ( int[] a : arr1) {
//		System.out.println(Arrays.toString(a));
//	}
//		
//		
		
		
	}

}
}