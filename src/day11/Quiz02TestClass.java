package day11;

import java.util.Scanner;

public class Quiz02TestClass {
	/*
	입력, 연산, 출력 기능을 만들어 주세요
	엽력 : 이름, 국, 영, 수
	연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능
	출력 : 이름, 국 영, 수, 합, 평균, 등급
	등급 : 평균이 90이상 A, 80이상 B, 나머진 C
	 */
	
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("국어 입력");
		kor = sc.nextInt();
		System.out.println("영어 입력");
		eng = sc.nextInt();
		System.out.println("수학 입력");
		math = sc.nextInt();
		
		op();
	}
	
	public void op() {
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		if(avg>=90) {
			grade = "A";
		}else if (avg>=80) {
			grade = "B";
		}else {
			grade = "C";
		}
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + grade);
	}
	
}
