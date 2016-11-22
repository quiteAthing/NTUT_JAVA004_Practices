package guessingNum;

public abstract class cornerGameC implements cornerGame{
	//只增加quitOnInput方法的程式碼，其他方法繼續宣告為abstract
	@Override
	public void quitOnInput(){
		gNum.endGame();
	}

}
