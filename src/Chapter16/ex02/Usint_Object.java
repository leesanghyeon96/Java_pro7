package Chapter16.ex02;

// 모든 객체는 Object 를 상속하고 있다.
// 모든 객체는 Object타입으로 모두 타입변환 할 수 있다.
	// Object 타입으로 저장된 객체를 가져와서 사용하기 위해서는 매번 다운캐스팅을 해야한다.
	// 모든 객체는 Object 타입으로 저장할 수 있고 가져올때는 매번 다운캐스팅을 해줘야한다.
	// 매번 다운캐스팅을 하는것을 보완하기위해 제너릭을 사용한다.(업,다운캐스팅을 하지 않고)

class Apple {String apple = "애플";}	//최상위의 클래스는 extends Object 가 생략되어있다.
class Pencil {String pencil = "연필";}	//모든 객체는 extends Object 가 생략되어있다.
class Banana {String banana = "바나나";}
class Orange {String orange = "오렌지";}


class Goods {
	
	//Object는 자바의 모든 객체를 담을 수 있는 타입이다.
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	
	
}


public class Usint_Object {

	public static void main(String[] args) {
		// 1. Goods를 사용해서 Apple 객체를 저장후 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());	//Apple 객체를 생성해서 setter주입
		//Apple()객체가  setObject(Object object) 의 object에 업캐스팅되어 Object타입
				//으로 들어감 ==>private Object object = new Object(); 의 object로 들어감
		
		//Getter를 사용해서 값을 가져올때는 다운캐스팅해서 가져와야한다.
		//1.
		Object obj = goods1.getObject();	//getter를 통해서 가져옴
		Apple app1 = (Apple) obj;			//다운캐스팅
		//2.
		Apple app2 = (Apple) goods1.getObject();	//다운캐스팅까지 한번에 가져옴
		System.out.println(app2.apple);
		
		
		// 2. Goods를 사용해서 Pencil 객체를 저장후 가져오기
		goods1.setObject(new Pencil());	//Pencil를 객체화해 object에넣음
				goods1.getObject();	//나오는 객체는 object
		Object obj2 = goods1.getObject();	//getter를 통해서 가져옴
		Pencil pen1 = (Pencil) obj2;		//다운캐스팅
		System.out.println(pen1.pencil);
		
		// 3. Goods를 사용해서 Banana 객체를 저장후 가져오기
		goods1.setObject(new Banana());	//들어갈땐 업캐스팅
		
		Banana banana = (Banana) goods1.getObject();	//가져오면서 바로 다운캐스팅
		System.out.println(banana.banana);
		
		
		
	}

}
