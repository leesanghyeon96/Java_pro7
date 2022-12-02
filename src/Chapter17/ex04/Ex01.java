package Chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개정도 생성해서 ArrayList에 저장후 객체를 출력시 필드의 값을 출력 하도록함.
// for, Enhanced For, 컬렉션객체 자체를 출력시 

class Car {
	//필드 생성
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	//생성자 생성
	Car(String company, String carModel, String color, int maxSpeed){
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed  = maxSpeed;
	
	}	
	//toString() 재정의
	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}	
}

public class Ex01 {

	public static void main(String[] args) {
		//ArrayList에 Car의 객체를 생성
		ArrayList<Car> arr1 = new ArrayList();
		
		//Car의 객체를 생성하면서 생성자를 통해 객체에 값을 할당(3개정도)
		Car c1 = new Car("현대자동차","현대차모델","빨간색",250);
		Car c2 = new Car("삼성자동차","삼성차모델","주황색",250);
		Car c3 = new Car("기아자동차","기아차모델","초록색",250);
		
		//Car의 객체를 arr1에 넣기(컬렉션에)
		arr1.add(c1);
		arr1.add(c2);
		arr1.add(c3);
		
		//for 문을 사용해 출력하기
		System.out.println("=====for 문을 사용해 출력하기=====");
		for (int i = 0 ; i < arr1.size() ; i++) {
			Car ca1 = arr1.get(i);		//*arr1.get(i) 에 넣기* 
			System.out.println(ca1);
		}
		System.out.println();
		
		//Enhanced For 문을 사용해 출력하기
		System.out.println("=====Enhanced For 문을 사용해 출력하기=====");
		for (Car k : arr1) {
			System.out.println(k);
		}
		
		//컬렉션 객체 자체를 출력
		System.out.println("=====컬력센 객체 자체를 출력=====");
		System.out.println(arr1);
		System.out.println(arr1.toString());
		
		
	}

}
