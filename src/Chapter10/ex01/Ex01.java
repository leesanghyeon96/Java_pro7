package Chapter10.ex01;

class Animal {			//Animal 클래스를 상속해서 Tiger , Eagle, Lion 클래스를 생성
							//자식 클래스에서는 피드1, 메소드1정의
						 //LionChild클래스는 Lion 클래스를 상속해서 필드1, 메소드 1.
	String name;	//동물이름
	int age;		//동물나이
	String color;	//동물색
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep()	{
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
// tiger ============= Animal
class Tiger extends Animal{
	
	int num;	//마리수
	
	void eye() {
		System.out.println("호랑이는 나를 봅니다.");
	}
}
// Eagle ================ Tiger
class Eagle extends Tiger{
	int foot;		//발의개수
	
	void wing () {
		System.out.println("독수리는 날개가 2개입니다.");
	}
}
// Lion ================== Eagle
class Lion extends Eagle{
	String face;	//얼굴
	
	void king() {
		System.out.println("사자는 왕입니다.");
	}
}
// LionChild ===================== Lion
class LionChild extends Lion{
	int baby;		//새끼 마리수
	
	void look() {
		System.out.println("아기사자는 부모사자를 바라봅니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("===부모의 필드와 메소드 출력===");
		Animal a1 = new Animal ();
		a1.name = "도마토";
		a1.color = "노란색";
		a1.age = 5;
		a1.eat();
		a1.sleep();
		System.out.println("동물의 이름 : " + a1.name);
		System.out.println("동물의 색 : " + a1.color);
		System.out.println("동물의 나이 : " + a1.age);
		System.out.println();
		
		System.out.println("===Tiger===");
		Tiger a2 = new Tiger();
		a2.name = "동물1";
		a2.color = "빨간색";
		a2.age = 4;
		a2.num = 6;
		a2.eat();
		a2.sleep();
		a2.eye();
		System.out.println("동물의 이름 : " + a2.name);
		System.out.println("동물의 색 : " + a2.color);
		System.out.println("동물의 나이 : " + a2.age);
		System.out.println("동물의 마리수 : " + a2.num);
		System.out.println();
		
		System.out.println("===Eagle===");
		Eagle a3 = new Eagle();
		a3.name = "동물2";
		a3.color = "주황색";
		a3.age = 4;
		a3.num = 6;
		a3.foot = 2;
		a3.eat();
		a3.sleep();
		a3.eye();
		a3.wing();
		System.out.println("동물의 이름 : " + a3.name);
		System.out.println("동물의 색 : " + a3.color);
		System.out.println("동물의 나이 : " + a3.age);
		System.out.println("동물의 마리수 : " + a3.num);
		System.out.println("동물의 날개 개수 : " + a3.foot);
		System.out.println();
		
		System.out.println("===Lion===");
		Lion a4 = new Lion();
		a4.name = "동물3";
		a4.color = "초록색";
		a4.age = 7;
		a4.num = 8;
		a4.foot = 4;
		a4.face = "무섭다";
		a4.eat();
		a4.sleep();
		a4.eye();
		a4.wing();
		a4.king();
		System.out.println("동물의 이름 : " + a4.name);
		System.out.println("동물의 색 : " + a4.color);
		System.out.println("동물의 나이 : " + a4.age);
		System.out.println("동물의 마리수 : " + a4.num);
		System.out.println("동물의 날개 개수 : " + a4.foot);
		System.out.println("동물의 얼굴은 : " + a4.face);
		System.out.println();
		
		System.out.println("===LionChild===");
		LionChild a5 = new LionChild();
		a5.name = "동물4";
		a5.color = "파란색";
		a5.age = 10;
		a5.num = 4;
		a5.foot = 4;
		a5.face = "귀엽다";
		a5.baby = 3;
		a5.eat();
		a5.sleep();
		a5.eye();
		a5.wing();
		a5.king();
		a5.look();
		System.out.println("동물의 이름 : " + a5.name);
		System.out.println("동물의 색 : " + a5.color);
		System.out.println("동물의 나이 : " + a5.age);
		System.out.println("동물의 마리수 : " + a5.num);
		System.out.println("동물의 날개 개수 : " + a5.foot);
		System.out.println("동물의 얼굴은 : " + a5.face);
		System.out.println("아기사자의 마리수는 : " + a5.baby);
		
	}

}
