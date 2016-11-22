package guessingNumMore;

import java.util.Scanner;

public class Pcs implements cornerGame{
	//Pcs for Paper Scissor Stone
	//玩剪刀時頭部要遠離剪刀
	//剪刀石頭布
	int type=0;//玩家出哪一種拳
	int cType=0;//電腦出哪一種拳
	int scissor=3,paper=2,stone=1;
	private Scanner scr;
	int compare;//用來計算結果
	private String inp;

	public Pcs(){
	}
	
	public void setupGame(Scanner sc){
		scr=sc;
		
	}
	
	public void playGame(){
		//寫在外面，由主迴圈呼叫
		System.out.println(">請輸入您的招數，1:剪刀  2:布  3:石頭  ");
		try{//如果玩家輸入錯誤時需要捕捉錯誤

			inp=scr.next();
		if(inp.equals("quit")){quitOnInput();}
		
		else{
		
		type=Integer.parseInt(inp);
		cType=(int)(Math.random()*3+1);
		compare=Math.abs(type-cType);
		
		switch(compare){
			case 0:System.out.println("雙方平手 ");break;
			case 1:System.out.println("玩家勝利 ");break;
			case 2:System.out.println("電腦勝利 ");break;
			default:System.out.println("您似乎輸入錯誤導致無法判讀，此局不算");break;
		
			}
		}

		
		
		}catch(NumberFormatException pe){
			System.out.println("輸入錯誤，請重新輸入");
		}
		
		
	}
// 測試邏輯用的方法，未使用
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
		//當收到"quit"字串時結束遊戲，回到主畫面
		gNum.endGame();
		
		
	}
	
	
	
	
}
