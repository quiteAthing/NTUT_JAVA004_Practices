package guessingNum;

import java.util.Scanner;

public class gNum {
	public static Scanner scr = new Scanner(System.in);
	public static boolean isPlaying = false;
	static boolean justBack=false;
	static String[] ins;// 接收輸入的內容
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A collection of games with the same control methods
		
		cornerGame game = new Pcs();
			System.out.println("請輸入要玩的遊戲，如果不知道要玩甚麼請輸入help，輸入quit結束遊戲");
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
					System.out.println("現有的遊戲： \"pcs\" ：剪刀石頭布");
					break;
				case "quit":
					System.out.println("遊戲終止");
					return;
				case "justBack":System.out.println("justBack");
				default:
					System.out.println("指定的內容不存在，請檢查是否有拼字錯誤");
					System.out.println("請輸入要玩的遊戲，如果不知道要玩甚麼請輸入help，輸入quit結束遊戲");
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
		System.out.println("遊戲已結束");
		System.out.println("請輸入要玩的遊戲，如果不知道要玩甚麼請輸入help，輸入quit結束遊戲");
	}

}
