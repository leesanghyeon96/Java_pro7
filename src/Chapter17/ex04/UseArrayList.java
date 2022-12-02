package Chapter17.ex04;

import java.util.ArrayList;

class Student {
	String name;
	int stuID;
	
	//생성자를 사용해서 값을 인풋받아 메모리에 할당
	Student(String name, int stuID){
		this.name = name;
		this.stuID = stuID;		
	}
	
	//toString() 재정의 : 객체 자체를 출력할때 객체 주소가 출력되지 않고 메모리의 값을 출력
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
	
	
}

public class UseArrayList {

	public static void main(String[] args) {

		//ArrayList 에 저장될 객체는 Student 객체가 저장됨
		ArrayList<Student> a1 = new ArrayList();	//a1 : 컬렉션(ArrayList)
		
		
		//Student 객체를 생성(a1에 넣을)(값을 인풋시킴)
		Student s1 = new Student("홍길동", 1111);
		Student s2 = new Student("이순신", 2222);
		Student s3 = new Student("강감찬", 3333);
		
		//생성된 Student객체를 ArrayList 컬렉션에 저장
		a1.add(s1);	//0번방
		a1.add(s2);	//1번방
		a1.add(s3);	//2번방
		
		//컬렉션의 내용을 순환하면서 출력
		//1. for 문을 사용해 출력
		System.out.println("=====For문을 사용해 출력============");
		for (int i = 0 ; i < a1.size() ; i++){	//배열 : length , 컬렉션 : size()
			Student ss1 = a1.get(i);	//get()를써서 방의 객체를 호출
			System.out.println(ss1);
		}
		/*	=> 출력
		 *  Student [name=홍길동, stuID=1111]
			Student [name=이순신, stuID=2222]
			Student [name=강감찬, stuID=3333]
		 */
		System.out.println("=====Enhanced For 문을 사용해 출력===========");
		//2. Enhanced For 문을 사용해 출력
		for(Student k : a1) {		//k : 객체
			System.out.println(k);
		}
		/*	=> 출력
		 *  Student [name=홍길동, stuID=1111]
			Student [name=이순신, stuID=2222]
			Student [name=강감찬, stuID=3333]
		 */
		System.out.println("=====컬렉션 자체를 ==============");
		//모든 컬렉션은 컬렉션 객체를 출력시 컬렉션에 들어간 값을 출력 (toString 오버라이딩을 했기에)
		//컬렉션에서 toString()재정의 해놨음
		
		System.out.println(a1);		//a1 : 컬렉션
		System.out.println(a1.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
