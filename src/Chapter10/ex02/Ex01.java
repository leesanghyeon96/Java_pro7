package Chapter10.ex02;

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human{
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student{
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2는 음식을 맛있게 먹습니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습
		//1. Student 클래스를 생성하면서 Human 타입으로 지정		: h1
		//2. Student 클래스를 생성하면서 Student 타입으로 지정	: s1
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정		: h2
		//4. Student2 객체를 생성하면서 Student 타입으로 지정		: s2
		//5. Student2 객체를 생성하면서 Student2 타입으로 지정	: s3
		
		
		//1. Student 클래스를 생성하면서 Human 타입으로 지정		: h1	
		Student h1 = new Student();
		System.out.println(h1 instanceof Human);
		Student h1 = new Human();
		
		
		
		
		
		
		
		
		//2. Student 클래스를 생성하면서 Student 타입으로 지정	: s1
		Student s1 = new Student();				//Human과 Student클래스 둘 다 사용
		System.out.println(s1 instanceof Student);
		s1.name = "홍길동";
		s1.age = 15;
		s1.stuID = "ㅇㅇ";
		s1.eat();
		s1.stuEat();
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.stuID);
		System.out.println("==========");
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정		: h2	업캐스팅시 오류남
	//	Student2 h2 = (Student2) new Human();		
	//	System.out.println(h2 instanceof Human);
		
		//4. Student2 객체를 생성하면서 Student 타입으로 지정		: s2
		Student2 s2 = (Student2) new Student();	//Human, Student, Student2 다 사용
		s2.name = "홍길동2";
		s2.age = 16;
		s2.stuID = "ㅇㅇ";
		s2.stu2ID = "oo2";
		s2.eat();
		s2.stuEat();
		s2.stu2Eat();
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.stuID);
		System.out.println(s2.stu2ID);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
