package day11;

import java.util.Scanner;

public class Quiz01TestClass {
	public String name;
	public int age;

	public void input() {
		System.out.println("�Է¹޴� ��� ����");
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		name = sc.next();
		System.out.println("���� �Է�");
		age = sc.nextInt();
		op();
		
	}
	
	public void op() {
		System.out.println("�����ϴ� ��� ����");
		age = age - 1;
		System.out.println("age : " + age);
	}
	
	public void print() {
		System.out.println("����ϴ� ��� ����");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}

}
