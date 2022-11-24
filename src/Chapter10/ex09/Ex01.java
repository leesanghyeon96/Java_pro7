package Chapter10.ex09;

class Car {
	private String carname;
	private String carcolor;
	private int maxSpeed;
	private String carModel;
	
	//생성자
	Car (){}
	public Car(String carname, String carcolor, int maxSpeed, String carModel) {
		super();
		this.carname = carname;
		this.carcolor = carcolor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}
	
	//getter, setter
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarcolor() {
		return carcolor;
	}
	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	//객체 자체를 프린트 할때 필드의 값 전체를 출력 할 수 있도록 toString() : Object 의 메소드
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carcolor=" + carcolor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본생성자, 인풋을 받는 생성자, 
		// 2. getter, setter 생성
		// 3. toString () 재정의 : 전체 메모리 내용 출력.
		
		// 4. 생성자를 통해서 값을 할당 후 메모리의 전체 내용 출력
		// 5. setter를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력.
				//getter를 사용해서 각 필드의 내용을 출력
		
		Car c2 = new Car("붕붕이2","초록색",500,"택시");
		
		System.out.println(c2);
		
		
		Car c1 = new Car();
		
		// setter를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력.
		c1.setCarname("붕붕이");
		c1.setCarcolor("노란색");
		c1.setMaxSpeed(250);
		c1.setCarModel("그랜져");
		System.out.println(c1);
		System.out.println("============");
		
		//getter를 사용해서 각 필드의 내용을 출력
		System.out.println(c1.getCarname());
		System.out.println(c1.getCarcolor());
		System.out.println(c1.getMaxSpeed());
		System.out.println(c1.getCarModel());
		
		
		
		
		
		
		
		
		
	}

}
