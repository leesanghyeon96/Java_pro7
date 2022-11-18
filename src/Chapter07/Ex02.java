package Chapter07;

class Student {
	
	//필드선언
	String stuName;	 	//학생이름
	int stuNum;			//학번을 저장
	String stuAddr;		//학생의 주소
	String stuPhone;	//학생의 전화번호
	double weight;		//학생의 몸무게
	
	//생성자 오버로딩 
	//	기본생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	
	//1. 기본생성자
	Student () {
		
	}
	
	//2. 매개변수 3개인 생성자
	Student (String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
	}
	
	//3. 매개변수 5개인 생성자
	Student (String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	}
	
	//필드의 값을 출력하는 메소드 void print (){필드의 값을 출력}
	void print() {
		System.out.println("학생의 이름은 : " + stuName);
		System.out.println("학생의 학번은 : " + stuNum);
		System.out.println("학생의 주소는 : " + stuAddr);
		System.out.println("학생의 전화번호는 : " + stuPhone);
		System.out.println("학생의 몸무게는 : " + weight);
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		
		System.out.println("=== 1. 기본생성자로 객체생성 ===");
		Student student1 = new Student();
		student1.print();
		
		System.out.println("=== 2. 매개변수 3개로 호출 ===");
		Student student2 = new Student("이상현",22,"서울 송파 삼전");
		student2.print();
		
		System.out.println("=== 3. 매개변수 5개로 호출 ===");
		Student student3 = new Student("이상현",22,"서울 송파 삼전","010-5519-9606",118.2);
		student3.print();
		
	}

}
