package Chapter05.ex09;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class ex01 {

	public static void main(String[] args) {
		// <문제>
		/*
		국어	영어	수학	과학			국어	영어	수학	과학			국어	영어	수학	과학			국어	영어	수학	과학
홍길동	70	88	77	99	이순신	80	68	87	79	김똘똘	60	86	87	30	홍길순	77	56	80	99
		
메인 메소드 args 로 아래와 같은 값이 인풋 되었을 경우 <출력>과 같이 출력해 보세요
args : 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 89 99		
		
<for 문을 사용해서 출력하세요>

<출력>
		국어		영어		수학		과학		<합계>	<평균>
=====================================================
홍길동	70		88		77		99		
이순신	80		68		87		79		
김똘똘	60		86		87		30		
홍길순	77		56		80		99		
=====================================================		
<합계>
<평균>
	*/	
		int g ;												//정수로 바꿈
		for ( int i = 0 ; i < args.length ; i++) { 
			if ( i % 5 ==0 ) {
				continue;
			}
			g = Integer.parseInt(args[i]); 	
		}
		
		
		
		
		int sum10;			//홍길동 합계, 평균
		double avg1 = 0;
		for ( int i = 1 ; i < 4 ; i++) {
	//		sum10 += Integer.parseInt(args[i]);
	//		avg1 = sum10%4;
		}
		int sum2= 0;			//이순신 합계, 평균
		int avg2 = 0;
		for ( int i = 6 ; i < 10 ; i++) {
			sum2 += Integer.parseInt(args[i]);
			avg2 = sum2%4;
		}
		int sum3= 0;			//김똘똘 합계, 평균
		int avg3 = 0;
		for ( int i = 11 ; i < 15 ; i++) {
			sum3 += Integer.parseInt(args[i]);
			avg3 = sum3%4;
		}
		int sum4= 0;			//홍길순 합계, 평균
		int avg4 = 0;
		for ( int i = 16 ; i < args[i].length() ; i++) {
			sum4 += Integer.parseInt(args[i]);
			avg4 = sum4%4;
		}
		
		
		
		int sum5= 0;			//국어 합계, 평균
		int avg5 = 0;
		for ( int i = 0 ; i < args.length ; i++) {
			if ((i-1)%5 != 0) {
				continue;
			}
			sum5 += Integer.parseInt(args[i]);
			avg5 = sum5%4;
		}
		int sum6= 0;			//영어 합계, 평균
		int avg6 = 0;
		for ( int i = 1 ; i < 4 ; i++) {
			if((i-2)%5 !=0) {
				continue;
			}
			sum6 += Integer.parseInt(args[i]);
			avg6 = sum6%4;
		}
		int sum7= 0;			//수학 합계, 평균
		int avg7 = 0;
		for ( int i = 1 ; i < 4 ; i++) {
			if((i-3)%5 !=0) {
				continue;
			}
			sum7 += Integer.parseInt(args[i]);
			avg7 = sum7%4;
		}
		int sum8=0;			//과학 합계, 평균
		int avg8 = 0;
		for ( int i = 1 ; i < 4 ; i++) {
			if((i-4)%5 !=0) {
				continue;
			}
			sum8 += Integer.parseInt(args[i]);
			avg8 = sum8%4;
		}
		
		System.out.println(sum8);
		
		
			
		
		
		
		
		
		
		
		System.out.println("  " + " 국어 " + "영어 " + "수학 " + "과학 " + "<합계> " + "<평균> ");
		System.out.println("=============================================");
		for ( int i = 0 ; i < args.length ; i++) {
			 
		}
		
		
		
		
		
		
		
	/*		
			if (i < 5) {
				System.out.print(args[i] + "  ");
			}else if ( i <10) {
				System.out.print(args[i] + "  ");
			}else if ( i < 15) {
				System.out.print(args[i] + "  ");
			}else if ( i <=19) {
				System.out.print(args[i] + "  ");
			}
		}
	*/	
		
		
		
		
	/*	
		
		int sum1 = 0;		//홍길동 점수 합계
		int sum2 = 0;		//이순신 점수 합계
		int sum3 = 0;		//김똘똘 점수 합계
		int sum4 = 0;		//홍길순 점수 합계
		
		int sum5 = 0;		//국어 점수 합계
		int sum6 = 0;		//영어 점수 합계
		int sum7 = 0;		//수학 점수 합계
		int sum8 = 0;		//과학 점수 합계
		
		
		
		for (int i =0 ; i < args.length ; i++) {
			 
				int q = Integer.parseInt(args[i]);
					sum1 += q;
			 }else if(i <10) {
				int w= Integer.parseInt(args[i]);
					sum2 += Double.parseDouble(args[i]);
			 }else if(i <15) {
				int e = Integer.parseInt(args[i]);
					sum3 += Double.parseDouble(args[i]);
			 }else if (i<args.length) {
				int r = Integer.parseInt(args[i]);
					sum4 += Double.parseDouble(args[i]);
			 }
			
			 System.out.println(sum1);
		}
		
			
			
			
		
		
		
		
		
		
		
		
		
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
