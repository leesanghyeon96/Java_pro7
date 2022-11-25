package Chapter11.ex04;

abstract class Car {		//트럭, 자가용, 굴삭기	<== 추상 메소드를 구현한 클래스 생성
	abstract void run();
	abstract void eat();
}

abstract class Truck extends Car{
	@Override
	void run() {
		System.out.println("트럭은 아슬하게 과속이 아닙니다.");
		
	}
}
class MyCar extends Truck {
	@Override
	void eat() {
		System.out.println("나의 자가용은 전기를 먹습니다.");
	}
}
class BigCar extends Car {
	@Override
	void eat() {
		System.out.println("굴삭기는 기름을 엄청 먹습니다.");
		
	}
	@Override
	void run() {
		System.out.println("굴삭기는 저속운전합니다.");
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Car c1 = new MyCar();
		c1.eat();
		c1.run();
		System.out.println("==========================");
		Car c2 = new BigCar();
		c2.eat();
		c2.run();
		System.out.println("==========================");
		Truck c3 = new MyCar();
		c3.eat();
		c3.run();
		System.out.println("==========================");
		MyCar c4 = (MyCar) c1;
		c4.eat();
		c4.run();
		System.out.println("==========================");
		Truck c5 = (Truck) c4;
		c5.eat();
		c5.run();
		
		
	}

}
