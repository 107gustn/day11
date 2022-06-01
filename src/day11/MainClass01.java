package day11;

/*
지역 변수(로컬 변수)
- 특정 지역에서만 사용 가능한 변수
*/
public class MainClass01
{
	public static void main(String[] args)
	{		
		/*
		if(true){
			int num = 100; //지역변수
			System.out.println("if : " + num);
			num = 200;
		}
		System.out.println("main : " + num);
		*/
		
		TestClass01 t = new TestClass01();
		int re = t.test01();
		t.test02(re);
	}
}
