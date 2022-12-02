package Chapter17.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {

		List<Integer> aList1 = new ArrayList();

		// 1. add (E element) : List에 값을 추가할때 : ArrayList, Vector, LinkedList
			// 마지막 방에 값이 들어감.
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);

		System.out.println(aList1); // 3, 4, 5

		// 2. add(int index, E element) : 특전 방번호에 값을 넣는다.
		aList1.add(1, 6); // 방번호 1에 6값을 넣겠다.

		System.out.println(aList1); // 3, 6, 4, 5

		// 3. addAll(다른 리스트객체) : 다른 컬렉션의 모든 내용을 합해서 출력
		List<Integer> aList2 = new ArrayList();
		aList2.add(1);
		aList2.add(2);
		System.out.println(aList2); // 1, 2

		aList2.addAll(aList1); // 1, 2 와 3, 4, 5를 합침
		System.out.println(aList2); // 1, 2, 3, 6, 4, 5

		// 4. addAll(int index, 또 다른 리스트객체)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);
		aList3.add(2);

		System.out.println(aList3); // 1, 2
		aList3.addAll(1, aList3); // 1번방 뒤에 할당
		// 기존 aList3의 1번방의 값이 뒤로 밀리고 새로 넣는 aList3의 내용이 1번방의 자리를 차지함
		System.out.println(aList3); // 1, 1, 2, 2

		// 5. set(int index, E element) : 기존의 방의 값을 수정
		aList3.set(1, 5); // 1번 방의 값을 5로 수정
		System.out.println(aList3); // 1, 5, 2, 2
		aList3.set(3, 6); // 3번 방의 값을 6으로 수정
		System.out.println(aList3); // 1, 5, 2, 6

		// 6. remove(int index) : 특정 방 번호의 값을 삭제
		aList3.remove(1); // 1번방의 값을 삭제
		System.out.println(aList3); // 1, 2, 6

		// 7. remove(Object o) : 방의 들어간 값을 삭제
		aList3.remove(new Integer(2)); // Integer의 작대기 : 경고(앞으로 없어질 가능성을 나타내는 내용)
			//객체타입을 만들어 던져 삭제
		System.out.println(aList3); // 1, 6

		// 8. clear() : 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3); // []

		// 9. isEmpty() : 값이 없으면 : true, 값이 존재하면 : false
		aList3.isEmpty(); // 리턴으로 true, false를 출력하기에 출려구문으로 출력
		System.out.println(aList3.isEmpty()); // true

		// 10. size() : 방의 갯수
		System.out.println(aList3.size()); // 0
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3); // 1, 2, 3
		System.out.println(aList3.size()); // 3

		// 11. get(int index) : 방번호의 값을 가지고 올때 
		System.out.println("0번째 : " + aList3.get(0)); //0번쨰 : 1
		System.out.println("1번째 : " + aList3.get(1)); //1번쨰 : 2
		System.out.println("2번째 : " + aList3.get(2)); //2번쨰 : 3
		
		// 12. toArray() : List ==> Array	(리스트 안의 값을 배열로 변환)
		Object[] obj = aList3.toArray();	// =>Object배열로 변환 (Object타입)
		
		//배열의 값을 출력 : Arrays.toString
		System.out.println(Arrays.toString(obj));	//1, 2, 3  
		
		
		//13. toArray(T[] t) ==> T[]	: 리스트 ==> 배열
		Integer[] int1 = aList3.toArray(new Integer[0]);	//0 : 방의 개수
			//Object타입을 Integer타입으로
			//0 : 변환한 배열방의 개수인데, 컬렉션의 배열방보다 작게 설정된 경우 컬렉션에 저장된것에 맞추어서 처리됨
		System.out.println(Arrays.toString(int1));	//1, 2, 3
		
		Integer[] int2 = aList3.toArray(new Integer[5]);	//Integer타입으로 배열방 5개로 저장해라
		System.out.println(Arrays.toString(int2));	//1, 2, 3, null, null
		
		
		
		
		
		
		
		
		
	}

}
