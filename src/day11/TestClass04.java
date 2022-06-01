package day11;

import java.util.Scanner;

public class TestClass04 {
	public void display() {
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("나이 입력");
		age = sc.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
