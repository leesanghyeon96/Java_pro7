package Chapter05.ex09;

public class ex01 {

	public static void main(String[] args) {
		// <문제>
		/*
		 * 국어 영어 수학 과학 국어 영어 수학 과학 국어 영어 수학 과학 국어 영어 수학 과학 홍길동 70 88 77 99 이순신 80 68 87
		 * 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		 * 
		 * 메인 메소드 args 로 아래와 같은 값이 인풋 되었을 경우 <출력>과 같이 출력해 보세요 args : 홍길동 70 88 77 99 이순신
		 * 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 89 99
		 * 
		 * <for 문을 사용해서 출력하세요>
		 * 
		 * <출력> 국어 영어 수학 과학 <합계> <평균>
		 * ===================================================== 홍길동 70 88 77 99 이순신 80
		 * 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		 * ===================================================== <합계> <평균>
		 */

		// 강사님, 직접 해봐야함
		System.out.println("=== STEP 1 : args 배열로 들어오는 모든 내용 출력 ====");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " "); // argument의 내용을 출력
		}
		System.out.println();
		System.out.println();

		// step 2
		System.out.println("=====STEP 2  : 기본 출력 ========================");
		System.out.println();

		System.out.println("      국어       영어      수학     과학       <합계>      <평균>   ");
		System.out.println("================================================================");
		for (int i = 0; i < args.length; i++) {

			if (i % 5 == 0) { // 5로 나누었을때 0일때 개행
				if (i != 0) { // 0일때는 제외
					System.out.println(); // 엔터
				}
			}

			System.out.print(args[i] + "\t");
			// System.out.print(sum1 + "\t");

		}
		System.out.println();
		System.out.println("=================================================================");
		System.out.println("<합계> : ");
		System.out.println("<평균> : ");

		System.out.println();
		System.out.println();

		// step 3
		System.out.println("=====STEP 3  : 합계 / 평균 계산후 출력  ========================");
		System.out.println();

		int sum1 = 0; // 각 학생들의 점수합계 , 루프 돌아갈때(avg1도 같음)
		double avg1 = 1.0;

		// 아랫 라인의 합계 및 평균 변수 선언
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int sienceSum = 0;
		// for 문 밖에서 사용할 수 있도록 for문 밖에서 선언함
		double korAvg;
		double engAvg = 1.0;
		double mathAvg = 1.0;
		double sienceAvg = 1.0;

		// allSum, allAvg
		int allSum = 0; // 각 합계에 대한 전체합계
		double allAvg; // 각 평균에 대한 전체평균

		System.out.println("      국어       영어      수학     과학       <합계>      <평균>   ");
		System.out.println("================================================================");
		for (int i = 0; i < args.length; i++) {

			if (i % 5 == 0) { // 5로 나누었을때 0일때 개행 , 0일때는 제외
				if (i != 0) {
					System.out.println();
				}
			}

			// sum1, avg1
			if (i % 5 == 0) {
				sum1 = 0;	//합계를 초기화 시켜서 합계찍은후 거기에 더 더해지지 않도록
			}
			if (i % 5 != 0) {
				sum1 += Integer.parseInt(args[i]);
			}
			// avg1 : 합이 모두 구해지면 평균 계산
			if (i == 4 || i == 9 || i == 14 || i == 19) {
				avg1 = sum1 / 4.0;
			}

			// 출력
			System.out.print(args[i] + "\t");
			if (i == 4 || i == 9 || i == 14 || i == 19) {
				System.out.print(sum1 + "\t" + avg1);	
			}

			// 마지막 라인에 라인 삽입
			if (i == args.length - 1) {
				System.out.println();
				System.out.println("=================================================================");
			}

			// 아랫 라인의 합계 및 평균 구하기

			if (i == 1 || i == 6 || i == 11 || i == 16) {
				korSum += Integer.parseInt(args[i]);
			}
			if (i == 2 || i == 7 || i == 12 || i == 17) {
				engSum += Integer.parseInt(args[i]);
			}
			if (i == 3 || i == 8 || i == 13 || i == 18) {
				mathSum += Integer.parseInt(args[i]);
			}
			if (i == 4 || i == 9 || i == 14 || i == 19) {
				sienceSum += Integer.parseInt(args[i]);
			}

			// 전체 합계 (allSum)
			if (i != 0 && i % 5 != 0) {
				allSum += Integer.parseInt(args[i]);
			}

		}

		// 아래 라인에 합계 및 평균 출력
		korAvg = korSum / 4.0;
		engAvg = engSum / 4.0;
		mathAvg = mathSum / 4.0;
		sienceAvg = sienceSum / 4.0;

		allAvg = allSum / 16.0;

		System.out.print("<합계> : ");
		System.out.print(
				korSum + "\t" + engSum + "\t" + mathSum + "\t" + sienceSum + "\t" + allSum + "\t" + allAvg + "\n");
		System.out.print("<평균> : ");
		System.out.print(korAvg + "\t" + engAvg + "\t" + mathAvg + "\t" + sienceAvg + "\n");

		System.out.println();
		System.out.println();

		/*
		 * int g ; //정수로 바꿈 for ( int i = 0 ; i < args.length ; i++) { if ( i % 5 ==0 )
		 * { continue; } g = Integer.parseInt(args[i]); }
		 * 
		 * 
		 * 
		 * 
		 * int sum10; //홍길동 합계, 평균 double avg1 = 0; for ( int i = 1 ; i < 4 ; i++) {
		 * sum10 += Integer.parseInt(args[i]); avg1 = sum10%4; } int sum2= 0; //이순신 합계,
		 * 평균 int avg2 = 0; for ( int i = 6 ; i < 10 ; i++) { sum2 +=
		 * Integer.parseInt(args[i]); avg2 = sum2%4; } int sum3= 0; //김똘똘 합계, 평균 int
		 * avg3 = 0; for ( int i = 11 ; i < 15 ; i++) { sum3 +=
		 * Integer.parseInt(args[i]); avg3 = sum3%4; } int sum4= 0; //홍길순 합계, 평균 int
		 * avg4 = 0; for ( int i = 16 ; i < args[i].length() ; i++) { sum4 +=
		 * Integer.parseInt(args[i]); avg4 = sum4%4; }
		 * 
		 * 
		 * 
		 * int sum5= 0; //국어 합계, 평균 int avg5 = 0; for ( int i = 0 ; i < args.length ;
		 * i++) { if ((i-1)%5 != 0) { continue; } sum5 += Integer.parseInt(args[i]);
		 * avg5 = sum5%4; } int sum6= 0; //영어 합계, 평균 int avg6 = 0; for ( int i = 1 ; i <
		 * 4 ; i++) { if((i-2)%5 !=0) { continue; } sum6 += Integer.parseInt(args[i]);
		 * avg6 = sum6%4; } int sum7= 0; //수학 합계, 평균 int avg7 = 0; for ( int i = 1 ; i <
		 * 4 ; i++) { if((i-3)%5 !=0) { continue; } sum7 += Integer.parseInt(args[i]);
		 * avg7 = sum7%4; } int sum8=0; //과학 합계, 평균 int avg8 = 0; for ( int i = 1 ; i <
		 * 4 ; i++) { if((i-4)%5 !=0) { continue; } sum8 += Integer.parseInt(args[i]);
		 * avg8 = sum8%4; }
		 * 
		 * System.out.println(sum8);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("  " + " 국어 " + "영어 " + "수학 " + "과학 " + "<합계> " +
		 * "<평균> ");
		 * System.out.println("============================================="); for (
		 * int i = 0 ; i < args.length ; i++) {
		 * 
		 * }
		 */
	}

}
