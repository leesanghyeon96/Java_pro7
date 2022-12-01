package Chapter16.ex05;

//제너릭 메소드 : 일반 클래스 내에 제너릭 타입을 가지는 메소드
class GenericMethods{
	
	//제너릭 메소드 : 일반클래스 내부에 제너릭 타입의 메소드
	//접근제어자 <외부에서 타입지정> 리턴타입 메소드명 (인풋매개변수타입 변수)
	//다양한 타입의 값을 리턴으로 되돌려주는 메소드
	public <T> T method1 (T t) {	//접근지정자 뒤에 타입 지정 (유추가 가느하면 생략가능)
		return t;
	}
	
	//동일한 타입의 두 값을 인풋받아서 같으면 true, 다르면 false 를 리턴시켜줌(객체형타입)
	//제너릭에 넣는 타입변수 T 에 올수있는 것은 기본타입은 넣을 수 없다. wrapper 클래스만 올 수 있다.
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);			
	}
	
	public <K,V> void method3 (K k , V v) {
		System.out.println(k + " : " + v);
	}		
}



public class GenericMethod {

	public static void main(String[] args) {
		// 제너릭 메소드 사용하기
		
		//일반 클래스의 객체 생성
		GenericMethods gm = new GenericMethods();
		
		gm.<String>method1("안녕");		//메소드 호출전에 타입을 지정<String>
		
		String str1 = gm.<String>method1("안녕");		//리턴을 돌려줌
		String str2 = gm.method1("하세요");	//<String>생략 : 뒤의 인풋값으로 타입을 유추할 수 있는 경우
		System.out.println(str1);
		System.out.println(str2);
		
		
		Integer int1 = gm.<Integer>method1(100);
		Integer int2 = gm.method1(200);
		System.out.println(int1);
		System.out.println(int2);
		
		System.out.println(gm.<Double>method1(100.11));	//바로 출력
		System.out.println(gm.method1(200.22));	//Double유추 가능
		System.out.println(gm.method1("대체로 화창"));	//유추
		System.out.println(gm.method1(1020));	//유추
		
		System.out.println("===============================");
		//2. method2 호출
		
		//리턴타입은 일반타입
		boolean bool1 = gm.<Double>method2(2.5, 2.5);
		System.out.println(bool1);		//true
		boolean bool2 = gm.method2(2.5, 3.6);	//<Double> 생략
		System.out.println(bool2);		//false
		
		System.out.println("================================");
		System.out.println(gm.<String>method2("안녕", "안녕"));	//true
		System.out.println(gm.method2("대체로", "화창"));	//false
		
		
		System.out.println("================================");
		//3. method3 호출
		gm.<String, Integer>method3("국어", 80);	//출력구문이 있기 때문에
		gm.method3("영어", 88);
		gm.method3("기온", -3.4);
		
		System.out.println("======================");
		gm.method3("아바타2", "롯데시네마");	//타입지정이 안되어있기에 생략해도 유추가 가능
		gm.method3(1000, 2000);
		gm.<Integer,Double>method3(1000,30.33);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
