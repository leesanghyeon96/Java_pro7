package Chapter05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/*
		 자료형 : 변수를 선언시 변수에 할당할 값을 정의
		 	- 기본 자료형 : boolean, byte, short, int, long, float, double, char
		 		- 메모리의 Stack 공간에 변수와 값이 저장됨
		 	- 참조 자료형 : 배열, 열거, 클래스/인터페이스 ...
		 		- 메모리의 Stack 공간에 변수명과 참조주소 (Heap 영역의 주소)
		 		- 변수에 들어갈 값을 Heap 영역에 저장
		 변수 - 변수에는 하나의 값만 저장됨
		 	 - 초기값을 할당 후 변수를 사용.
		 배열 - 하나의 배열 변수에 많은 값을 저장 할 수 있다.
		 	- 배열의 특징(알아두자, 나중 컬렉션과 비교) : 1. 배열변수의 동일한 자료형의 값만 저장할 수 있다. (int, long, double)
		 				2. 배열은 방의 갯수가 정의되면 수정이 불가능
		 	- 배열의 초기값을 할당하지 않더라도 강제로 초기 값이 할당됨.
		 	- Heap 공간에 값이 반드시 할당되어 있어야 한다.
		 		boolean (flase,기본값으로 할당됨), 정수[byte, short, int, long] (0, 초기 기본값으로 할당됨), 실수 [float, double] (0.0)
		 */
		System.out.println("=======변수===============");
		//1. 변수 - 선언과 동시에 값을 할당
		int a = 10;
		
		//2. 변수 - 선언 이후 값을 할당
		int b;	//선언
		b = 20;	//값 할당
		
		// 변수를 선언 후 초기값을 할당하지 않고 사용하면 오류 발생
		int c;
		int d;
//		int sum= c+ d;	//c, d 변수에 초기 값을 넣지 않고 사용했으므로 오류 발생
		
		System.out.println("========배열===============");
		//1. 배열 선언 1 방법
		int [] array1 = new int[3];		//배열을 선언과 동시에 방의 크기를 지정
		//int[] : 정수값만 배열에 저장 가능
		//array1 : 배열 변수, array1의 변수명은 Stack공간에 저장되고 , array1의 Heap 영역의 주소 값이 저장
		//new : Heap 영역에 값을 저장해라
		//int[3] : Heap 영역에 저장할 방의 갯수를 지정
		//Heap영역의 방번호 index1, index2, index3
		//index : 방의 번호, 0,1,2, ... 0번부터 시작
		
			// 배열에 값 할당
			array1[0] = 55;		//array1의 Heap 영역의 주소 0 번째 방에 55를 넣어라
			array1[1] = 66;		
			array1[2] = 77;
			//배열의 값 출력
			System.out.println(" 0 번째 방의 값 : " + array1[0]);
			System.out.println(" 1 번째 방의 값 : " + array1[1]);
			System.out.println(" 2 번째 방의 값 : " + array1[2]);
		
		int [] array2 ;			//배열 변수 선언
		array2 = new int[5];	//배열 변수에 들어갈 방의 갯수 지정, index ; 0 ~ 4
			//array2 배열 변수에 값을 넣고 출력
		array2[0] = 11;
		array2[1] = 22;
		array2[2] = 17;
		array2[3] = 15;
		array2[4] = 10;
		System.out.println(" 0 번째 방의 값 : " + array2[0]);
		System.out.println(" 0 번째 방의 값 : " + array2[1]);
		System.out.println(" 0 번째 방의 값 : " + array2[2]);
		System.out.println(" 0 번째 방의 값 : " + array2[3]);
		System.out.println(" 0 번째 방의 값 : " + array2[4]);
		
		System.out.println("========배열 : 1. 선언 방법 2 ===============");
		
		// 배열 선언과 방 크기 할당
		int array3 [] = new int [4];	//index : 0, 1, 2, 3
		
		//배열 바엥 값 넣기
		array3[0] = 10;
		array3[1] = 20;
		array3[2] = 30;
		array3[3] = 40;
	//	array3[4] = 50;		//->오류 : 예외 발생
								// - 컴파일시 오류 : 이클립스에서 자동으로 오류를 출력해줌
								// - 실행시 오류가 발생 : 예외처리
		
		//배열의 값을 출력 하기
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
	//	System.out.println(array3[4]);		오류발생 : 실행시 오류 발생
		
		//선언과 방번호를 분리해서 정의
		int array4[];
		array4 = new int[5];
		
		System.out.println("========배열 : 1. 선언 방법 3================");
		// 배열 선언과 동시에 값 할당   ->방크기 설정하면 오류가 발생함
		int [] array5 = new int[] { 10,20,30,40,50 }; 
		//-> index0 = 10, index1 = 20, index2 = 30, index3 = 40, index4 = 50, 
	//	int [] array6 = new int[5] { 10,20,30,40,50 }; 
			//오류 발생 : 선언과 동시에 배열 변수에 값을 할당할때 방크기를 지정하면 오류 발생
		
		array5[3] = 77; //-> 초기값 수정
		
		System.out.println(array5[0]);
		System.out.println(array5[1]);
		System.out.println(array5[2]);
		System.out.println(array5[3]);
		System.out.println(array5[4]);
		
		//배열을 선언 후 값 할당.
		int[] array7;
		array7 = new int[] {100,200,300,400,500,600};
		
		System.out.println(array7[0]);
		System.out.println(array7[1]);
		System.out.println(array7[2]);
		System.out.println(array7[3]);
		System.out.println(array7[4]);
		System.out.println(array7[5]);
	//	System.out.println(array7[6]); ->오류 발생
		//ArrayIndexOutOfBoundsException : 배열의 방의 크기를 넘어가면 발생되는 오류
		
		System.out.println("========배열 : 1. 선언 방법 4================");
		
		//배열 선언과 동시에 값 할당 : 선과 값할당 분리시 오류 발생
		int[] array8 = {11,22,33,44,55};
		
		System.out.println(array8[0]);
		System.out.println(array8[1]);
		System.out.println(array8[2]);
		System.out.println(array8[3]);
		System.out.println(array8[4]);
		
		// 선언과 값을 분리시 오류 발생
		int [] array9;
	//	array9 = {111,222,333,444,555};		오류 발생
		
		
		
		
		
	}

}
