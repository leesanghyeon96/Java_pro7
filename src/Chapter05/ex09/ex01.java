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

		// 정수로 바꿈
		for (int i = 0; i < args.length; i++) {
			if (i % 5 == 0) {
				continue;
			}
			Integer.parseInt(args[i]);
		}

		int sum1 = 0; // 홍길동 합계, 평균
		double avg1 = 0;
		for (int i = 1; i < 5; i++) {
			sum1 += Integer.parseInt(args[i]);
			avg1 = sum1 / 4;
		}

		int sum2 = 0; // 이순신 합계, 평균
		double avg2 = 0;
		for (int i = 6; i < 10; i++) {
			sum2 += Integer.parseInt(args[i]);
			avg2 = sum2 / 4;
		}

		int sum3 = 0; // 김똘똘 합계, 평균
		double avg3 = 0;
		for (int i = 11; i < 15; i++) {
			sum3 += Integer.parseInt(args[i]);
			avg3 = sum3 / 4;
		}

		int sum4 = 0; // 홍길순 합계, 평균
		double avg4 = 0;
		for (int i = 16; i < 20; i++) {
			sum4 += Integer.parseInt(args[i]);
			avg4 = sum4 / 4;
		}

		int sum5 = 0; // 국어 합계, 평균
		double avg5 = 0;
		for (int i = 0; i < args.length; i++) {
			if ((i - 1) % 5 != 0) {
				continue;
			}
			sum5 += Integer.parseInt(args[i]);
			avg5 = sum5 / 4;
		}

		int sum6 = 0; // 영어 합계, 평균
		double avg6 = 0;
		for (int i = 1; i < args.length; i++) {
			if ((i - 2) % 5 != 0) {
				continue;
			}
			sum6 += Integer.parseInt(args[i]);
			avg6 = sum6 / 4;
		}
		int sum7 = 0; // 수학 합계, 평균
		double avg7 = 0;
		for (int i = 1; i < args.length; i++) {
			if ((i - 3) % 5 != 0) {
				continue;
			}
			sum7 += Integer.parseInt(args[i]);
			avg7 = sum7 / 4;
		}
		int sum8 = 0; // 과학 합계, 평균
		double avg8 = 0;
		for (int i = 1; i < args.length; i++) {
			if ((i - 4) % 5 != 0) {
				continue;
			}
			sum8 += Integer.parseInt(args[i]);
			avg8 = sum8 / 4;
		}

		System.out.println("===========");
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
		System.out.println(sum8);

		System.out
				.println("\t" + " 국어 " + "\t" + "영어 " + "\t" + "수학 " + "\t" + "과학 " + "\t" + "<합계> " + "\t" + "<평균> ");
		System.out.println("=====================================================");
		System.out.println(args[0] + "\t" + args[1] + "\t" + args[2] + "\t" + args[3] + "\t" + args[4] + "\t" + sum1
				+ "\t" + avg1);
		System.out.println(args[5] + "\t" + args[6] + "\t" + args[7] + "\t" + args[8] + "\t" + args[9] + "\t" + sum2
				+ "\t" + avg2);
		System.out.println(args[10] + "\t" + args[11] + "\t" + args[12] + "\t" + args[13] + "\t" + args[14] + "\t"
				+ sum3 + "\t" + avg3);
		System.out.println(args[15] + "\t" + args[16] + "\t" + args[17] + "\t" + args[18] + "\t" + args[19] + "\t"
				+ sum4 + "\t" + avg4);
		System.out.println("=====================================================");
		System.out.println("합계" + "\t" + sum5 + "\t" + sum6 + "\t" + sum7 + "\t" + sum8);
		System.out.println("평균" + "\t" + avg5 + "\t" + avg6 + "\t" + avg7 + "\t" + avg8);

	}

}
