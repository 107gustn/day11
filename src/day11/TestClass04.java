package day11;

import java.util.Scanner;

public class TestClass04 {
	public void display() {
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		System.out.println("�̸� �Է�");
		name = sc.next();
		System.out.println("���� �Է�");
		age = sc.nextInt();
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}

}
