package Chapter13.ex09;

interface Car {
	void run();
	void stop();
	void start();
	
}

class CarPlay{
	void abc(Car c1) {
		c1.run();
		c1.stop();
		c1.start();
	}
}


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4번째 방법으로 출력 , Car 클래스의 abc() , 메소드의 매개변수에 구현한 코드 만들어서 호출
			//메소드의 매개변수에 구현한 코드 만들어서 호출
		
		//1. 메소드 호출하기 위한 객체 생성
		CarPlay a = new CarPlay();
		
		//2. 메소드 호출시 Car 인터페이스의 메소드를 구현해서 매개변수로 인풋
		a.abc(new Car() {
			@Override
			public void run() {
				System.out.println("자동차 달리다");
			}
			@Override
			public void start() {
				System.out.println("자동차 시동걸다");
			}
			@Override
			public void stop() {
				System.out.println("자동차 시동끄다");
			}
		});
		
		//위의 클래스의 void 메소드에서 업캐스팅되어 던져줘 호출이 된다.
		
		
	}

}
