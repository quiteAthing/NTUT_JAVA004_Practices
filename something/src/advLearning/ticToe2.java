package advLearning;

import java.io.*;

public class ticToe2 {

	// ��Console�����e�e
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int player1 = 1, player2 = 2, notUsed = 0;//��|�Ψ쪺�Ÿ��`�ƤơA�ε�ı�ơA�P�ɫŧi��final�קK���p�ߧ�D
		int turnCounter = 0;//�p��^�X��
		int whoseTurn = 0;//�����O�֪��^�X
		boolean ended = false;//�����C����������O�_�F��
		int[][] ground = new int[3][3];//�����C�����
		int place=0;//�ˬd�Ŷ��O�_�e����
		int[] 	winner = { 0,0,0,0,0,0,0,0};//�ˬd�U�C�O�_���s�u

		// ��l�ƹC�����A������Wnotused==0
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
				
				if (ended == true) {
//					System.out.println("���s��l�ƹC��");
					for(int i=0;i<winner.length;i++){
						winner[i]=0;
					}
					for (int all = 0; all < ground.length; all++) {
						for (int alt = 0; alt < ground[all].length; alt++) {
							ground[all][alt] = notUsed;
						}
					}
//					System.out.println("���s�M�w�֥��}�l");
					whoseTurn = (int) (Math.random() * 3);
					turnCounter = 0;
					ended = false;
				}
				
				
				System.out.println("\n��J����r���~��");
				bfr.readLine();

				// �i�ܹC����
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

				// �ˬd�Ŧ�O�_�w��
				place = 0;
				for (int i = 0; i < 3; i++) {
					for (int s = 0; s < 3; s++) {
						if (ground[i][s] != 0) {
							place += 1;
						}
					}
				}

				if (place >= 9) {ended = true;System.out.println("�Ŧ�w���A�C�������A�L�ӧQ��");	continue;}
				
				
			
				//�P�_�ӧQ�̡A���u/��u
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
				//�P�_�ӧQ�̡A�׽u
				for(int ha=0;ha<3;ha++){		
							if(ground[ha][ha]==player1){winner[6]+=13;}
							if(ground[ha][ha]==player2){winner[6]+=7;}
							if(ground[2-ha][ha]==player1){winner[7]+=13;}
							if(ground[2-ha][ha]==player2){winner[7]+=7;}
						}
				for(int i :winner){
					switch(i){
					case 39:
						System.out.println("\n�C�������APlayer1���");
						ended=true;break;
					case 21:
						System.out.println("\n�C�������APlayer2���");
						ended=true;break;
					
					}
				}
				//Ū�X�}�C�������K��l�ơA�޿��ˬd��
				for(int p=0;p<winner.length;p++){
//					�U������O�H���ˬd��
//					System.out.println("winner �}�C �����丹 "+p+"  :"+ winner[p]);
					winner[p]=0;
					
				}
				

			} catch (Exception e) {
				e.printStackTrace(System.out);
				System.out.println("��J���~�Э��s��J");

			}

		}

	}

}
