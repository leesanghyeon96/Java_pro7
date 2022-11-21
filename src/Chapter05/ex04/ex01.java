package Chapter05.ex04;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// <문제> : 오늘 까지 :
		// 큰 틀을 먼저 만들자
		Scanner sc = new Scanner(System.in);
		//while이나 do while <-루프
		//배열을 인풋받는 변수 선언
		//if 나 switch
		int[] arr1;		//배열 변수 선언
		int n ;			//선택자 (1, 2, 3, 4) 번호를 인풋 받는 변수
		int idx;		//배열의 방의 크기를 스캐너로 인풋 받는 변수
		
		while (true) {
		
		System.out.println("================아래의 목록을 숫자로 선택해주세요.=======================");
		System.out.println("1.인풋 값을 받아서 배열방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 배열방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 뺴고 저장 후 출력");
		System.out.println("3.인풋 값을 받아서 배열방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우 빼고 저장 후 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("===============================================================");
		
		System.out.println(" 1 ~ 4번까지 번호를 입력하세요>>>");
		n = sc.nextInt();
		
		if (n == 1) {
			//1번을 선택시 출력하는 프로그램 작성
			System.out.println("1번 선택 : 배열의 방의 크기를 넣어주세요>>>");
			idx = sc.nextInt();		//배열의 방의 크기를 스캐너로 받아서 idx 변수에 할당
			arr1 = new int[idx];	//arr1 배열 변수의 방의 크기를 지정
			
			//7의 배수와 8의 배수를 저장하는 프로그램을 작성 : for 반복문을 사용해서 처리
			int i = 0;		//배열의 방 번호를 지정하는 변수
			int a;			//7의 배수와 8의 배수를 저장하는 변수
			for ( a = 1; ; a++) {	//조건을 생략(방번호를 알 수 없어하면 무한루프
				if (a % 7 == 0 || a % 8 == 0) {		//7의 배수이거나 8의 배수라면, true일때 아래 블락 실행 -> 값을 저장
					arr1[i] = a;		//배열방에 7의 배수와 8의 배수를 저장
					i++;				//배열의 방의 번호증가는 값이 저장될때만 증가되어야 된다.
				}
				if (i == idx) {		//i = 방번호이고, idx = 인풋받은 방의 갯수
					break;
				}
			}
			/*
			System.out.println("인풋받은 방의 갯수 : " + idx);
			System.out.println("마지막 방번호 : " + i);
			System.out.println("마지막 방번호에 들어간 값 : " + a);
			*/
			//for 문을 사용해서 배열(arr1)에 저장된 값을 출력
			
			System.out.println("1. 7의 배수, 8의 배수 출력됨...");
			for (i = 0 ; i < arr1.length; i++){
				System.out.print(arr1[i] + " ");	//각 방의 번호 출력
			}
			System.out.println();
			
			//System.out.println("100번방의 값 출력 : " + arr1[100]);
			
			
		}else if (n == 2) {
			//2번을 선택시 출력하는 프로그램 작성
			System.out.println("2번 선택 : 배열의 방의 크기를 넣어주세요 >>>");
			//2.인풋 값을 받아서 배열방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 뺴고 저장 후 출력
			idx = sc.nextInt();		//배열 방의 크기
			arr1 = new int[idx];	//스캐너로 받은 값을 방크기로 지정
			
			// for 문을 사용해서 1씩증가 하는데 4의 배수는 배열에 넣지 않고 저장
			int i = 0 ;		//방번호
			int a;		//값을 저장하는 변수
			for(a = 1; ; a++ ) {
				if ( a % 4 == 0) {
					continue;		//continue를 만나면 아래 내용을 실행되지 않고 증가식으로 올라감
				}
				arr1[i] = a ;
				i ++;
				if (i == idx ) {
					break;
				}
			}
			
			//for 문을 사용해서 뱅ㄹ에 들어간 값을 출력
			System.out.println("배열의 값 출력");
			for ( i = 0 ; i <arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
			System.out.println();
			
			
		}else if (n == 3) {
			//3번을 선택시 출력하는 프로그램 작성
			System.out.println("3번 선택 : 방의 크기를 입력하세요 >>>");
			idx = sc.nextInt();
			arr1 = new int[idx];
			
			//3.인풋 값을 받아서 배열방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우 빼고 저장 후 출력
			int i = 0;		//방번호
			int a ;			//3의 배수만 저장하되 6의 배수는 저장하지 않도록
			
			//for 문을 사용해서 값을 저장
			for ( a = 1 ; ; a++ ) {
				if (a % 3 ==0) {			//3의 배수이고
					if ( a % 6 !=0)	{		//6의 배수가 아닐때
						arr1[i] = a;
						i++;
					
					}
				}
				if ( i == idx) {
					break;
				}
				
			}
			
			//for 문을 사용해서 값을 출력
			System.out.println("배열의 내용을 출력");
			for ( i = 0 ; i < arr1.length ; i++ ) {
				System.out.print(arr1[i] + " ");
			}
			System.out.println();
			
			
			
		}else if (n == 4) {
			//4번을 선택시 출력하는 프로그램 작성
			System.out.println("4번 선택");
			break; //4번 선택시 while 빠져나옴
			
		}else {
			//위의 조건이 모두 만족하지 않을때 : 1 ~ 4번 이외의 값이 들어왔을때
			System.out.println(" 1 ~ 4번까지만 입력해주세요");
			
		}
		
		
		
		}
		System.out.println(" 프로그램이 종료되었습니다... ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		
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
<<<<<<< HEAD
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
			
			
=======
			
			
		}
			
			if (select == 2) {
			int a;
			System.out.println("배열방의 크기를 지정하세요.");
			a = sc.nextInt();
			
			int[] arr1 = new int [a];
			for (int i = 0 ; i < arr1.length ; i++) {
				
			}
			
>>>>>>> e646b7fd4a1308ff3c69e512d590c77637bdb254
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
			
<<<<<<< HEAD
		}else if (select ==4){
			System.out.println("4. 프로그램 종료");
			break;
		}else {
			System.out.println("없는 번호입니다.");
		}
		
		
		
		
		}while (true);	
=======
		}
		
		
		int value1;
		int value2;
		int value3;
		int value4;
		
		System.out.println("배열방의 크기를 지정해 주세요.");
		value1 = sc.nextInt();
		System.out.println("배열방의 크기를 지정해 주세요.");
		value2 = sc.nextInt();
		System.out.println("배열방의 크기를 지정해 주세요.");
		value3 = sc.nextInt();
		
	*/	
		//sc.close();

	
	}

}
