package Chapter10.ex10;

import java.util.Objects;

class C {
	
	String stuID;
	String name;
	int age;
	
	//c1.equals(c2)  //stuID 필드를 재정의 해서, stuID가 같으면 true, 아니면 false
	
	
	
	//생성자  , 기본생성자1, 생성자2
	C (){}
	
	C (String stuID, String name, int age){
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this.stuID == ((C)obj).stuID) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//toString() 메소드 재정의 : 필드의 값을 출력 , 객체 
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	

}

public class Ex01 {

	public static void main(String[] args) {
		// 
		C c1 = new C("11월25일", "df", 5);
		C c2 = new C("11월25일", "df", 6);
		C c3 = new C("12-23", null, 0);
		System.out.println(c1.equals(c2));		//true
		System.out.println(c1.equals(c3));		//false
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		

	}

}
