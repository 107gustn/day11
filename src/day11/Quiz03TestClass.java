package day11;

import java.util.Scanner;

public class Quiz03TestClass {
	/*
	 * ��� ������ �̴� ���, �ְ��� üũ, ������, �ְ��� Ȯ�� ���
	 */
	int inputNum, tCount, record = 1000, ranNum;

	public void randgame() {
		tCount = 1;
		boolean flag = true;
		randnum();

		Scanner sc = new Scanner(System.in);

		System.out.println("��ǻ�� ���� : " + ranNum);
		System.out.println("\n===  START  ===");
		while (flag) {
			System.out.print("Input Number --> ");
			inputNum = sc.nextInt();

			if (ranNum > inputNum) {
				System.out.println("===  U P  ===");
				tCount++;
			} else if (ranNum < inputNum) {
				System.out.println("===  Down  ===");
				tCount++;
			} else {
				res();
				flag = false;
			}
		}
	}

	public void randnum() { //������ �̴� ���
		ranNum = (int) (Math.random() * 100) + 1;
	}

	public void myrecord() { //�ְ� ��� üũ
		if (tCount < record) {
			System.out.println("�ְ����� �����ϼ̽��ϴ�.");
			record = tCount;
		}
	}

	public void res() { //���� ���
		System.out.println(tCount + "ȸ ���� ������ϴ�!!!");
		myrecord();
		System.out.println();
	}

	public void randhistory() { //�ְ� ��� Ȯ�� ���
		if (record == 1000) {
			System.out.println("������ �������� �ʾҽ��ϴ�.\n");
		} else {
			System.out.println("�ְ� ������ " + record + "ȸ �Դϴ�!!!\n");
		}
	}

}
