package day11;

/*
Ŭ���� ����
- static

���� ���� - ���� �޼ҵ尡 ����Ǹ� �����
�ν��Ͻ� ���� - �ش� ��ü�� ���� �Ǹ� �����
Ŭ���� ���� - ���α׷��� ����ɶ� �����
*/
public class MainClass03 {
	
	public void test() {//��ü�� ���� �Ǿ�� ��� ����
		System.out.println("main test�Դϴ�.");
	}
	
	public static void main(String[] args) {//main���� ���α׷� ����
//		MainClass03 m = new MainClass03();
//		m.test();
		
		
		//TestClass03 t = new TestClass03(); //��ü ����
		System.out.println(TestClass03.name); //Ŭ�����̸�.����
		TestClass03.test();
		
		System.out.println(TestClass03.KOREA);
	}

}
