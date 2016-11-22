package advLearning;

import java.io.*;

public class ticToe {

	// 用Console玩圈圈叉叉
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int player1 = 1, player2 = 2, notUsed = 0;
		int turnCounter = 0;
		int whoseTurn = 0;
		boolean ended = false;
		int[][] ground = new int[3][3];
		int recordMark=0;

		// 初始化遊戲場，
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
				System.out.println("輸入任何字元繼續");
				bfr.readLine();

				//展示遊戲場
				for (int all = 0; all < ground.length; all++) {
					System.out.println("");
					for (int alt = 0; alt < ground[all].length; alt++) {
						System.out.print("\t[" + ground[all][alt] + "]");
					}
				}

				String j = "";
				String[] command = new String[2];
				int x, y;
				if (ended == true) {
					System.out.println("重新初始化遊戲");
					for (int all = 0; all < ground.length; all++) {
						for (int alt = 0; alt < ground[all].length; alt++) {
							ground[all][alt] = notUsed;
						}
					}
					System.out.println("重新決定誰先開始");
					whoseTurn = (int) (Math.random() * 3);
					turnCounter = 0;
					ended = false;
				}

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

				// 檢查勝利者，順序 直、橫、斜
				int win = 0;
				for (int i = 0; i < 3; i++) {
					win = 0;
					for (int in = 0; in < 2; in++) {
						if (ground[i][in] == ground[i][in + 1] & ground[i][in] != notUsed
								& ground[i][in + 1] != notUsed) {
							win += 1;
							//System.out.println("橫" + win);
							if (win >= 3) {
								switch (whoseTurn) {

								case player1:
									System.out.println("遊戲結束， Player2 勝利");
									ended = true;
									continue;
								case player2:
									System.out.println("遊戲結束， Player1 勝利");
									ended = true;
									continue;
								}
								continue;
							} else {
								System.out.println("沒有勝利者，遊戲繼續");
							}
						} else {
							win = 1;
						}
					}
				}
				win = 0;
				// 檢查勝利者 直
				for (int i = 0; i < 3; i++) {
					win = 0;
					for (int in = 0; in < 2; in++) {
						if (ground[in][i] == ground[in + 1][i] & ground[in + 1][i] != notUsed
								& ground[in][i] != notUsed) {
							win += 1;
							//System.out.println("直" + win);
							if (win >= 2) {
								switch (whoseTurn) {

								case player1:
									System.out.println("遊戲結束， Player2 勝利");
									ended = true;
									continue;
								case player2:
									System.out.println("遊戲結束， Player1 勝利");
									ended = true;
									continue;
								}
								continue;
							} else {
								System.out.println("沒有勝利者，遊戲繼續");
							}
						} else {
							win = 0;
						}
					}
				}
				win = 0;
				// 檢查勝利者 斜

				for (int ex = -1; ex < 1; ex++) {
					if (ground[1 + ex][1 + ex] == ground[ex + 2][ex + 2] & ground[1 + ex][1 + ex] != notUsed
							& ground[ex + 2][ex + 2] != notUsed) {
						win += 1;
						if (win >= 2) {
							switch (whoseTurn) {

							case player1:
								System.out.println("遊戲結束， Player2 勝利");
								ended = true;
								break;
							case player2:
								System.out.println("遊戲結束， Player1 勝利");
								ended = true;
								break;
							}
							continue;
						} else {
							System.out.println("沒有勝利者，遊戲繼續");
						}
					} else {
						win = 0;
					}
				}
				win = 0;
				for (int ex = -1; ex < 1; ex++) {

					if (ground[1 - ex][1 + ex] == ground[2 + ex][ex + 2] & ground[1 - ex][1 + ex] != notUsed
							& ground[2 + ex][ex + 2] != notUsed) {
						win += 1;
						if (win >= 2) {
							switch (whoseTurn) {

							case player1:
								System.out.println("遊戲結束， Player2 勝利");
								ended = true;
								continue;
							case player2:
								System.out.println("遊戲結束， Player1 勝利");
								ended = true;
								continue;
							}
							continue;
						} else {
							System.out.println("沒有勝利者，遊戲繼續");
						}
					} else {
						win = 0;
					}

				}
				
				recordMark=0;
				for(int[] i :ground){
					for(int io : i){
						if(io!=notUsed){
							recordMark+=1;
						}
						
					}
				}
				if(recordMark>=9){
					System.out.println("空位已滿，遊戲結束，雙方平手");
					ended=true;
					recordMark=0;
				}else{System.out.println("空位未滿，遊戲繼續");}

			} catch (Exception e) {
				System.out.println(e);
				System.out.println("輸入錯誤請重新輸入");

			}

		}

	}

}
