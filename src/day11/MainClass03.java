package day11;

/*
클래스 변수
- static

지역 변수 - 지역 메소드가 종료되면 사라짐
인스턴스 변수 - 해당 객체가 종료 되면 사라짐
클래스 변수 - 프로그램이 종료될때 사라짐
*/
public class MainClass03 {
	
	public void test() {//객체가 생성 되어야 사용 가능
		System.out.println("main test입니다.");
	}
	
	public static void main(String[] args) {//main부터 프로그램 시작
//		MainClass03 m = new MainClass03();
//		m.test();
		
		
		//TestClass03 t = new TestClass03(); //객체 생성
		System.out.println(TestClass03.name); //클래스이름.변수
		TestClass03.test();
		
		System.out.println(TestClass03.KOREA);
	}

}
