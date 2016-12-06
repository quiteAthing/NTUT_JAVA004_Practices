package cardDispatch;


public class CardDispatcher {
	
	public static void main(String[] args){
		int n=2;
		int playerCount=7;
		int[][] players=new int[playerCount][(int)(CardDis.without_joker/playerCount)];
		int[] cardPile;
		//取得牌堆物件		
		CardDis cd=new CardDis();
		cardPile=cd.getCardstack(CardDis.without_joker);
		
		
		//將牌發給玩家，每次n張
		int counter=0;
		for(int w=0;w<playerCount;w++){
			for(int e=0;e<n;e++){
				players[w][e]=cardPile[counter];
						counter++;
			}
			
		}
		
		//把結果展示給使用者
		counter=0;
		int y=0;
		for(int[] s :players){
			y+=1;
			for(int k :s){
				if(k!=0){
				System.out.println("player "+ y +" 手牌  :"+ k);
				}
			}
			
		}
		

	}
	 
	 
	 
}
