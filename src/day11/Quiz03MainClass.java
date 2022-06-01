package day11;

import java.util.Scanner;

public class Quiz03MainClass {

	public static void main(String[] args) {		
		/*
		Updown 게임을 만드시오.
		메인에서 기본 보여지는 화면을 만들고, 기능은 메소드로 구현하시오.
		*/
		Scanner sc = new Scanner(System.in);
		int gNum;
		boolean flag = true;
		Quiz03TestClass t = new Quiz03TestClass();
		
		while(flag) {
			System.out.println("=== Up & Down Game ===");
			System.out.println("    1. 게임시작");
			System.out.println("    2. 게임전적");
			System.out.println("    3. 게임종료");
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
				System.out.println("게임을 종료합니다.");
				flag = false;
				break;
			default:
				System.out.println("다시 고르세요.\n");
				
			}
			
		}
	}
}
