package Chapter07.ex05;

class Student{		//
	//필드 선언
	String stuName;		//학생이름 : 학생이름없음
	int stuNo;			//학번 : 0
	String stuPhone;	//핸드폰번호 : "000-0000-0000"
	String stuAddr;		//주소 : "서울"
	int stuAge;			//나이 : 0
	double stuWeight;	//몸무게 : 0.0
	
	//기본생성자
	Student(){	//기본생성자에서 초기값을 할당 : this() 메소드를 사용해서 각 필드의 값을 적용
		stuName = "학생이름 없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
		
	}
	
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	
	Student(String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	
	Student(String stuName, int stuNo, String stuPhone){
		this(stuName, stuNo);
		this.stuPhone = stuPhone;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr){
		this(stuName, stuNo, stuPhone);
		this.stuAddr = stuAddr;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr,int stuAge){
		this(stuName, stuNo, stuPhone, stuAddr);
		this.stuAge = stuAge;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr,int stuAge,double stuWeight){
		this(stuName, stuNo, stuPhone, stuAddr, stuAge);
		this.stuWeight = stuWeight;
	}
	
	void print() {
		//필드의 내용을 출력
		System.out.println("학생의 이름 : " + stuName);
		System.out.println("학생의 학번 : " + stuNo);
		System.out.println("학생의 전화번호 : " + stuPhone);
		System.out.println("학생의 주소 : " + stuAddr);
		System.out.println("학생의 나이 : " + stuAge);
		System.out.println("학생의 몸무게 : " + stuWeight);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 기본생성자로 호출
		System.out.println("====기본생성자로 호출====");
		Student student1 = new Student();
		student1.print();
		
		// 매개변수 1개로 호출
		System.out.println("====매개변수 1개인 생성자로 호출====");
		Student student2 = new Student("이상현");
		student2.print();
		
		//매개변수 2개로 호출
		System.out.println("====매개변수 2개인 생성자로 호출====");
		Student student3 = new Student("이상현", 15);
		student3.print();
		
		//매개변수 3개로 호출
		System.out.println("====매개변수 3개인 생성자로 호출====");
		Student student4 = new Student("이상현",15,"010-5519-9606");
		student4.print();
		
		//매개변수 4개로 호출
		System.out.println("====매개변수 4개인 생성자로 호출====");
		Student student5 = new Student("이상현",15,"010-5519-9606","서울 송파구 삼전동");
		student5.print();
		
		//매개변수 5개로 호출
		System.out.println("====매개변수 5개인 생성자로 호출====");
		Student student6 = new Student("이상현",15,"010-5519-9606","서울 송파구 삼전동",27);
		student6.print();
		
		//매개변수 6개로 호출
		System.out.println("====매개변수 6개인 생성자로 호출====");
		Student student7 = new Student("이상현",15,"010-5519-9606","서울 송파구 삼전동",27,116.5);
		student7.print();
		
	}

}
