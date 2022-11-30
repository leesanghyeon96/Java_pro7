package Chapter10.ex08;

class Animal {
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
}
class Man extends Animal{
	void run() {
		System.out.println("모든 동물은달립니다. 1 ");
	}
}
class Woman extends Animal{
	void run() {
		System.out.println("모든 동물은 달립니다. 2 ");
	}
}
class Lion extends Animal{
	void run() {
		System.out.println("모든 동물은 달립니다. 3 ");
	}
}
class Tiger extends Animal{
	void run() {
		System.out.println("모든 동물은 달립니다. 4 ");
	}
}
class Cat extends Animal{
	void run() {
		System.out.println("모든 동물은 달립니다. 5 ");
	}
}
class Dog extends Animal{
	void run() {
		System.out.println("모든 동물은 달립니다. 6  ");
	}
}
class DogChild extends Dog {
	void run() {
		System.out.println(" 모든 동물은 달립니다. 7");
	}
}




public class Ex01 {

	//4:10분까지
	public static void main(String[] args) {
		// Animal : 부모 클래스, run() 정의
		//	자식 클래스 : Man, Woman, Lion, Tiger, Cat, Dog, DogChild(Dog아래) <== 다형성
		//	  - 부모의 run 메소드를 재정의
		// arr 배열에 Animal 저장후 for, Enhanced for 로 출력, run() 메소드 출력
		// 
		
		Animal an1 = new Man();
		Animal an2 = new Woman();
		Animal an3 = new Lion();
		Animal an4 = new Tiger();
		Animal an5 = new Cat();
		Animal an6 = new Dog();
		Animal an7 = new DogChild();
		
		Animal[] arr = new Animal[7];
		
		arr[0] = an1;
		arr[1] = an2;
		arr[2] = an3;
		arr[3] = an4;
		arr[4] = an5;
		arr[5] = an6;
		arr[6] = an7;
		
		for(int i = 0 ; i <arr.length ; i++) {
			arr[i].run();
		}
		System.out.println("==================");
		
		for (Animal k :arr) {
			System.out.println(k);
		}
		System.out.println("===================");
		for(int i = 0; i< arr.length; i++) {
			arr[i].run();
		}
		
	//	arr[0].run();
	//	arr[1].run();
	//	arr[2].run();
	//	arr[3].run();
	//	arr[4].run();
	//	arr[5].run();
	//	arr[6].run();
		
		
		
	}

}
