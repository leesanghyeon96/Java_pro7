package Chapter08.ex01;

import Chapter08.ex02.Student;
import Chapter07.* ; //주의 : Chapter07의 하위 패키지는 게더링하지 않는다.(ex01같은것)
//Chapter에 있는 class만 게더링함.
import Chapter07.ex01.*;	//이렇게 하면 가능함

//다른 패키지에 존재하는 클래스는 import

public class Package {

	public static void main(String[] args) {
		// 클래스 내부 구성요소 
			//1. 필드 , 2. 생성자 , 3. 메소드 , 4. 이너클래스
		// 클래스 외부 구성요소
			//1. 패키지 , 2. 임포트 , 3. 외부 클래스 
		
			//1. 패키지(package) : 클래스를 조직화해서 관리하는 폴더
				//한 패키지 내의 동일한 이름의 클래스는 올 수 없다.
				//외부에서 클래스를 가지고 오는 경우 기존의 클래스 이름과 동일한 경우
			//2. 임포트 (import) : 다른 패키지의 클래스를 사용 하려 하는 경우 : import
								//임포트할 클래스의 내용은 public이 전부 들어가 있어야 한다.
		
		//Student 클래스의 객체 생성 : 다른 패키지에 존재하는 클래스
			//Chater08.ex02.Student
		
		//기본생성자 호출
		//Student : import 클래스밖에서 해줘야한다.
		Student s1 = new Student();
		s1.print();
		System.out.println();
		
		//매개변수 4개 생성자 호출
		Student s2 = new Student("홍길동" , "1111", 3 , "서울 종로구");
		s2.print();
		
		System.out.println("========================");
		
		
		
		
		//Car 클래스는 import 없이 전체이름(패키지이름.클래스이름)으로 사용
		Chapter08.ex02.Car car1 = new Chapter08.ex02.Car();
		car1.print();
		
		
		System.out.println("==========================");
		//
		Chapter08.ex02.Car car2 = new Chapter08.ex02.Car("삼성자동차","검은색",200);
		car2.print();
		
		
	}

}
