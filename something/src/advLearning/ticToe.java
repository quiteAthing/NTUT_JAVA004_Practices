package advLearning;

import java.io.*;

public class ticToe {

	// ��Console�����e�e
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int player1 = 1, player2 = 2, notUsed = 0;
		int turnCounter = 0;
		int whoseTurn = 0;
		boolean ended = false;
		int[][] ground = new int[3][3];
		int recordMark=0;

		// ��l�ƹC�����A
		for (int all = 0; all < ground.length; all++) {
			for (int alt = 0; alt < ground[all].length; alt++) {
				ground[all][alt] = notUsed;
			}
		}

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		whoseTurn = (int) (Math.random() * 3);

		// �D�j��A�Ҧ��B�z���e���b�o��

		while (true) {
			try {
				System.out.println("��J����r���~��");
				bfr.readLine();

				//�i�ܹC����
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
					System.out.println("���s��l�ƹC��");
					for (int all = 0; all < ground.length; all++) {
						for (int alt = 0; alt < ground[all].length; alt++) {
							ground[all][alt] = notUsed;
						}
					}
					System.out.println("���s�M�w�֥��}�l");
					whoseTurn = (int) (Math.random() * 3);
					turnCounter = 0;
					ended = false;
				}

				if (turnCounter == 0) {
					System.out.println("\n �C���}�l�A��J�榡�� x�y��,�y��");
				} else {
					System.out.println("\n ��  " + turnCounter + " �^�X");
				}
				
				switch (whoseTurn) {
				case player1:
					System.out.println("\n ============Player 1 ���^�X==========");
					j = bfr.readLine();
					command = j.split(",");
					x = Integer.parseInt(command[0]);
					y = Integer.parseInt(command[1]);
					if (ground[x][y] == 0) {
						ground[x][y] = player1;
					} else {
						System.out.println("��m�w�Q���ڡA�Э��s��J");
						continue;
					}
					whoseTurn = player2;
					turnCounter += 1;
					break;
				case player2:
					System.out.println("\n ===========Player 2 ���^�X===========");
					j = bfr.readLine();
					command = j.split(",");
					x = Integer.parseInt(command[0]);
					y = Integer.parseInt(command[1]);
					if (ground[x][y] == 0) {
						ground[x][y] = player2;
					} else {
						System.out.println("��m�w�Q���ڡA�Э��s��J");
						continue;
					}
					whoseTurn = player1;
					turnCounter += 1;
					break;

				}
				// �i�ܲ{�p�����a��
				for (int all = 0; all < ground.length; all++) {
					System.out.println("");
					for (int alt = 0; alt < ground[all].length; alt++) {
						System.out.print("\t[" + ground[all][alt] + "]");
					}
				}

				// �ˬd�ӧQ�̡A���� ���B��B��
				int win = 0;
				for (int i = 0; i < 3; i++) {
					win = 0;
					for (int in = 0; in < 2; in++) {
						if (ground[i][in] == ground[i][in + 1] & ground[i][in] != notUsed
								& ground[i][in + 1] != notUsed) {
							win += 1;
							//System.out.println("��" + win);
							if (win >= 3) {
								switch (whoseTurn) {

								case player1:
									System.out.println("�C�������A Player2 �ӧQ");
									ended = true;
									continue;
								case player2:
									System.out.println("�C�������A Player1 �ӧQ");
									ended = true;
									continue;
								}
								continue;
							} else {
								System.out.println("�S���ӧQ�̡A�C���~��");
							}
						} else {
							win = 1;
						}
					}
				}
				win = 0;
				// �ˬd�ӧQ�� ��
				for (int i = 0; i < 3; i++) {
					win = 0;
					for (int in = 0; in < 2; in++) {
						if (ground[in][i] == ground[in + 1][i] & ground[in + 1][i] != notUsed
								& ground[in][i] != notUsed) {
							win += 1;
							//System.out.println("��" + win);
							if (win >= 2) {
								switch (whoseTurn) {

								case player1:
									System.out.println("�C�������A Player2 �ӧQ");
									ended = true;
									continue;
								case player2:
									System.out.println("�C�������A Player1 �ӧQ");
									ended = true;
									continue;
								}
								continue;
							} else {
								System.out.println("�S���ӧQ�̡A�C���~��");
							}
						} else {
							win = 0;
						}
					}
				}
				win = 0;
				// �ˬd�ӧQ�� ��

				for (int ex = -1; ex < 1; ex++) {
					if (ground[1 + ex][1 + ex] == ground[ex + 2][ex + 2] & ground[1 + ex][1 + ex] != notUsed
							& ground[ex + 2][ex + 2] != notUsed) {
						win += 1;
						if (win >= 2) {
							switch (whoseTurn) {

							case player1:
								System.out.println("�C�������A Player2 �ӧQ");
								ended = true;
								break;
							case player2:
								System.out.println("�C�������A Player1 �ӧQ");
								ended = true;
								break;
							}
							continue;
						} else {
							System.out.println("�S���ӧQ�̡A�C���~��");
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
								System.out.println("�C�������A Player2 �ӧQ");
								ended = true;
								continue;
							case player2:
								System.out.println("�C�������A Player1 �ӧQ");
								ended = true;
								continue;
							}
							continue;
						} else {
							System.out.println("�S���ӧQ�̡A�C���~��");
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
					System.out.println("�Ŧ�w���A�C�������A���襭��");
					ended=true;
					recordMark=0;
				}else{System.out.println("�Ŧ쥼���A�C���~��");}

			} catch (Exception e) {
				System.out.println(e);
				System.out.println("��J���~�Э��s��J");

			}

		}

	}

}
