package day11;

public class TestClass01 {

	public int test01() {
		int num = 100; //해당지역에서 만든 변수는 그 지역에서만 사용할 수 있다.
		System.out.println("test01 : " + num);
		return num;
	}
	
	public void test02(int num) {
		
		System.out.println("test02 : " + num);
	}

}
