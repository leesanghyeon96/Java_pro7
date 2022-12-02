package Chapter16.ex01;

//각각의 상품을 저장하는 클래스가 별도로 존재함.
//Goods1 - Apple 만 저장, Goods2 - Pencil 만 저장

//1. Apple 클래스와 Apple 클래스를 담을 수 있는 클래스
class Apple{}	//클래스 선언
class Goods1{	//상품클래스, Apple 상품을 담는 클래스
	//접근 제어자가 private 이기 때문에 외부에서 apple 참조변수에 값을 넣거나 가져오기 위해서는 
		//getter, setter를 통해서만 apple 참조변수에 갑을 수정할 수 있다.
	//getter : apple 참조변수 값을 가져올때 사용
	//setter : apple 참조변수의 다른 값을 할당할때 사용
	private Apple apple = new Apple();	
		//private는 외부에서 값을 수정이 불가해 getter, setter로 수정한다.
	
	
	//getter : 필드의 값을 리턴으로 돌려줌 (get뒤에 첫자 대문자)
	public Apple getApple () {	//Apple:리턴타입 apple:객체인apple을 return돌려줌
		return apple;			//필드의 값을 호출할때
	}
	//setter : 필드의 값을 외부에서 수정
	public void setApple(Apple apple) {	//받은 매개변수 apple값을 필드의apple로 할당
		this.apple = apple;
	}
}

//2. Pencil 클래스와 Pencil 클래스를 담을 수 있는 클래스
class Pencil{}
class Goods2{	//Pencil 타입의 객체를 담는 클래스
	
	private Pencil pencil = new Pencil();
	
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}	
}





public class ProbleamsBeforeGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Goods1을 통해서 Apple 객체를 추가하고 가져오기
		Goods1 goods1 = new Goods1();
		goods1.getApple();
		goods1.setApple(new Apple());	//setter를 사용해서 Apple객체를 추가함.
		
		Apple apple = goods1.getApple();
		
		//2. Goods2를 사용해서 Pencil 객체를 추가하고 가져오기
		Goods2 goods2 = new Goods2();
		Pencil pencil = goods2.getPencil();	//값을 getter를 통해서 Pencil 객체를 가져옴
		goods2.setPencil(new Pencil());		//setter를 사용해서 Pencil 객체를 주입
		
		Pencil pencil2 = goods2.getPencil();	//주입된 Pencil를 통해서 
		
		
		
	}

}
