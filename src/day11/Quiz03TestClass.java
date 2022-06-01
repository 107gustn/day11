package day11;

import java.util.Scanner;

public class Quiz03TestClass {
	/*
	 * 기능 랜덤값 뽑는 기능, 최고기록 체크, 정답기능, 최고기록 확인 기능
	 */
	int inputNum, tCount, record = 1000, ranNum;

	public void randgame() {
		tCount = 1;
		boolean flag = true;
		randnum();

		Scanner sc = new Scanner(System.in);

		System.out.println("컴퓨터 숫자 : " + ranNum);
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

	public void randnum() { //랜덤값 뽑는 기능
		ranNum = (int) (Math.random() * 100) + 1;
	}

	public void myrecord() { //최고 기록 체크
		if (tCount < record) {
			System.out.println("최고기록을 갱신하셨습니다.");
			record = tCount;
		}
	}

	public void res() { //정답 기능
		System.out.println(tCount + "회 만에 맞췄습니다!!!");
		myrecord();
		System.out.println();
	}

	public void randhistory() { //최고 기록 확인 기능
		if (record == 1000) {
			System.out.println("게임을 시작하지 않았습니다.\n");
		} else {
			System.out.println("최고 점수는 " + record + "회 입니다!!!\n");
		}
	}

}
