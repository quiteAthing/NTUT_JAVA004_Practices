package guessingNumMore;

import java.util.Scanner;

public class Pcs implements cornerGame{
	//Pcs for Paper Scissor Stone
	//���ŤM���Y���n�����ŤM
	//�ŤM���Y��
	int type=0;//���a�X���@�خ�
	int cType=0;//�q���X���@�خ�
	int scissor=3,paper=2,stone=1;
	private Scanner scr;
	int compare;//�Ψӭp�⵲�G
	private String inp;

	public Pcs(){
	}
	
	public void setupGame(Scanner sc){
		scr=sc;
		
	}
	
	public void playGame(){
		//�g�b�~���A�ѥD�j��I�s
		System.out.println(">�п�J�z���ۼơA1:�ŤM  2:��  3:���Y  ");
		try{//�p�G���a��J���~�ɻݭn�������~

			inp=scr.next();
		if(inp.equals("quit")){quitOnInput();}
		
		else{
		
		type=Integer.parseInt(inp);
		cType=(int)(Math.random()*3+1);
		compare=Math.abs(type-cType);
		
		switch(compare){
			case 0:System.out.println("���襭�� ");break;
			case 1:System.out.println("���a�ӧQ ");break;
			case 2:System.out.println("�q���ӧQ ");break;
			default:System.out.println("�z���G��J���~�ɭP�L�k�PŪ�A��������");break;
		
			}
		}

		
		
		}catch(NumberFormatException pe){
			System.out.println("��J���~�A�Э��s��J");
		}
		
		
	}
// �����޿�Ϊ���k�A���ϥ�
//	private String generateTest(int a){
//		String r;
//		switch(a){
//		case 1:r="Scissors";break;
//		case 2:r="Stone";break;
//		case 3:r="Papers";break;
//		default:r="nulll";break;
//		}
//		return r;
//	}
	
	public void quitOnInput(){
		//����"quit"�r��ɵ����C���A�^��D�e��
		gNum.endGame();
		
		
	}
	
	
	
	
}
