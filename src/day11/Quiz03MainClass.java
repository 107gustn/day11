package day11;

import java.util.Scanner;

public class Quiz03MainClass {

	public static void main(String[] args) {		
		/*
		Updown ������ ����ÿ�.
		���ο��� �⺻ �������� ȭ���� �����, ����� �޼ҵ�� �����Ͻÿ�.
		*/
		Scanner sc = new Scanner(System.in);
		int gNum;
		boolean flag = true;
		Quiz03TestClass t = new Quiz03TestClass();
		
		while(flag) {
			System.out.println("=== Up & Down Game ===");
			System.out.println("    1. ���ӽ���");
			System.out.println("    2. ��������");
			System.out.println("    3. ��������");
			System.out.print(">>>> ");
			gNum = sc.nextInt();
			
			switch(gNum) {
			case 1:
				t.randgame();
				break;
			case 2:
				t.randhistory();
				break;
			case 3:
				System.out.println("������ �����մϴ�.");
				flag = false;
				break;
			default:
				System.out.println("�ٽ� ������.\n");
				
			}
			
		}
	}
}
