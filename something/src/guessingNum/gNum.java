package guessingNum;

import java.util.Scanner;

public class gNum {
	public static Scanner scr = new Scanner(System.in);
	public static boolean isPlaying = false;
	static boolean justBack=false;
	static String[] ins;// ������J�����e
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A collection of games with the same control methods
		
		cornerGame game = new Pcs();
			System.out.println("�п�J�n�����C���A�p�G�����D�n���ƻ�п�Jhelp�A��Jquit�����C��");
		while (true) {
			
			if(isPlaying==false){
				
				ins = scr.nextLine().split(" ");
				if(justBack==true){
					justBack=false;
					continue;
				}
			}
			
			
			if (isPlaying == false) {
				switch (ins[0]) {
				case "pcs":
					game.setupGame(scr);isPlaying=true;
					break;
				case "help":
					System.out.println("�{�����C���G \"pcs\" �G�ŤM���Y��");
					break;
				case "quit":
					System.out.println("�C���פ�");
					return;
				case "justBack":System.out.println("justBack");
				default:
					System.out.println("���w�����e���s�b�A���ˬd�O�_�����r���~");
					System.out.println("�п�J�n�����C���A�p�G�����D�n���ƻ�п�Jhelp�A��Jquit�����C��");
					continue;
				}
			}
			if(isPlaying==true){
				game.playGame();
				
			}

		}

	}
	public static void endGame(){
		isPlaying=false;
		justBack=true;
		System.out.println("�C���w����");
		System.out.println("�п�J�n�����C���A�p�G�����D�n���ƻ�п�Jhelp�A��Jquit�����C��");
	}

}
