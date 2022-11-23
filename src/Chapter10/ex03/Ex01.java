package Chapter10.ex03;

class Fruit {		//Fruit 의 메소드를 오버라이딩해서 출력. Apple, Banana, Orange
	void eat() {	//new로 Fruit을 지정
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}
class Apple extends Fruit{
	@Override
	void eat() {
		System.out.println("사과는 식감이 아삭합니다.");
	}
}
class Banana extends Fruit{
	@Override
	void eat() {
		System.out.println("바나나는 달콤 텁텁합니다.");
	}
}
class Orange extends Fruit{
	@Override
	void eat() {
		System.out.println("오렌지는 새콤달콤합니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 
		System.out.println("====객체생성후====");
		Fruit fu1 = new Apple();
		Fruit fu2 = new Banana();
		Fruit fu3 = new Orange();
		
		System.out.println("====객체로 바로 출력====");
		fu1.eat();
		fu2.eat();
		fu3.eat();
		
		System.out.println("=====객체생성후 배열에 값을 넣어======");
		Fruit[] arr1 = new Fruit[3];
		
		
		arr1[0] = fu1;
		arr1[1] = fu2;
		arr1[2] = fu3;
		
		
		for (int i = 0 ; i < 3; i++) {
			  arr1[i].eat();
		}
		
		
		
		
		
	/*	
		Fruit a1 = arr1[0];
		Fruit a2 = arr1[1];
		Fruit a3 = arr1[2];
		
		a1.eat();
		a2.eat();
		a3.eat();
	*/	
		
		
		
		
		
		
		
		

	}

}
