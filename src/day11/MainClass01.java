package day11;

/*
���� ����(���� ����)
- Ư�� ���������� ��� ������ ����
*/
public class MainClass01
{
	public static void main(String[] args)
	{		
		/*
		if(true){
			int num = 100; //��������
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
