package Chapter09.ex01;

public class AccessModifierOfMenber {

	public static void main(String[] args) {
		// 캡슐화 : 정보를 보호하기 위해서 클래스이름(public, default), 필드, 생성자(public, default), 메소드 이름앞에 붙는 접근제어자
			//접근제어자의 가장 큰 특징중 하나
			//클래스, 생성자(생성자에 접근제어자가 없으면 클래스의 접근제어자가 그대로 내려옴) : (public, default)만 올 수 있다.
			//필드, 메소드 는 아래 4가지 경우가 전부 올 수 있다.
		/*
		 *  
		   	public		: 다른 패키지에서 접근 가능하도록함
		   	protected	: 다른 패키지에서 접근 가능하도록함 (단, 상속관계의 경우에만 적용)
		   	default		: 같은 패키지에서만 접근 가능 , <<접근제어자가 없는(생략된경우)>> : 명시하지 않는다.
		   	private		: 동일한 파일에서만 접근 가능
		 */
		
	}

}
