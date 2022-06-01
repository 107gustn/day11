package day11;

import java.util.Scanner;

public class Quiz01TestClass {
	public String name;
	public int age;

	public void input() {
		System.out.println("입력받는 기능 실행");
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("나이 입력");
		age = sc.nextInt();
		op();
		
	}
	
	public void op() {
		System.out.println("연산하는 기능 실행");
		age = age - 1;
		System.out.println("age : " + age);
	}
	
	public void print() {
		System.out.println("출력하는 기능 실행");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
