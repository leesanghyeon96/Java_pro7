package Chapter01.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		int value1 = 3+5 ;	//8
		int value2 = 8/5 ;	//1  int/int = int 1.6인데 int값은 1만 출력
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0f + 5.0f ;
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0 ;
		System.out.println(data2);		//1.6
		
		double data3 = 8/5 ;			//int/int = int (1)
		System.out.println(data3);		//1.0
		
		double data4 = 8/5.0 ;		//정수 8이 double형으로 업캐스팅이 일어나서 연산
		System.out.println(data4);		//1.6
		
		//주의 : 평균을 계산할 때 double
		// 8 - int  8.0 - double
		
		System.out.println("======================");
		
		//2. 다른 다료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		//int data5 = 5 + 3.5;	//오류 발생 5가 5.0으로 변하고 높은자료형에서 낮은 자료형이니 (int)를 해준다
		double data6 = 5 + 3.5 ; 	//5.0(업캐스팅 자동으로) + 3.5
		
		int data7 = 5 + (int) 3.5;	//8		
		
		int data8 = (int) (5 + 3.5);	//8 5는 double값으로 바뀜 (int)로 캐스팅
		
		double data9 = 5/2.0;		//정수5가 double형으로 바뀌어서 연산(업캐스팅)
		
		System.out.println(data9);
		
		double data10 = 5/2;		//정수/정수의 값2가 double형식으로 출력
		System.out.println(data10);	//2.0
		
		System.out.println("===========================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) == data11(double)
		System.out.println(data11 + data12);	//50 =>double 50.0+33.33
		//업캐스팅 : data11 (int) == data11(double)
		System.out.println(data11 / data12);	//
		//다운캐스팅 : data12 (double) == data12(int)
		System.out.println(data11 / (int)data12);
		
		//<문제>
		//국어 : 90, 수학 : 88, 영어 : 77, 음악 : 90, 과학 : 99
		//각 과목의 점수를 int 의 변수를 만들어서 저장후 : 합계(sum), 평균(avg) 값을 출력
		int ty1 = 90;
		int ty2 = 88;
		int ty3 = 77;
		int ty4 = 90;
		int ty5 = 99;
		//int sum = ty1 + ty2 + ty3 + ty4 + ty5;
		//double avg = sum / 5.0;           나누기면 .0을 넣자
		// System.out.printlc("합계는 : " + sum);
		// System.out.printlc("평균는 : " + avg);
		System.out.println(ty1 + ty2 + ty3 + ty4 + ty5);
		
		double ty11 = 444;
		double ty12 = 5;
		System.out.println(ty11 / ty12);
		
		
	}

}
