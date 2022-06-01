package day11;

public class TestClass03 {
	
	public static final String KOREA = "대한민국"; //static과 final이 들어가면 변수의 이름은 대문자로 설정한다.
	
	public static int num = 1000;
	public void test02() {
		num = 1234;
	}
	
	//static: 객체를 만들지 않아도 사용가능하다. 무조건 제일 처음 만들어진다.
	public static String name = "홍길동"; //클래스 변수
	
	public static void test() {
		System.out.println("test 실행");
	}
	

}
