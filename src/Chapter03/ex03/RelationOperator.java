package Chapter03.ex03;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교 연산 vs 등가 비교 연산자
		
		//1. 크기 비교 연산 ( <, >, <=, >= ) ===> true, false
		System.out.println(5 > 2);	//true
		System.out.println(5 < 2);	//false
		
		System.out.println(5 >= 5);	//true
		System.out.println(5 <= 5);	//true
		
		System.out.println("=====================");
		
		//2. 등가 비교 연산 ( ==, !=)	===> true, false
			// == : 값이 같을때 true, 다르면 false
			// != : 값이 다를때 true, 같으면 false
			//값이 같은지 다른지를 비교하는 연산
			//stack 메모리의 값을 비교
			//stack 에 값이 저장되는 것은 기본 자료형
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println( a == b );	//false
		System.out.println( a != b );	//true
		
		System.out.println( a == c );	//true
		System.out.println( a != c );	//false
		
		System.out.println();
		
		//참조 자료형일때 (Heap 영역에 값이 저장, stack 영역에는 Heap 에 번지 수가 들어있다.
		
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		
			//stack 영역의 값을 비교 : ==
		System.out.println(str1 == str2);	//false
		//str1은 stack영역에 들어가 있고 안녕은 Heap영역에 들어가 있다.
		//여기서 stack안에 안녕이라는 번지도 각각 stack에 다르게들어가 있다.
		//예를들면 str1은 
		//참조자료형은 Heap에 값이 저장됨, ++은 stack영역의 값을 비교함.
		//참조 영역에서 값을 비교 할때 ? .equals()를 사용해서 값을 비교함.
			//Heap 영역의 값을 비교 할때는 .equals() 를 사용해야 한다.
		
			//객체변수1.equals(객체변수2) : Heap 영역의 값을 비교
		System.out.println(str1.equals(str2));
		
		
		
		
		
		
		
		
		
		

	}

}
