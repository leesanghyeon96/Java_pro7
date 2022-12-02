package Chapter16.ex10;
//절대값 : Math.abs(x,y)

//제너릭 클래스 / 제너릭 메소드를 사용해서 두 점의 좌표 값으로 넓이를 구하는 프로그램 작성

//점의 좌표를 처리하는 클래스를 생성. <제너릭 클래스>
class Point<X, Y>{
	X x;
	Y y;
	
	//생성자를 통해서 t, v의 값을 입력(setter와 생성자를 통해서 값을 넣을 수 있다.)
	Point () {}			//기본 생성자
	Point (X x, Y y){		//x : x좌표 , y : y좌표
		this.x = x;
		this.y = y;
	}
	
	//getter 만 생성
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}	
}


//제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드
class GenericMethod {
	
	//makeRectangle() 메소드를 호출시 
	public static <T,V> double makeRectangle (Point<T,V> p1, Point<T,V> p2) {
		//두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌.
		
		//강사님
		
		double width =  (double)p2.getX()	-(double)p1.getX();
		double height =  (double)p2.getY()	-(double)p1.getY();
		
		//넓이를 리턴해주면 됨.
		//강사님
		return width * height ;
				//((double)p1.x-(double)p2.x) * ((double)p1.y-(double)p2.y);
				//Math.abs(p1.x - p2.x) * Math.abs(0);
	}
}



public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두 점의 좌료를 저장하는 p1 , p2
		Point<Double,Double> p1 = new Point(3.2 , 2.0);
		Point<Double,Double> p2 = new Point(8.0 , 12.3);
		
		// makeRectangle(p1, p2) <== 두 점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println(rect);
		
		
		//GenericMethod g1 = new GenericMethod();
		//g1.makeRectangle(p1, p2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
