package Chapter05.ex04;

public class PrimaryDatatype_VS_ReferenceDataType {

	public static void main(String[] args) {
		// 기본 데이터 타입과 참조 데이터 타입의 비교.
		
		//1. 기본 데이터 타입에서 대입 연산 ( Stack 값을 복사 )
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		
		System.out.println(value1);	//3
		System.out.println(value2);	//3 ==> 7
		
		System.out.println("==========================");
		
		//2. 참조 데이터 타입에서 대입 연산 ( *Stack의 값(Heap 영역의 주소) 을 복사* ), 
		int[] arr1 = new int[] { 3,4,5};
		int[] arr2 = arr1;		//Heap 영역에 값을 복사하는 것이 아니라 arr1의 Stack의 주소를 복사
		arr1[0] = 7;
		
		
		System.out.println(arr1[0]);	//7
		System.out.println(arr2[0]);	//7
		//기본데이터타입은 value2만 변하는데 참조데이터타입은 둘다 바뀜
		
		System.out.println("==========================");
		
		//객체의 Heap 영역의 주소 출력 : String 은 예외 <== 객체를 출력하면 객체의 값이 출력
		System.out.println(arr1);	//Heap 영역의 16진수의 Hash Code <== 메모리 주소값
		System.out.println(arr2);	//두 메모리 주소가 같다.
		
	}

}
