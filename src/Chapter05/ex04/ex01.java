package Chapter05.ex04;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// <문제> : 오늘 까지 :
		
		System.out.println("================아래의 목록을 숫자로 선택해주세요.=======================");
		System.out.println("1.인풋 값을 받아서 배열방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 배열방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 뺴고 저장 후 출력");
		System.out.println("3.인풋 값을 받아서 배열방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우 빼고 저장 후 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("===============================================================");
		
		Scanner sc = new Scanner(System.in);
		int idx;
		int select;
		System.out.println();
		select =sc.nextInt();
		
		do {
			
		
		
		
		if (select == 1) {
			System.out.println("배열방의 크기를 지정하세요.");
			idx = sc.nextInt();
			
			int i = 0; 		
			int[] arr1 = new int[idx]; 

			for ( int a = 1 ; a < arr1.length ; a++) { 
				if ( a % 7 == 0 || a % 8 ==0) {
					arr1[i] = a;
					i++; 			
				}
				if ( i > arr1.length-1 ) {
				}
			}	
			for ( i = 0 ; i < arr1.length ; i++) {
				System.out.print( arr1[i] + " ");
			}
			
			
			System.out.println();
			
			
			
			
		} else if (select ==2){
			
			System.out.println("배열방의 크기를 지정하세요.");
			idx = sc.nextInt();
			int[] arr1 = new int[idx];
			int[] arr2 = new int[idx];
			pos2: for ( int i = 0 ; i<arr1.length; i++) {
				arr1[i] = i + 1;
					for (int i = 0,j = 4; i<arr2.length; i++,j+=4) {
						arr2[i] = j;
					}
					
						if (arr1[i]==j) {
							continue pos2;				
						}
						
					}
			for( int i = 0 ; i<arr1.length;i++) {
				System.out.print(arr1[i] + " ");
			}
			
			
		}else if(select ==3){
				System.out.println("배열방의 크기를 지정해주세요.");
				idx = sc.nextInt();
				
				int[] arr1 = new int[idx];
				int[] arr2 = new int[idx];
				pos1 : for(int i = 0,j=6 ; i < arr1.length; i++,j+=6) {
					arr1[i] = (i + 1)*3;
					arr2[i] = (i + i)*6;
					if(arr1==arr2) {
						continue pos1;
						
					}
			for(int a = 0 ; i < arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
		} 
			
		}else if (select ==4){
			System.out.println("4. 프로그램 종료");
			break;
		}else {
			System.out.println("없는 번호입니다.");
		}
		
		
		
		
		}while (true);	
	
	}

}
