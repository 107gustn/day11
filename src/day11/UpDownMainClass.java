package day11;

import java.util.Scanner;

public class UpDownMainClass{
	public static void main(String[] args){
		UpDown updown = new UpDown();
		Scanner input = new Scanner(System.in);
		int sel=0,com=0,dummy=0,score=0,result=0;
		int player=0;
		while(true){	
			System.out.println(" === UP & Down Game ===");
			System.out.println("    1. ���ӽ���");
			System.out.println("    2. ��������");
			System.out.println("    3. ��������");
			System.out.print("  >>>> ");
			sel = input.nextInt();

			switch(sel){
			case 1:
				com = updown.ranNum();
				System.out.println("��ǻ�� ���� : "+com);
				dummy = 3;
				while(true)
				{
					if(dummy==3){
						System.out.println(" ===  START  ===");					
					}else if(dummy==1){
						System.out.println(" ===  U  P  ===");
						score++;
					}else if(dummy==2){
						System.out.println(" ===  Down  === ");
						score++;

					}else{
						score++;
						System.out.println(score+"ȸ ���� ������ϴ�!!!");
						result=updown.scoreCheck(score);
						score=0;
						if(result == 0){
							System.out.println("�ְ������ �����ϼ̽��ϴ�. \n");
						}		
						break;
					}
					//�Էºκ�
					System.out.print("Input Number --> ");
					player = input.nextInt();			
					//�˻�κ�
					dummy=updown.comPlayerCheck(player);
				}			
				break;
			case 2:
				if(updown.record() == 99)
				{
					System.out.println("������ �������� �ʾҽ��ϴ�");
					break;
				}
				System.out.println("�ְ� ������ "+updown.record()+"ȸ �Դϴ�!!!");
				break;
			case 3:
				System.out.println("������ ���� �մϴ�.!!!");
				return ;
			}
		}	
	}

}