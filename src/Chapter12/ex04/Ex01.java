package Chapter12.ex04;
interface Animal{}

interface Animal1 extends Animal{
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}

//Cat, Tiger	<== cry(), run()만 구현
//Dog, Lion		<== run(), eat()만 구현
//Eagle			<== cry(), run(), eat()

//배열에 넣어서 오버라이딩된 메소드 출력
	//instanceof 를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
	//instanceof 를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 run(), eat()
	//instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry(), run(), eat()

class Cat implements Animal1,Animal2{
	@Override
	public void cry() {
		System.out.println("고양이는 야옹하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("고양이는 달립니다.");
	}
}

class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("호랑이는 어흥하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");
	}
	
}

class Dog implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("강아지는 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("강아지는 뼈다귀를 먹습니다.");
	}
}

class Lion implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("사자는 달립니다.");
	}
	@Override
	public void eat() {
		System.out.println("사자는 고기를 먹습니다.");
	}
}

class Eagle implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {
		System.out.println("독수리는 끼룩하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("독수리는 날개를 다쳐 걸어다닙니다.");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 고기를 쪼아 먹습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//1. 객체 생성후 배열에 저장 
		Animal f1 = new Cat();
		Animal f2 = new Tiger();
		Animal f3 = new Dog();
		Animal f4 = new Lion();
		Animal f5 = new Eagle();
		
		Animal[] arr = new Animal[] {f1,f2,f3,f4,f5};
		//f1 은 Animal 타입이고 Animal1, Animal2를 상속받고있다.
		
		//2. for 문을 사용해서 출력 (다운캐스팅해서 호출)
				for (int i = 0 ; i < arr.length ; i ++) {
					if (arr[i] instanceof Cat || arr[i] instanceof Tiger ) {
						((Animal1)arr[i]).cry();	//다운캐스팅
						((Animal2)arr[i]).run();
					}
					
					if (arr[i] instanceof Dog || arr[i] instanceof Lion ) {
						((Animal3)arr[i]).eat();
						((Animal2)arr[i]).run();
					}
					
					if (arr[i] instanceof Eagle ) {
						((Animal1)arr[i]).cry();
						((Animal3)arr[i]).eat();
						((Animal2)arr[i]).run();
					}
				}
		
		
		
		
		
	/*	
		System.out.println(a1 instanceof Cat);
		
		Cat c1 = (Cat)a1;
		Cat c2 = (Cat)a2;
		Tiger c3 = (Tiger)a3;
		Tiger c4 = (Tiger)a4;
		Dog c5 = (Dog)a5;
		Dog c6 = (Dog)a6;
		Lion c7 = (Lion)a7;
		Lion c8 = (Lion)a8;
		Eagle c9 = (Eagle)a9;
		Eagle c10 = (Eagle)a10;
		Eagle c11 = (Eagle)a11;
		
		
		Animal[] arr = new Animal[] {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11};
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	*/	

	}

}




/*
 * Animal1 a1 = new Cat();
		Animal2 a2 = new Cat();
		Animal1 a3 = new Tiger();
		Animal2 a4 = new Tiger();
		Animal2 a5 = new Dog();
		Animal3 a6 = new Dog();
		Animal2 a7 = new Lion();
		Animal3 a8 = new Lion();
		Animal1 a9 = new Eagle();
		Animal2 a10 = new Eagle();
		Animal3 a11 = new Eagle();
 */


/*
 * Animal d1 = new Cat();
		((Animal1) d1).cry();
		Animal d2 = new Cat();
		((Animal2) d2).run();
		Animal d3 = new Tiger();
		((Animal1) d3).cry();
		Animal d4 = new Tiger();
		((Animal2) d4).run();
		Animal d5 = new Dog();
		((Animal2) d5).run();
		Animal d6 = new Dog();
		((Animal3) d6).eat();
		Animal d7 = new Lion();
		((Animal2) d7).run();
		Animal d8 = new Lion();
		((Animal3) d8).eat();
		Animal d9 = new Eagle();
		((Animal1) d9).cry();
		Animal d10 = new Eagle();
		((Animal2) d10).run();
		Animal d11 = new Eagle();
		((Animal3) d11).eat();
		
		Animal[] arr = new Animal[]{d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11};
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
 */




