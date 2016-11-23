package advLearning;

import java.io.*;

public class ticToe2 {

	// 用Console玩圈圈叉叉
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int player1 = 1, player2 = 2, notUsed = 0;//把會用到的符號常數化，及視覺化，同時宣告成final避免不小心改道
		int turnCounter = 0;//計算回合數
		int whoseTurn = 0;//紀錄是誰的回合
		boolean ended = false;//紀錄遊戲結束條件是否達成
		int[][] ground = new int[3][3];//紀錄遊戲資料
		int place=0;//檢查空間是否占滿用
		int[] 	winner = { 0,0,0,0,0,0,0,0};//檢查各列是否有連線

		// 初始化遊戲場，全不填上notused==0
		for (int all = 0; all < ground.length; all++) {
			for (int alt = 0; alt < ground[all].length; alt++) {
				ground[all][alt] = notUsed;
			}
		}

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		whoseTurn = (int) (Math.random() * 3);

		// 主迴圈，所有處理內容都在這裡

		while (true) {
			try {
				
				if (ended == true) {
//					System.out.println("重新初始化遊戲");
					for(int i=0;i<winner.length;i++){
						winner[i]=0;
					}
					for (int all = 0; all < ground.length; all++) {
						for (int alt = 0; alt < ground[all].length; alt++) {
							ground[all][alt] = notUsed;
						}
					}
//					System.out.println("重新決定誰先開始");
					whoseTurn = (int) (Math.random() * 3);
					turnCounter = 0;
					ended = false;
				}
				
				
				System.out.println("\n輸入任何字元繼續");
				bfr.readLine();

				// 展示遊戲場
				for (int all = 0; all < ground.length; all++) {
					System.out.println("");
					for (int alt = 0; alt < ground[all].length; alt++) {
						System.out.print("\t[" + ground[all][alt] + "]");
					}
				}

				String j = "";
				String[] command = new String[2];
				int x, y;


				if (turnCounter == 0) {
					System.out.println("\n 遊戲開始，輸入格式為 x座標,座標");
				} else {
					System.out.println("\n 第  " + turnCounter + " 回合");
				}

				switch (whoseTurn) {
				case player1:
					System.out.println("\n ============Player 1 的回合==========");
					j = bfr.readLine();
					command = j.split(",");
					x = Integer.parseInt(command[0]);
					y = Integer.parseInt(command[1]);
					if (ground[x][y] == 0) {
						ground[x][y] = player1;
					} else {
						System.out.println("位置已被佔據，請重新輸入");
						continue;
					}
					whoseTurn = player2;
					turnCounter += 1;
					break;
				case player2:
					System.out.println("\n ===========Player 2 的回合===========");
					j = bfr.readLine();
					command = j.split(",");
					x = Integer.parseInt(command[0]);
					y = Integer.parseInt(command[1]);
					if (ground[x][y] == 0) {
						ground[x][y] = player2;
					} else {
						System.out.println("位置已被佔據，請重新輸入");
						continue;
					}
					whoseTurn = player1;
					turnCounter += 1;
					break;

				}
				// 展示現況給玩家看
				for (int all = 0; all < ground.length; all++) {
					System.out.println("");
					for (int alt = 0; alt < ground[all].length; alt++) {
						System.out.print("\t[" + ground[all][alt] + "]");
					}
				}

				// 檢查空位是否已滿
				place = 0;
				for (int i = 0; i < 3; i++) {
					for (int s = 0; s < 3; s++) {
						if (ground[i][s] != 0) {
							place += 1;
						}
					}
				}

				if (place >= 9) {ended = true;System.out.println("空位已滿，遊戲結束，無勝利者");	continue;}
				
				
			
				//判斷勝利者，直線/橫線
				for(int ja=0;ja<3;ja++){
					for(int jy=0;jy<3;jy++){
						if(ground[ja][jy]!=0){
							if(ground[ja][jy]==player1){
								winner[ja]+=13;}
							if(ground[ja][jy]==player2){
								winner[ja]+=7;}
						}
						if(ground[jy][ja]!=0){
							if(ground[jy][ja]==player1){
								winner[ja+3]+=13;
								}
							if(ground[jy][ja]==player2){
								winner[ja+3]+=7;
								}
							}
						}
					}
				//判斷勝利者，斜線
				for(int ha=0;ha<3;ha++){		
							if(ground[ha][ha]==player1){winner[6]+=13;}
							if(ground[ha][ha]==player2){winner[6]+=7;}
							if(ground[2-ha][ha]==player1){winner[7]+=13;}
							if(ground[2-ha][ha]==player2){winner[7]+=7;}
						}
				for(int i :winner){
					switch(i){
					case 39:
						System.out.println("\n遊戲結束，Player1獲勝");
						ended=true;break;
					case 21:
						System.out.println("\n遊戲結束，Player2獲勝");
						ended=true;break;
					
					}
				}
				//讀出陣列元素順便初始化，邏輯檢查用
				for(int p=0;p<winner.length;p++){
//					下面那行是人類檢查用
//					System.out.println("winner 陣列 元素邊號 "+p+"  :"+ winner[p]);
					winner[p]=0;
					
				}
				

			} catch (Exception e) {
				e.printStackTrace(System.out);
				System.out.println("輸入錯誤請重新輸入");

			}

		}

	}

}
