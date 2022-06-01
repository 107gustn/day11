package day11;

//일회성 변수는 대부분 지역 변수에 생성한다.
public class TestClass02 {
	//인스턴스 변수
	public int num = 100;
	public String name;
	
	public void test01() {
		//이름 입력
		name = "홍길동";
		System.out.println("test01 : " + num);
	}
	
	public void test02() {
		System.out.println("이름 : " + name);
		System.out.println("test02 : " + num);
	}

}
